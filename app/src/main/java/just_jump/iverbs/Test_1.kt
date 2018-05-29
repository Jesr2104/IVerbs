package just_jump.iverbs

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.text.InputType
import android.view.View
import android.widget.*
import just_jump.iverbs.Objetos_Creados.Class_Test_1
import kotlinx.android.synthetic.main.activity_test_1.*
import kotlinx.android.synthetic.main.content_test_1.*
import java.text.DecimalFormat
import android.content.Context.INPUT_METHOD_SERVICE
import android.view.inputmethod.InputMethodManager


class Test_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_1)
        setSupportActionBar(toolbar)

        var disabled_sound: Boolean = false
        var Test: Class_Test_1 = Class_Test_1(this)
        val panelSonidos: LinearLayout = findViewById(R.id.sonidos)
        val CampoRest: EditText = findViewById(R.id.camporespuesta)
        val TextCambio1: TextView = findViewById(R.id.traduccion)
        val TextCambio2: TextView = findViewById(R.id.pregunta)
        val TextCambio3: TextView = findViewById(R.id.textporcentaje)
        val TextCambio4: TextView = findViewById(R.id.textnpregunta)
        var barraProgreso: ProgressBar = findViewById(R.id.progressBar3)
        var progress: Int = 0
        var porcentaje_progressbar: Float = 0.0f
        var contador: Int = 0

        /*Linea de codigo para vizualizar el icono en la action bar*/
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setLogo(R.drawable.logo)

        // Funcion que carga los datos de la pregunta que se va a realizar
        fun Cargar_Pregunta()
        {
            barraProgreso.progress = progress

            CampoRest.hint = "Respuesta..."
            //CampoRest.setInputType(InputType.TYPE_CLASS_TEXT)

            //******************************************************************************************
            // joder esta mierda no hace nada
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(CampoRest.getWindowToken(), 0)
            //******************************************************************************************

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
                    TextCambio2.setText("Cual es el infinitivo de este verbo?")
                }
                else if (Test.ListPregunta[contador].getTPreguntado() == 1)
                {
                    TextCambio2.setText("Cual es el pasado de este verbo?")
                }
                else if (Test.ListPregunta[contador].getTPreguntado() == 2)
                {
                    TextCambio2.setText("Cual es el pasado participio de este verbo?")
                }
            }
        }

        fun Actualizar_Progress()
        {
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

        // llamada a la funcion para que carge la primera pregunta de la lista de preguntas
        Cargar_Pregunta()

        // Inicializa la barra de porgresos a 0.00
        Actualizar_Progress()

        bcomprobar.setOnClickListener({

            var Campo: EditText = findViewById(R.id.camporespuesta)
            val dato = Campo.getText().toString()
            var dato2 = Test.ListPregunta[contador].getVerb().S_Palabra[Test.ListPregunta[contador].getTPreguntado()].toLowerCase()

            if (dato.toLowerCase().equals(dato2))
            {
                val text = "Muy Bien!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()

                contador ++
                Actualizar_Progress()
                Cargar_Pregunta()
                camporespuesta.setText("")
                //panelSonidos.setVisibility(View.VISIBLE)
            }
            else
            {
                val text = "La respuesta no es correcta!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
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
}
