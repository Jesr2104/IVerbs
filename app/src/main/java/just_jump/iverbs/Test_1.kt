package just_jump.iverbs

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.view.inputmethod.InputMethodManager
import android.widget.*
import just_jump.iverbs.Objetos_Creados.Class_Test_1
import kotlinx.android.synthetic.main.activity_test_1.*
import kotlinx.android.synthetic.main.content_test_1.*
import java.text.DecimalFormat
import just_jump.iverbs.Objetos_Creados.Class_Sonidos

class Test_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_1)
        setSupportActionBar(toolbar)

        //  Cargamos los datos con la lista de todos lo verbos a preguntar
        var Test: Class_Test_1 = Class_Test_1(this)
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

        //======================================================================//
        //  Linea de codigo para vizualizar el icono en la action bar
        //======================================================================//
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setLogo(R.drawable.logo)

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

            //Comprueba que no se han recorrido todos las preguntas del array test
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

        bcomprobar.setOnClickListener({

            val Campo: EditText = findViewById(R.id.camporespuesta)

            val dato = Campo.getText().toString()
            val dato2 = Test.ListPregunta[contador].getVerb().S_Palabra[Test.ListPregunta[contador].getTPreguntado()].toLowerCase()

            if (dato.toLowerCase().equals(dato2))
            {
                val text = "Muy Bien!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()

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
                contador ++
                Cargar_Pregunta()
            }
            else
            {
                if(camporespuesta.text.length > 0)
                {
                    // cambiar texto a variable traducible
                    val text = "La respuesta no es correcta!"
                    val duration = Toast.LENGTH_SHORT

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()

                    if(disabled_sound == false)
                    {
                        var time:Int = config_sonido.wrong_answer() as Int

                        var Manejador = Handler().postDelayed({
                            contador ++
                            Cargar_Pregunta()
                        }, time.toLong())
                    }
                    else
                    {
                        contador ++
                        Cargar_Pregunta()
                    }
                }
                else
                {
                    // cambiar texto a variable traducible
                    val text = "La respuesta esta vacia.."
                    val duration = Toast.LENGTH_SHORT

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }
            }
        })

        disabledsound.setOnClickListener ({

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
        })
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
