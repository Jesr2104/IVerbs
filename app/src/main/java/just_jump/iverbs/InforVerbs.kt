package just_jump.iverbs

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.widget.TextView
import just_jump.iverbs.Objetos_Creados.Class_IVerb
import kotlinx.android.synthetic.main.activity_infor_verbs.*

class InforVerbs : AppCompatActivity(){

    var repro: MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infor_verbs)

        /*Linea de codigo para vizualizar el icono en la action bar*/
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setLogo(R.drawable.logo)

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

            when(VerboInfo.S_Palabra[0]) {

                "Arise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.arise)
                    repro!!.start()
                }
                "Wake" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wake)
                    repro!!.start()
                }
                "Be" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.be)
                    repro!!.start()
                }
                "Beat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.beat)
                    repro!!.start()
                }
                "Become" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.become)
                    repro!!.start()
                }
                "Begin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.begin)
                    repro!!.start()
                }
                "Bet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bet)
                    repro!!.start()
                }
                "Bite" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bite)
                    repro!!.start()
                }
                "Bleed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bleed)
                    repro!!.start()
                }
                "Blow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.blow)
                    repro!!.start()
                }
                "Break" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.break0)
                    repro!!.start()
                }
                "Breed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.breed)
                    repro!!.start()
                }
                "Bring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bring)
                    repro!!.start()
                }
                "Build" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.build)
                    repro!!.start()
                }
                "Burn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.burn)
                    repro!!.start()
                }
                "Buy" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.buy)
                    repro!!.start()
                }
                "Catch" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.catch0)
                    repro!!.start()
                }
                "Choose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.choose)
                    repro!!.start()
                }
                "Come" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.come)
                    repro!!.start()
                }
                "Cost" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cost)
                    repro!!.start()
                }
                "Cut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cut)
                    repro!!.start()
                }
                "Deal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.deal)
                    repro!!.start()
                }
                "Dig" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dig)
                    repro!!.start()
                }
                "Do" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.do0)
                    repro!!.start()
                }
                "Draw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.draw)
                    repro!!.start()
                }
                "Dream" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dream)
                    repro!!.start()
                }
                "Drink" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drink)
                    repro!!.start()
                }
                "Drive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drive)
                    repro!!.start()
                }
                "Eat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.eat)
                    repro!!.start()
                }
                "Fall" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fall)
                    repro!!.start()
                }
                "Feed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.feed)
                    repro!!.start()
                }
                "Feel" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.feel)
                    repro!!.start()
                }
                "Fight" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fight)
                    repro!!.start()
                }
                "Find" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.find)
                    repro!!.start()
                }
                "Fly" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fly)
                    repro!!.start()
                }
                "Forbid" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forbid)
                    repro!!.start()
                }
                "Forget" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forget)
                    repro!!.start()
                }
                "Forgive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgive)
                    repro!!.start()
                }
                "Freeze" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.freeze)
                    repro!!.start()
                }
                "Get" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.get)
                    repro!!.start()
                }
                "Give" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.give)
                    repro!!.start()
                }
                "Go" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.go)
                    repro!!.start()
                }
                "Grind" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grind)
                    repro!!.start()
                }
                "Grow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grow)
                    repro!!.start()
                }
                "Have" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.have)
                    repro!!.start()
                }
                "Hear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hear)
                    repro!!.start()
                }
                "Hide" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hide)
                    repro!!.start()
                }
                "Hit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hit)
                    repro!!.start()
                }
                "Hold" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hold)
                    repro!!.start()
                }
                "Hurt" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hurt)
                    repro!!.start()
                }
                "Keep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.keep)
                    repro!!.start()
                }
                "Know" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.know)
                    repro!!.start()
                }
                "learn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.learn)
                    repro!!.start()
                }
                "Leave" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.leave)
                    repro!!.start()
                }
                "Let" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.let)
                    repro!!.start()
                }
                "Lose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.lose)
                    repro!!.start()
                }
                "Make" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.make)
                    repro!!.start()
                }
                "Mean" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.mean)
                    repro!!.start()
                }
                "Meet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.meet)
                    repro!!.start()
                }
                "Pay" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.pay)
                    repro!!.start()
                }
                "Put" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.put)
                    repro!!.start()
                }
                "Read" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.read)
                    repro!!.start()
                }
                "Ride" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ride)
                    repro!!.start()
                }
                "Ring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ring)
                    repro!!.start()
                }
                "Rise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rise)
                    repro!!.start()
                }
                "Run" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.run)
                    repro!!.start()
                }
                "Say" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.say)
                    repro!!.start()
                }
                "See" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.see)
                    repro!!.start()
                }
                "Sell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sell)
                    repro!!.start()
                }
                "Send" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.send)
                    repro!!.start()
                }
                "Set" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.set)
                    repro!!.start()
                }
                "Shine" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shine)
                    repro!!.start()
                }
                "Shoot" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shoot)
                    repro!!.start()
                }
                "Show" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.show)
                    repro!!.start()
                }
                "Shut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shut)
                    repro!!.start()
                }
                "Sing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sing)
                    repro!!.start()
                }
                "Sit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sit)
                    repro!!.start()
                }
                "Sleep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sleep)
                    repro!!.start()
                }
                "Speak" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.speak)
                    repro!!.start()
                }
                "Spell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spell)
                    repro!!.start()
                }
                "Spend" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spend)
                    repro!!.start()
                }
                "Stand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stand)
                    repro!!.start()
                }
                "Steal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.steal)
                    repro!!.start()
                }
                "Stick" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stick)
                    repro!!.start()
                }
                "Swmin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swim)
                    repro!!.start()
                }
                "Swing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swing)
                    repro!!.start()
                }
                "Take" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.take)
                    repro!!.start()
                }
                "Teach" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.teach)
                    repro!!.start()
                }
                "Tell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.tell)
                    repro!!.start()
                }
                "Think" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.think)
                    repro!!.start()
                }
                "Throw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.throw0)
                    repro!!.start()
                }
                "Understand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.understand)
                    repro!!.start()
                }
                "Wear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wear)
                    repro!!.start()
                }
                "Win" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.win)
                    repro!!.start()
                }
                "Wring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wring)
                    repro!!.start()
                }
                "Write" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.write)
                    repro!!.start()
                }
            }

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = repro.duration + 50
            BotonSongPresent.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPresent.setImageResource(R.drawable.song)
            }, time.toLong())

        })
        //======================================================================//
        //======================================================================//
        BotonSongPresentEjemplo.setOnClickListener({

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            when(VerboInfo.S_Palabra[0]) {

                "Arise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.arise_eg)
                    repro!!.start()
                }
                "Wake" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wake_eg)
                    repro!!.start()
                }
                "Be" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.be_eg)
                    repro!!.start()
                }
                "Beat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.beat_eg)
                    repro!!.start()
                }
                "Become" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.become_eg)
                    repro!!.start()
                }
                "Begin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.begin_eg)
                    repro!!.start()
                }
                "Bet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bet_eg)
                    repro!!.start()
                }
                "Bite" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bite_eg)
                    repro!!.start()
                }
                "Bleed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bleed_eg)
                    repro!!.start()
                }
                "Blow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.blow_eg)
                    repro!!.start()
                }
                "Break" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.break_eg)
                    repro!!.start()
                }
                "Breed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.breed_eg)
                    repro!!.start()
                }
                "Bring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bring_eg)
                    repro!!.start()
                }
                "Build" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.build_eg)
                    repro!!.start()
                }
                "Burn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.burn_eg)
                    repro!!.start()
                }
                "Buy" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.buy_eg)
                    repro!!.start()
                }
                "Catch" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.catch_eg)
                    repro!!.start()
                }
                "Choose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.choose_eg)
                    repro!!.start()
                }
                "Come" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.come_eg)
                    repro!!.start()
                }
                "Cost" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cost_eg)
                    repro!!.start()
                }
                "Cut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cut_eg)
                    repro!!.start()
                }
                "Deal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.deal_eg)
                    repro!!.start()
                }
                "Dig" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dig_eg)
                    repro!!.start()
                }
                "Do" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.do_eg)
                    repro!!.start()
                }
                "Draw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.draw_eg)
                    repro!!.start()
                }
                "Dream" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dream_eg)
                    repro!!.start()
                }
                "Drink" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drink_eg)
                    repro!!.start()
                }
                "Drive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drive_eg)
                    repro!!.start()
                }
                "Eat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.eat_eg)
                    repro!!.start()
                }
                "Fall" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fall_eg)
                    repro!!.start()
                }
                "Feed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.feed_eg)
                    repro!!.start()
                }
                "Feel" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.feel_eg)
                    repro!!.start()
                }
                "Fight" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fight_eg)
                    repro!!.start()
                }
                "Find" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.find_eg)
                    repro!!.start()
                }
                "Fly" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fly_eg)
                    repro!!.start()
                }
                "Forbid" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forbid_eg)
                    repro!!.start()
                }
                "Forget" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forget_eg)
                    repro!!.start()
                }
                "Forgive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgive_eg)
                    repro!!.start()
                }
                "Freeze" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.freeze_eg)
                    repro!!.start()
                }
                "Get" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.get_eg)
                    repro!!.start()
                }
                "Give" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.give_eg)
                    repro!!.start()
                }
                "Go" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.go_eg)
                    repro!!.start()
                }
                "Grind" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grind_eg)
                    repro!!.start()
                }
                "Grow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grow_eg)
                    repro!!.start()
                }
                "Have" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.have_eg)
                    repro!!.start()
                }
                "Hear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hear_eg)
                    repro!!.start()
                }
                "Hide" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hide_eg)
                    repro!!.start()
                }
                "Hit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hit_eg)
                    repro!!.start()
                }
                "Hold" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hold_eg)
                    repro!!.start()
                }
                "Hurt" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hurt_eg)
                    repro!!.start()
                }
                "Keep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.keep_eg)
                    repro!!.start()
                }
                "Know" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.know_eg)
                    repro!!.start()
                }
                "learn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.learn_eg)
                    repro!!.start()
                }
                "Leave" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.leave_eg)
                    repro!!.start()
                }
                "Let" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.let_eg)
                    repro!!.start()
                }
                "Lose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.lose_eg)
                    repro!!.start()
                }
                "Make" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.make_eg)
                    repro!!.start()
                }
                "Mean" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.mean_eg)
                    repro!!.start()
                }
                "Meet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.meet_eg)
                    repro!!.start()
                }
                "Pay" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.pay_eg)
                    repro!!.start()
                }
                "Put" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.put_eg)
                    repro!!.start()
                }
                "Read" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.read_eg)
                    repro!!.start()
                }
                "Ride" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ride_eg)
                    repro!!.start()
                }
                "Ring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ring_eg)
                    repro!!.start()
                }
                "Rise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rise_eg)
                    repro!!.start()
                }
                "Run" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.run_eg)
                    repro!!.start()
                }
                "Say" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.say_eg)
                    repro!!.start()
                }
                "See" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.see_eg)
                    repro!!.start()
                }
                "Sell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sell_eg)
                    repro!!.start()
                }
                "Send" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.send_eg)
                    repro!!.start()
                }
                "Set" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.set_eg)
                    repro!!.start()
                }
                "Shine" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shine_eg)
                    repro!!.start()
                }
                "Shoot" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shoot_eg)
                    repro!!.start()
                }
                "Show" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.show_eg)
                    repro!!.start()
                }
                "Shut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shut_eg)
                    repro!!.start()
                }
                "Sing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sing_eg)
                    repro!!.start()
                }
                "Sit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sit_eg)
                    repro!!.start()
                }
                "Sleep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sleep_eg)
                    repro!!.start()
                }
                "Speak" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.speak_eg)
                    repro!!.start()
                }
                "Spell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spell_eg)
                    repro!!.start()
                }
                "Spend" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spend_eg)
                    repro!!.start()
                }
                "Stand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stand_eg)
                    repro!!.start()
                }
                "Steal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.steal_eg)
                    repro!!.start()
                }
                "Stick" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stick_eg)
                    repro!!.start()
                }
                "Swmin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swim_eg)
                    repro!!.start()
                }
                "Swing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swing_eg)
                    repro!!.start()
                }
                "Take" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.take_eg)
                    repro!!.start()
                }
                "Teach" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.teach_eg)
                    repro!!.start()
                }
                "Tell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.tell_eg)
                    repro!!.start()
                }
                "Think" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.think_eg)
                    repro!!.start()
                }
                "Throw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.throw_eg)
                    repro!!.start()
                }
                "Understand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.understand_eg)
                    repro!!.start()
                }
                "Wear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wear_eg)
                    repro!!.start()
                }
                "Win" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.win_eg)
                    repro!!.start()
                }
                "Wring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wring_eg)
                    repro!!.start()
                }
                "Write" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.write_eg)
                    repro!!.start()
                }
            }

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = repro.duration + 50
            BotonSongPresentEjemplo.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPresentEjemplo.setImageResource(R.drawable.song)
            }, time.toLong())
        })

        /*=====================================================================*/
        /*      Past event                                                     */
        /*=====================================================================*/
        BotonSongPast.setOnClickListener({

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            when(VerboInfo.S_Palabra[0]) {
                "Arise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.arose)
                    repro!!.start()
                }
                "Wake" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.woke)
                    repro!!.start()
                }
                "Be" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.was0were)
                    repro!!.start()
                }
                "Beat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.beat)
                    repro!!.start()
                }
                "Become" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.became)
                    repro!!.start()
                }
                "Begin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.began)
                    repro!!.start()
                }
                "Bet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bet0betted)
                    repro!!.start()
                }
                "Bite" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bit)
                    repro!!.start()
                }
                "Bleed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bled)
                    repro!!.start()
                }
                "Blow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.blew)
                    repro!!.start()
                }
                "Break" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.broke)
                    repro!!.start()
                }
                "Breed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bred)
                    repro!!.start()
                }
                "Bring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.brought)
                    repro!!.start()
                }
                "Build" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.built)
                    repro!!.start()
                }
                "Burn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.burned0burnt)
                    repro!!.start()
                }
                "Buy" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bought)
                    repro!!.start()
                }
                "Catch" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.caught)
                    repro!!.start()
                }
                "Choose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.chose)
                    repro!!.start()
                }
                "Come" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.came)
                    repro!!.start()
                }
                "Cost" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cost)
                    repro!!.start()
                }
                "Cut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cut)
                    repro!!.start()
                }
                "Deal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dealt)
                    repro!!.start()
                }
                "Dig" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dug)
                    repro!!.start()
                }
                "Do" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.did)
                    repro!!.start()
                }
                "Draw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drew)
                    repro!!.start()
                }
                "Dream" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dreamed0dreamt)
                    repro!!.start()
                }
                "Drink" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drank)
                    repro!!.start()
                }
                "Drive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drove)
                    repro!!.start()
                }
                "Eat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ate)
                    repro!!.start()
                }
                "Fall" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fell)
                    repro!!.start()
                }
                "Feed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fed)
                    repro!!.start()
                }
                "Feel" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.felt)
                    repro!!.start()
                }
                "Fight" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fought)
                    repro!!.start()
                }
                "Find" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.found)
                    repro!!.start()
                }
                "Fly" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.flew)
                    repro!!.start()
                }
                "Forbid" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forbade)
                    repro!!.start()
                }
                "Forget" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgot)
                    repro!!.start()
                }
                "Forgive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgave)
                    repro!!.start()
                }
                "Freeze" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.froze)
                    repro!!.start()
                }
                "Get" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.got)
                    repro!!.start()
                }
                "Give" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.gave)
                    repro!!.start()
                }
                "Go" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.went)
                    repro!!.start()
                }
                "Grind" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ground)
                    repro!!.start()
                }
                "Grow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grew)
                    repro!!.start()
                }
                "Have" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.had)
                    repro!!.start()
                }
                "Hear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.heard)
                    repro!!.start()
                }
                "Hide" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hid)
                    repro!!.start()
                }
                "Hit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hit)
                    repro!!.start()
                }
                "Hold" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.held)
                    repro!!.start()
                }
                "Hurt" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hurt)
                    repro!!.start()
                }
                "Keep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.kept)
                    repro!!.start()
                }
                "Know" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.knew)
                    repro!!.start()
                }
                "learn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.learned0learnt)
                    repro!!.start()
                }
                "Leave" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.left)
                    repro!!.start()
                }
                "Let" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.let)
                    repro!!.start()
                }
                "Lose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.lost)
                    repro!!.start()
                }
                "Make" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.made)
                    repro!!.start()
                }
                "Mean" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.meant)
                    repro!!.start()
                }
                "Meet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.met)
                    repro!!.start()
                }
                "Pay" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.paid)
                    repro!!.start()
                }
                "Put" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.put)
                    repro!!.start()
                }
                "Read" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.read0past)
                    repro!!.start()
                }
                "Ride" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rode)
                    repro!!.start()
                }
                "Ring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rang)
                    repro!!.start()
                }
                "Rise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rose)
                    repro!!.start()
                }
                "Run" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ran)
                    repro!!.start()
                }
                "Say" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.said)
                    repro!!.start()
                }
                "See" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.saw)
                    repro!!.start()
                }
                "Sell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sold)
                    repro!!.start()
                }
                "Send" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sent)
                    repro!!.start()
                }
                "Set" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.set)
                    repro!!.start()
                }
                "Shine" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shone)
                    repro!!.start()
                }
                "Shoot" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shot)
                    repro!!.start()
                }
                "Show" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.showed)
                    repro!!.start()
                }
                "Shut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shut)
                    repro!!.start()
                }
                "Sing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sang)
                    repro!!.start()
                }
                "Sit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sat)
                    repro!!.start()
                }
                "Sleep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.slept)
                    repro!!.start()
                }
                "Speak" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spoke)
                    repro!!.start()
                }
                "Spell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spelt)
                    repro!!.start()
                }
                "Spend" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spent)
                    repro!!.start()
                }
                "Stand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stood)
                    repro!!.start()
                }
                "Steal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stole)
                    repro!!.start()
                }
                "Stick" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stuck)
                    repro!!.start()
                }
                "Swmin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swam)
                    repro!!.start()
                }
                "Swing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swung)
                    repro!!.start()
                }
                "Take" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.took)
                    repro!!.start()
                }
                "Teach" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.taught)
                    repro!!.start()
                }
                "Tell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.told)
                    repro!!.start()
                }
                "Think" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.thought)
                    repro!!.start()
                }
                "Throw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.threw)
                    repro!!.start()
                }
                "Understand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.understood)
                    repro!!.start()
                }
                "Wear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wore)
                    repro!!.start()
                }
                "Win" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.won)
                    repro!!.start()
                }
                "Wring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wrung)
                    repro!!.start()
                }
                "Write" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wrote)
                    repro!!.start()
                }
            }

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = repro.duration + 50
            BotonSongPast.setImageResource(R.drawable.play)
            var Manejador = Handler().postDelayed({
                BotonSongPast.setImageResource(R.drawable.song)
            }, time.toLong())
        })
        //======================================================================//
        //======================================================================//
        BotonSongPastEjemplo.setOnClickListener({

            //Variable para calcular el tiempo de reproduccion
            var time:Int = 0

            when(VerboInfo.S_Palabra[0]) {

                "Arise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.arose_eg)
                    repro!!.start()
                }
                "Wake" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.woke_eg)
                    repro!!.start()
                }
                "Be" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.was0were_eg)
                    repro!!.start()
                }
                "Beat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.beatpast_eg)
                    repro!!.start()
                }
                "Become" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.became_eg)
                    repro!!.start()
                }
                "Begin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.began_eg)
                    repro!!.start()
                }
                "Bet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.betpast_eg)
                    repro!!.start()
                }
                "Bite" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bit_eg)
                    repro!!.start()
                }
                "Bleed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bledpast_eg)
                    repro!!.start()
                }
                "Blow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.blew_eg)
                    repro!!.start()
                }
                "Break" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.broke_eg)
                    repro!!.start()
                }
                "Breed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bredpast_eg)
                    repro!!.start()
                }
                "Bring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.broughtpast_eg)
                    repro!!.start()
                }
                "Build" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.builtpast_eg)
                    repro!!.start()
                }
                "Burn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.burntpast_eg)
                    repro!!.start()
                }
                "Buy" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.boughtpast_eg)
                    repro!!.start()
                }
                "Catch" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.caughtpast_eg)
                    repro!!.start()
                }
                "Choose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.chose_eg)
                    repro!!.start()
                }
                "Come" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.came_eg)
                    repro!!.start()
                }
                "Cost" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.costpast_eg)
                    repro!!.start()
                }
                "Cut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cutpast_eg)
                    repro!!.start()
                }
                "Deal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dealtpast_eg)
                    repro!!.start()
                }
                "Dig" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dugpast_eg)
                    repro!!.start()
                }
                "Do" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.did_eg)
                    repro!!.start()
                }
                "Draw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drew_eg)
                    repro!!.start()
                }
                "Dream" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dreamtpast_eg)
                    repro!!.start()
                }
                "Drink" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drank_eg)
                    repro!!.start()
                }
                "Drive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drove_eg)
                    repro!!.start()
                }
                "Eat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ate_eg)
                    repro!!.start()
                }
                "Fall" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fell_eg)
                    repro!!.start()
                }
                "Feed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fedpast_eg)
                    repro!!.start()
                }
                "Feel" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.feltpast_eg)
                    repro!!.start()
                }
                "Fight" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.foughtpast_eg)
                    repro!!.start()
                }
                "Find" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.foundpast_eg)
                    repro!!.start()
                }
                "Fly" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.flew_eg)
                    repro!!.start()
                }
                "Forbid" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forbade_eg)
                    repro!!.start()
                }
                "Forget" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgot_eg)
                    repro!!.start()
                }
                "Forgive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgave_eg)
                    repro!!.start()
                }
                "Freeze" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.froze_eg)
                    repro!!.start()
                }
                "Get" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.got_eg)
                    repro!!.start()
                }
                "Give" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.gave_eg)
                    repro!!.start()
                }
                "Go" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.went_eg)
                    repro!!.start()
                }
                "Grind" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.groundpast_eg)
                    repro!!.start()
                }
                "Grow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grew_eg)
                    repro!!.start()
                }
                "Have" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hadpast_eg)
                    repro!!.start()
                }
                "Hear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.heardpast_eg)
                    repro!!.start()
                }
                "Hide" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hide_eg)
                    repro!!.start()
                }
                "Hit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hitpast_eg)
                    repro!!.start()
                }
                "Hold" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.heldpast_eg)
                    repro!!.start()
                }
                "Hurt" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hurtpast_eg)
                    repro!!.start()
                }
                "Keep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.keptpast_eg)
                    repro!!.start()
                }
                "Know" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.knew_eg)
                    repro!!.start()
                }
                "learn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.learnedpast_eg)
                    repro!!.start()
                }
                "Leave" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.leftpast_eg)
                    repro!!.start()
                }
                "Let" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.letpast_eg)
                    repro!!.start()
                }
                "Lose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.lostpast_eg)
                    repro!!.start()
                }
                "Make" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.madepast_eg)
                    repro!!.start()
                }
                "Mean" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.meantpast_eg)
                    repro!!.start()
                }
                "Meet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.metpast_eg)
                    repro!!.start()
                }
                "Pay" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.paidpast_eg)
                    repro!!.start()
                }
                "Put" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.putpast_eg)
                    repro!!.start()
                }
                "Read" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.readpast_eg)
                    repro!!.start()
                }
                "Ride" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rode_eg)
                    repro!!.start()
                }
                "Ring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rang_eg)
                    repro!!.start()
                }
                "Rise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rose_eg)
                    repro!!.start()
                }
                "Run" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ran_eg)
                    repro!!.start()
                }
                "Say" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.saidpast_eg)
                    repro!!.start()
                }
                "See" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.saw_eg)
                    repro!!.start()
                }
                "Sell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.soldpast_eg)
                    repro!!.start()
                }
                "Send" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sentpast_eg)
                    repro!!.start()
                }
                "Set" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.setpast_eg)
                    repro!!.start()
                }
                "Shine" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shonepast_eg)
                    repro!!.start()
                }
                "Shoot" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shotpast_eg)
                    repro!!.start()
                }
                "Show" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.showed_eg)
                    repro!!.start()
                }
                "Shut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shutpast_eg)
                    repro!!.start()
                }
                "Sing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sang_eg)
                    repro!!.start()
                }
                "Sit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.satpast_eg)
                    repro!!.start()
                }
                "Sleep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sleptpast_eg)
                    repro!!.start()
                }
                "Speak" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spoke_eg)
                    repro!!.start()
                }
                "Spell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.speltpast_eg)
                    repro!!.start()
                }
                "Spend" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spentpast_eg)
                    repro!!.start()
                }
                "Stand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stoodpast_eg)
                    repro!!.start()
                }
                "Steal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stole_eg)
                    repro!!.start()
                }
                "Stick" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stuckpast_eg)
                    repro!!.start()
                }
                "Swmin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swam_eg)
                    repro!!.start()
                }
                "Swing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swungpast_eg)
                    repro!!.start()
                }
                "Take" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.took_eg)
                    repro!!.start()
                }
                "Teach" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.taughtpast_eg)
                    repro!!.start()
                }
                "Tell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.toldpast_eg)
                    repro!!.start()
                }
                "Think" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.thoughtpast_eg)
                    repro!!.start()
                }
                "Throw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.threw_eg)
                    repro!!.start()
                }
                "Understand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.understoodpast_eg)
                    repro!!.start()
                }
                "Wear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wore_eg)
                    repro!!.start()
                }
                "Win" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wonpast_eg)
                    repro!!.start()
                }
                "Wring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wrungpast_eg)
                    repro!!.start()
                }
                "Write" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wrote_eg)
                    repro!!.start()
                }
            }

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = repro.duration + 50
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

            when(VerboInfo.S_Palabra[0]) {
                "Arise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.arisen)
                    repro!!.start()
                }
                "Wake" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.woken)
                    repro!!.start()
                }
                "Be" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.been)
                    repro!!.start()
                }
                "Beat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.beaten)
                    repro!!.start()
                }
                "Become" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.become)
                    repro!!.start()
                }
                "Begin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.begun)
                    repro!!.start()
                }
                "Bet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bet0betted)
                    repro!!.start()
                }
                "Bite" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bitten)
                    repro!!.start()
                }
                "Bleed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bled)
                    repro!!.start()
                }
                "Blow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.blown)
                    repro!!.start()
                }
                "Break" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.broken)
                    repro!!.start()
                }
                "Breed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bred)
                    repro!!.start()
                }
                "Bring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.brought)
                    repro!!.start()
                }
                "Build" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.built)
                    repro!!.start()
                }
                "Burn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.burned0burnt)
                    repro!!.start()
                }
                "Buy" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bought)
                    repro!!.start()
                }
                "Catch" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.caught)
                    repro!!.start()
                }
                "Choose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.chosen)
                    repro!!.start()
                }
                "Come" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.come)
                    repro!!.start()
                }
                "Cost" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cost)
                    repro!!.start()
                }
                "Cut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cut)
                    repro!!.start()
                }
                "Deal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dealt)
                    repro!!.start()
                }
                "Dig" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dug)
                    repro!!.start()
                }
                "Do" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.done)
                    repro!!.start()
                }
                "Draw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drawn)
                    repro!!.start()
                }
                "Dream" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dreamed0dreamt)
                    repro!!.start()
                }
                "Drink" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drunk)
                    repro!!.start()
                }
                "Drive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.driven)
                    repro!!.start()
                }
                "Eat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.eaten)
                    repro!!.start()
                }
                "Fall" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fallen)
                    repro!!.start()
                }
                "Feed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fed)
                    repro!!.start()
                }
                "Feel" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.felt)
                    repro!!.start()
                }
                "Fight" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fought)
                    repro!!.start()
                }
                "Find" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.found)
                    repro!!.start()
                }
                "Fly" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.flown)
                    repro!!.start()
                }
                "Forbid" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forbidden)
                    repro!!.start()
                }
                "Forget" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgotten)
                    repro!!.start()
                }
                "Forgive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgiven)
                    repro!!.start()
                }
                "Freeze" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.frozen)
                    repro!!.start()
                }
                "Get" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.gotten)
                    repro!!.start()
                }
                "Give" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.given)
                    repro!!.start()
                }
                "Go" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.gone)
                    repro!!.start()
                }
                "Grind" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ground)
                    repro!!.start()
                }
                "Grow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grown)
                    repro!!.start()
                }
                "Have" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.had)
                    repro!!.start()
                }
                "Hear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.heard)
                    repro!!.start()
                }
                "Hide" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hidden)
                    repro!!.start()
                }
                "Hit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hit)
                    repro!!.start()
                }
                "Hold" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.held)
                    repro!!.start()
                }
                "Hurt" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hurt)
                    repro!!.start()
                }
                "Keep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.kept)
                    repro!!.start()
                }
                "Know" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.known)
                    repro!!.start()
                }
                "learn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.learned0learnt)
                    repro!!.start()
                }
                "Leave" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.left)
                    repro!!.start()
                }
                "Let" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.let)
                    repro!!.start()
                }
                "Lose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.lost)
                    repro!!.start()
                }
                "Make" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.made)
                    repro!!.start()
                }
                "Mean" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.meant)
                    repro!!.start()
                }
                "Meet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.met)
                    repro!!.start()
                }
                "Pay" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.paid)
                    repro!!.start()
                }
                "Put" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.put)
                    repro!!.start()
                }
                "Read" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.read0past)
                    repro!!.start()
                }
                "Ride" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ridden)
                    repro!!.start()
                }
                "Ring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rung)
                    repro!!.start()
                }
                "Rise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.risen)
                    repro!!.start()
                }
                "Run" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.run)
                    repro!!.start()
                }
                "Say" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.said)
                    repro!!.start()
                }
                "See" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.seen)
                    repro!!.start()
                }
                "Sell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sold)
                    repro!!.start()
                }
                "Send" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sent)
                    repro!!.start()
                }
                "Set" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.set)
                    repro!!.start()
                }
                "Shine" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shone)
                    repro!!.start()
                }
                "Shoot" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shot)
                    repro!!.start()
                }
                "Show" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shown)
                    repro!!.start()
                }
                "Shut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shut)
                    repro!!.start()
                }
                "Sing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sung)
                    repro!!.start()
                }
                "Sit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sat)
                    repro!!.start()
                }
                "Sleep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.slept)
                    repro!!.start()
                }
                "Speak" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spoken)
                    repro!!.start()
                }
                "Spell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spelt)
                    repro!!.start()
                }
                "Spend" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spent)
                    repro!!.start()
                }
                "Stand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stood)
                    repro!!.start()
                }
                "Steal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stolen)
                    repro!!.start()
                }
                "Stick" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stuck)
                    repro!!.start()
                }
                "Swmin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swum)
                    repro!!.start()
                }
                "Swing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swung)
                    repro!!.start()
                }
                "Take" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.taken)
                    repro!!.start()
                }
                "Teach" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.taught)
                    repro!!.start()
                }
                "Tell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.told)
                    repro!!.start()
                }
                "Think" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.thought)
                    repro!!.start()
                }
                "Throw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.thrown)
                    repro!!.start()
                }
                "Understand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.understood)
                    repro!!.start()
                }
                "Wear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.worn)
                    repro!!.start()
                }
                "Win" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.won)
                    repro!!.start()
                }
                "Wring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wrung)
                    repro!!.start()
                }
                "Write" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.written)
                    repro!!.start()
                }
            }

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = repro.duration + 50
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

            when(VerboInfo.S_Palabra[0]) {

                "Arise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.arosen_eg)
                    repro!!.start()
                }
                "Wake" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.woken_eg)
                    repro!!.start()
                }
                "Be" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.been_eg)
                    repro!!.start()
                }
                "Beat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.beaten_eg)
                    repro!!.start()
                }
                "Become" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.becomepp_eg)
                    repro!!.start()
                }
                "Begin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.begun_eg)
                    repro!!.start()
                }
                "Bet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.betpp_eg)
                    repro!!.start()
                }
                "Bite" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bitten_eg)
                    repro!!.start()
                }
                "Bleed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bledpp_eg)
                    repro!!.start()
                }
                "Blow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.blown_eg)
                    repro!!.start()
                }
                "Break" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.broken_eg)
                    repro!!.start()
                }
                "Breed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.bredpp_eg)
                    repro!!.start()
                }
                "Bring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.broughtpp_eg)
                    repro!!.start()
                }
                "Build" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.builtpp_eg)
                    repro!!.start()
                }
                "Burn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.burntpp_eg)
                    repro!!.start()
                }
                "Buy" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.boughtpp_eg)
                    repro!!.start()
                }
                "Catch" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.caughtpp_eg)
                    repro!!.start()
                }
                "Choose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.chosen_eg)
                    repro!!.start()
                }
                "Come" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.comepp_eg)
                    repro!!.start()
                }
                "Cost" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.costpp_eg)
                    repro!!.start()
                }
                "Cut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.cutpp_eg)
                    repro!!.start()
                }
                "Deal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dealtpp_eg)
                    repro!!.start()
                }
                "Dig" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dugpp_eg)
                    repro!!.start()
                }
                "Do" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.done_eg)
                    repro!!.start()
                }
                "Draw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drawn_eg)
                    repro!!.start()
                }
                "Dream" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.dreamtpp_eg)
                    repro!!.start()
                }
                "Drink" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.drunk_eg)
                    repro!!.start()
                }
                "Drive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.driven_eg)
                    repro!!.start()
                }
                "Eat" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.eaten_eg)
                    repro!!.start()
                }
                "Fall" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fallen_eg)
                    repro!!.start()
                }
                "Feed" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.fedpp_eg)
                    repro!!.start()
                }
                "Feel" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.feltpp_eg)
                    repro!!.start()
                }
                "Fight" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.foughtpp_eg)
                    repro!!.start()
                }
                "Find" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.foundpp_eg)
                    repro!!.start()
                }
                "Fly" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.flown_eg)
                    repro!!.start()
                }
                "Forbid" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forbidden_eg)
                    repro!!.start()
                }
                "Forget" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgotten_eg)
                    repro!!.start()
                }
                "Forgive" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.forgiven_eg)
                    repro!!.start()
                }
                "Freeze" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.frozen_eg)
                    repro!!.start()
                }
                "Get" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.gotten_eg)
                    repro!!.start()
                }
                "Give" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.given_eg)
                    repro!!.start()
                }
                "Go" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.gone_eg)
                    repro!!.start()
                }
                "Grind" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.groundpp_eg)
                    repro!!.start()
                }
                "Grow" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.grow_eg)
                    repro!!.start()
                }
                "Have" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hadpp_eg)
                    repro!!.start()
                }
                "Hear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.heardpp_eg)
                    repro!!.start()
                }
                "Hide" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hidden_eg)
                    repro!!.start()
                }
                "Hit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hitpp_eg)
                    repro!!.start()
                }
                "Hold" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.heldpp_eg)
                    repro!!.start()
                }
                "Hurt" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.hurtpp_eg)
                    repro!!.start()
                }
                "Keep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.keptpp_eg)
                    repro!!.start()
                }
                "Know" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.known_eg)
                    repro!!.start()
                }
                "learn" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.learnedpp_eg)
                    repro!!.start()
                }
                "Leave" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.leftpp_eg)
                    repro!!.start()
                }
                "Let" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.letpp_eg)
                    repro!!.start()
                }
                "Lose" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.lostpp_eg)
                    repro!!.start()
                }
                "Make" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.madepp_eg)
                    repro!!.start()
                }
                "Mean" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.meantpp_eg)
                    repro!!.start()
                }
                "Meet" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.metpp_eg)
                    repro!!.start()
                }
                "Pay" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.paidpp_eg)
                    repro!!.start()
                }
                "Put" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.putpp_eg)
                    repro!!.start()
                }
                "Read" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.readpp_eg)
                    repro!!.start()
                }
                "Ride" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.ridden_eg)
                    repro!!.start()
                }
                "Ring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.rung_eg)
                    repro!!.start()
                }
                "Rise" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.risen_eg)
                    repro!!.start()
                }
                "Run" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.runpp_eg)
                    repro!!.start()
                }
                "Say" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.saidpp_eg)
                    repro!!.start()
                }
                "See" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.seen_eg)
                    repro!!.start()
                }
                "Sell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.soldpp_eg)
                    repro!!.start()
                }
                "Send" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sentpp_eg)
                    repro!!.start()
                }
                "Set" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.setpp_eg)
                    repro!!.start()
                }
                "Shine" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shonepp_eg)
                    repro!!.start()
                }
                "Shoot" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shotpp_eg)
                    repro!!.start()
                }
                "Show" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.showed_eg)
                    repro!!.start()
                }
                "Shut" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.shutpp_eg)
                    repro!!.start()
                }
                "Sing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sung_eg)
                    repro!!.start()
                }
                "Sit" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.satpp_eg)
                    repro!!.start()
                }
                "Sleep" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.sleptpp_eg)
                    repro!!.start()
                }
                "Speak" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spoken_eg)
                    repro!!.start()
                }
                "Spell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.speltpp_eg)
                    repro!!.start()
                }
                "Spend" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.spentpp_eg)
                    repro!!.start()
                }
                "Stand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stoodpp_eg)
                    repro!!.start()
                }
                "Steal" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stolen_eg)
                    repro!!.start()
                }
                "Stick" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.stuckpp_eg)
                    repro!!.start()
                }
                "Swmin" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swum_eg)
                    repro!!.start()
                }
                "Swing" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.swungpp_eg)
                    repro!!.start()
                }
                "Take" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.taken_eg)
                    repro!!.start()
                }
                "Teach" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.taughtpp_eg)
                    repro!!.start()
                }
                "Tell" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.toldpp_eg)
                    repro!!.start()
                }
                "Think" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.thoughtpp_eg)
                    repro!!.start()
                }
                "Throw" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.thrown_eg)
                    repro!!.start()
                }
                "Understand" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.understoodpp_eg)
                    repro!!.start()
                }
                "Wear" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.worn_eg)
                    repro!!.start()
                }
                "Win" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wonpp_eg)
                    repro!!.start()
                }
                "Wring" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.wrungpast_eg)
                    repro!!.start()
                }
                "Write" -> {
                    if(repro != null)
                    {
                        repro!!.release()
                    }
                    repro = MediaPlayer.create(this, R.raw.written_eg)
                    repro!!.start()
                }
            }

            //Cuando Clicas pone ek boton play y se programa en el ->
            //tiempo de reproduccion el cambio al icono original del altavoz.
            time = repro.duration + 50
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