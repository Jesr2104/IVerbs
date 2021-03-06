package just_jump.iverbs

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.text.Html
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import just_jump.iverbs.Objetos_Creados.*
import java.text.DecimalFormat
import kotlinx.android.synthetic.main.activity_test_1.*
import kotlinx.android.synthetic.main.content_test_1.*
import kotlinx.android.synthetic.main.infor_testcomplete.view.*

class Test_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_1)

        var mytoolB: Toolbar = findViewById(R.id.toolbar_2104)
        setSupportActionBar(mytoolB)

        //  Cargamos los datos con la lista de todos lo verbos a preguntar
        var Test: Class_GenerateTest = Class_GenerateTest(this)
        val CampoRest: EditText = findViewById(R.id.camporespuesta)
        val TextCambio1: TextView = findViewById(R.id.traduccion)
        val TextCambio2: TextView = findViewById(R.id.pregunta)
        val TextCambio3: TextView = findViewById(R.id.textporcentaje)
        val TextCambio4: TextView = findViewById(R.id.textnpregunta)
        var barraProgreso: ProgressBar = findViewById(R.id.progressBar3)
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        var config_sonido:Class_Sonidos = Class_Sonidos(this)
        var porcentaje_progressbar: Float = 0.0f
        var disabled_sound: Boolean = false
        var contador: Int = 0
        var progress: Int = 0
        var Tiempo_pregunta = -1
        var comprueba_test_Completo: Int = 0
        var temp:ArrayList<Contenedor_data> = ArrayList()

        fun Actualizar_Progress(){

            val formato = DecimalFormat("0.00")
            val valor_Pregunta: Float = (100 / Test.ListPregunta.size.toFloat())

            porcentaje_progressbar = (contador * valor_Pregunta).toFloat()
            progress = porcentaje_progressbar.toInt()
            TextCambio3.setText("${formato.format(porcentaje_progressbar)} %")

            //Falta por definir la palabra pregunta como una variable
            var Npregunta: Int = contador + 1
            if(Npregunta<=Test.ListPregunta.size)
            {
                TextCambio4.setText("Pregunta ${Npregunta} / ${Test.ListPregunta.size}")
            }
        }

        // Funcion que carga los datos de la pregunta que se va a realizar
        fun Cargar_Pregunta(){

            // cargo los datos de la barra de progreso para que se mantengan actualizado
            Actualizar_Progress()

            barraProgreso.progress = progress

            CampoRest.hint = getString(R.string.Respuesta)

            //Comprueba que se han recorrido todos las preguntas del array test por lo tanto el test ha finalizado
            if(contador<Test.ListPregunta.size)
            {
                // cargar la traduccion del verbo que se esta preguntando
                TextCambio1.setText(Html.fromHtml(Test.ListPregunta[contador].getVerb().S_Traduccion[0]))

                //Comproaba el tipo de pregunta que se va a cargar
                //  Si tipo de pregunta es == ?
                //  == 0 Pregunta el infinitivo del verbo
                //  == 1 Pregunta el pasado del verbo
                //  == 2 Pregunta el participio del verbo
                if (Test.ListPregunta[contador].getTPreguntado() == 0)
                {
                    TextCambio2.setText(getString(R.string.Pregunta_Infi))
                    Tiempo_pregunta = 0
                }
                else if (Test.ListPregunta[contador].getTPreguntado() == 1)
                {
                    TextCambio2.setText(getString(R.string.Pregunta_Pasado))
                    Tiempo_pregunta = 1
                }
                else if (Test.ListPregunta[contador].getTPreguntado() == 2)
                {
                    TextCambio2.setText(getString(R.string.Pregunta_PParticipio))
                    Tiempo_pregunta = 2
                }
            }
            camporespuesta.setText("")
            imm.hideSoftInputFromWindow(camporespuesta.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS)
        }

        //=========================================================================================//
        //      llamada a la funcion para que carge la primera pregunta de la lista de preguntas
        //=========================================================================================//
        Cargar_Pregunta()

        bcomprobar.setOnClickListener {

            if(Test.ListPregunta.size > comprueba_test_Completo)
            {
                val Campo: EditText = findViewById(R.id.camporespuesta)

                val dato = Campo.getText().toString().toLowerCase()
                val dato2 = Test.ListPregunta[contador].getVerb().S_Palabra[Test.ListPregunta[contador].getTPreguntado()].toLowerCase()
                var excepciones = false

                // Controlo las palabras que estan escritas en unas misma cadena de caracteres y para comprobarlos se hace difirente
                if(     dato2.contains("was")||
                        dato2.contains("were")||
                        dato2.contains("betted")||
                        dato2.contains("bet")||
                        dato2.contains("dreamed")||
                        dato2.contains("dreamt")||
                        dato2.contains("learned")||
                        dato2.contains("learnt"))
                {
                    excepciones = true
                }

                // cuando la respuesta es correcta
                if ((dato.equals(dato2)) || (excepciones)) {

                    val text = getString(R.string.MSN_correctaPregunta)
                    val duration = Toast.LENGTH_SHORT

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()

                    var verbTemp:Contenedor_data = Contenedor_data()
                    verbTemp.NVerb = dato2
                    verbTemp.Numero = 0
                    verbTemp.Tiempo = Tiempo_pregunta

                    temp.add(verbTemp)


                    if(disabled_sound == false)
                    {
                        if (Tiempo_pregunta == 0)
                        {
                            config_sonido.present(Test.ListPregunta[contador].getVerb().S_Palabra[0])
                        }
                        else if(Tiempo_pregunta == 1)
                        {
                            config_sonido.past(Test.ListPregunta[contador].getVerb().S_Palabra[0])
                        }
                        else if (Tiempo_pregunta == 2)
                        {
                            config_sonido.participle(Test.ListPregunta[contador].getVerb().S_Palabra[0])
                        }
                    }
                    contador += 1
                    Cargar_Pregunta()
                    comprueba_test_Completo+= 1
                }
                //cuando la respuesta es incorrecta o esta vacia
                else{

                    val text_palabrasCorrecta = Test.ListPregunta[contador].getVerb().S_Palabra[Test.ListPregunta[contador].getTPreguntado()]
                    val duration = Toast.LENGTH_LONG

                    if(camporespuesta.text.length > 0)
                    {
                        // cambiar texto a variable traducible
                        val text = getString(R.string.MSN_PreguntaIncorrecta)
                        val duration = Toast.LENGTH_SHORT

                        val toast = Toast.makeText(applicationContext, text, duration)
                        toast.show()

                        val toast1 = Toast.makeText(applicationContext, text_palabrasCorrecta, duration)
                        toast1.show()

                        // si la pregunta no es correcta entonce agrego dos pregunta una
                        // aleatorial y la pregunta que se ha fallado
                        //--------------------------------------------------------------------------
                        Test.ListPregunta.add(Test.ListPregunta[contador])
                        Test.ListPregunta.add(Test.getNewpregunta())
                        //--------------------------------------------------------------------------

                        var verbTemp:Contenedor_data = Contenedor_data()
                        verbTemp.NVerb = dato2
                        verbTemp.Numero = 1
                        verbTemp.Tiempo = Tiempo_pregunta

                        temp.add(verbTemp)

                        if(disabled_sound == false)
                        {
                            var time:Int = config_sonido.wrong_answer() as Int

                            var Manejador = Handler().postDelayed({
                                contador += 1
                                Cargar_Pregunta()
                            }, time.toLong())
                        }
                        else
                        {
                            contador += 1
                            Cargar_Pregunta()
                        }
                        comprueba_test_Completo+= 1
                    }
                    else
                    {
                        // cambiar texto a variable traducible
                        val text = getString(R.string.MSN_RespuestaVacia)
                        val duration = Toast.LENGTH_SHORT

                        val toast = Toast.makeText(applicationContext, text, duration)
                        toast.show()
                    }
                }

                // cuando el test ha sido terminado
                if(comprueba_test_Completo == Test.ListPregunta.size)
                {
                    val text = getString(R.string.MSN_FinalPrueba)
                    val duration = Toast.LENGTH_SHORT

                    var statistics_object:Class_Statistics

                    // objeto para poder crear la serializacion del objeto estadistica en memoria
                    val tools_Save_Load: Class_SL_Data = Class_SL_Data(this)

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()

                    // cargar el objetos estadisticas
                    statistics_object = tools_Save_Load.Data_Load()

                    // Actualizar
                    statistics_object.actualizar(temp)

                    // serializa el objeto estadistica una ves actializado
                    tools_Save_Load.Data_Save(statistics_object)

                    val dialog = AlertDialog.Builder(this)
                    val dialogView = layoutInflater.inflate(R.layout.infor_testcomplete,null)

                    var aciertos:Int = 0
                    var fallos:Int = 0
                    var numeroPreguntas:Int = temp.size

                    val lista_datos:ArrayList<String> = ArrayList()

                    for(item in temp)
                    {
                        if(item.Numero == 1)
                        {
                            fallos ++

                            if(item.Tiempo == 0)
                                lista_datos.add(item.NVerb + "  -> Infinitive")
                            if(item.Tiempo == 1)
                                lista_datos.add(item.NVerb + "  -> Past")
                            if(item.Tiempo == 2)
                                lista_datos.add(item.NVerb + "  -> Participle ")
                        }
                        else if(item.Numero == 0)
                        {
                            aciertos ++
                        }
                    }

                    var N:Float = aciertos.toFloat() / numeroPreguntas.toFloat()
                    var porcentajeAciertos = (N*100).toInt()

                    dialogView.numeroaciertos.text = "${aciertos}"
                    dialogView.numerofallos.text = "${fallos}"
                    dialogView.numeronpreguntas.text = "${numeroPreguntas}"
                    dialogView.numeroporcentajeacierto.text = "${porcentajeAciertos} %"

                    val adapter = Class_AdaptadorCFallos(this,lista_datos)

                    if(fallos == 0)
                    {
                        dialogView.textlistwrongword.setVisibility(View.GONE)
                        dialogView.listwrongword.setVisibility(View.GONE)
                    }

                    dialogView.listwrongword.adapter = adapter
                    dialog.setView(dialogView)
                    dialog.setCancelable(false)
                    dialog.show()

                    dialogView.buttonexit.setOnClickListener {
                        finish()
                    }
                }
            }
            else
            {
                // cuando se precione el boton comprobar pero la prueba ha terminado!!!
            }
        }

        disabledsound.setOnClickListener {

            if (disabled_sound)
            {
                disabled_sound = false
                disabledsound.setImageResource(R.drawable.song)
            }
            else
            {
                disabled_sound = true
                disabledsound.setImageResource(R.drawable.corneta_prohibido)
            }
        }
    }
    override fun onBackPressed() {

        val mensaje = AlertDialog.Builder(this)

        mensaje.setTitle(getString(R.string.mensaje_salir_test))
        mensaje.setCancelable(false)
        mensaje.setPositiveButton(getString(R.string.text_aceptar)) { dialog, which -> finish() }
        mensaje.setNegativeButton(getString(R.string.text_cancelar)) { dialog, which -> }
        mensaje.show()
    }
}
