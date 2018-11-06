package just_jump.iverbs

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.Toolbar
import android.text.Html
import android.widget.TextView
import just_jump.iverbs.Objetos_Creados.Class_IVerb
import just_jump.iverbs.Objetos_Creados.Class_Sonidos
import kotlinx.android.synthetic.main.activity_infor_verbs.*

class InforVerbs : AppCompatActivity(){

    var repro: MediaPlayer = MediaPlayer()
    var config_sonidos:Class_Sonidos = Class_Sonidos(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infor_verbs)

        var mytoolB: Toolbar = findViewById(R.id.toolbar_2104)
        setSupportActionBar(mytoolB)

        var VerboInfo: Class_IVerb = getIntent().getExtras().getSerializable("VerboInfo") as Class_IVerb

        var TextCambio1: TextView = findViewById(R.id.TextTraduccion)
        var TextCambio2: TextView = findViewById(R.id.TextTitleVerb)
        var TextCambio3: TextView = findViewById(R.id.TextPresent)
        var TextCambio4: TextView = findViewById(R.id.TextPast)
        var TextCambio5: TextView = findViewById(R.id.TextPastParticiple)

        var EjePresent: TextView = findViewById(R.id.EjePresent)
        var EjePast: TextView = findViewById(R.id.EjePast)
        var EjePastP: TextView = findViewById(R.id.EjePastP)

        TextCambio1.setText(Html.fromHtml("${VerboInfo.S_Traduccion[0]}"))
        TextCambio2.setText("${VerboInfo.S_Palabra[0]}")
        TextCambio3.setText("${VerboInfo.S_Palabra[0]}")
        TextCambio4.setText("${VerboInfo.S_Palabra[1]}")
        TextCambio5.setText("${VerboInfo.S_Palabra[2]}")

        EjePresent.setText(Html.fromHtml(resaltartext(VerboInfo.S_Palabra[0],VerboInfo.S_EjemplosPresent)))
        EjePast.setText(Html.fromHtml(resaltartext(VerboInfo.S_Palabra[1],VerboInfo.S_EjemplosPast)))
        EjePastP.setText(Html.fromHtml(resaltartext(VerboInfo.S_Palabra[2],VerboInfo.S_EjemplosPastParticiple)))

        /*=====================================================================*/
        /*      Present event                                                  */
        /*=====================================================================*/
        BotonSongPresent.setOnClickListener({

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = config_sonidos.present(VerboInfo.S_Palabra[0]) as Int
            BotonSongPresent.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPresent.setImageResource(R.drawable.song)
            }, time.toLong())

        })
        //======================================================================//
        //======================================================================//

        BotonSongPresentEjemplo.setOnClickListener {

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = config_sonidos.present_eg(VerboInfo.S_Palabra[0]) as Int
            BotonSongPresentEjemplo.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPresentEjemplo.setImageResource(R.drawable.song)
            }, time.toLong())
        }

        /*=====================================================================*/
        /*      Past event                                                     */
        /*=====================================================================*/
        BotonSongPast.setOnClickListener {

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = config_sonidos.past(VerboInfo.S_Palabra[0]) as Int
            BotonSongPast.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPast.setImageResource(R.drawable.song)
            }, time.toLong())
        }
        //======================================================================//
        //======================================================================//
        BotonSongPastEjemplo.setOnClickListener({

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = config_sonidos.past_eg(VerboInfo.S_Palabra[0]) as Int
            BotonSongPastEjemplo.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPastEjemplo.setImageResource(R.drawable.song)
            }, time.toLong())
        })

        /*=====================================================================*/
        /*      Past participle event                                          */
        /*=====================================================================*/
        BotonSongPastP.setOnClickListener({

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = config_sonidos.participle(VerboInfo.S_Palabra[0]) as Int
            BotonSongPastP.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPastP.setImageResource(R.drawable.song)
            }, time.toLong())
        })
        //======================================================================//
        //======================================================================//
        BotonSongPastPEjemplo.setOnClickListener({

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = config_sonidos.participle_eg(VerboInfo.S_Palabra[0]) as Int
            BotonSongPastPEjemplo.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPastPEjemplo.setImageResource(R.drawable.song)
            }, time.toLong())
        })
    }

    fun resaltartext(word:String,text:String):String
    {
        var tagini = "<u><font color=#ec8e1d>"
        var tagfin = "</font></u>"
        var result = ""

        if(word.indexOf("/")>-1)
        {
            var verbs = word.split("/")
            if (text.toUpperCase().indexOf(verbs[0].toUpperCase())>-1)
            {
                var indicesub = text.toUpperCase().indexOf(verbs[0].toUpperCase())
                if(indicesub > -1)
                {
                    result = text.substring(0,indicesub )
                    result += tagini
                    result += text.substring(indicesub,indicesub+verbs[0].length)
                    result += tagfin
                    result += text.substring(indicesub + verbs[0].length,text.length)
                }
            }
            else if(text.toUpperCase().indexOf(verbs[1].toUpperCase())>-1)
            {
                var indicesub = text.toUpperCase().indexOf(verbs[1].toUpperCase())
                if(indicesub > -1)
                {
                    result = text.substring(0,indicesub )
                    result += tagini
                    result += text.substring(indicesub,indicesub+verbs[0].length)
                    result += tagfin
                    result += text.substring(indicesub + verbs[1].length,text.length)
                }
            }
        }
        else
        {
            var indicesub = text.toUpperCase().indexOf(word.toUpperCase())
            if(indicesub > -1)
            {
                result = text.substring(0,indicesub )
                result += tagini
                result += text.substring(indicesub,indicesub+word.length)
                result += tagfin
                result += text.substring(indicesub + word.length,text.length)
            }
        }
        return result
    }
}