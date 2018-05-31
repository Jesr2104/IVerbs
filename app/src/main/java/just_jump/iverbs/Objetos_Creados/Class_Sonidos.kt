package just_jump.iverbs.Objetos_Creados

import android.content.Context
import android.media.MediaPlayer
import just_jump.iverbs.R

class Class_Sonidos(val context: Context)
{
    var repro: MediaPlayer = MediaPlayer()

    fun present(verb:String):Any{

        when(verb){

            "Arise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.arise)
                repro!!.start()
            }
            "Wake" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wake)
                repro!!.start()
            }
            "Be" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.be)
                repro!!.start()
            }
            "Beat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.beat)
                repro!!.start()
            }
            "Become" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.become)
                repro!!.start()
            }
            "Begin" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.begin)
                repro!!.start()
            }
            "Bet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bet)
                repro!!.start()
            }
            "Bite" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bite)
                repro!!.start()
            }
            "Bleed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bleed)
                repro!!.start()
            }
            "Blow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.blow)
                repro!!.start()
            }
            "Break" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.break0)
                repro!!.start()
            }
            "Breed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.breed)
                repro!!.start()
            }
            "Bring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bring)
                repro!!.start()
            }
            "Build" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.build)
                repro!!.start()
            }
            "Burn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.burn)
                repro!!.start()
            }
            "Buy" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.buy)
                repro!!.start()
            }
            "Catch" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.catch0)
                repro!!.start()
            }
            "Choose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.choose)
                repro!!.start()
            }
            "Come" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.come)
                repro!!.start()
            }
            "Cost" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cost)
                repro!!.start()
            }
            "Cut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cut)
                repro!!.start()
            }
            "Deal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.deal)
                repro!!.start()
            }
            "Dig" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dig)
                repro!!.start()
            }
            "Do" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.do0)
                repro!!.start()
            }
            "Draw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.draw)
                repro!!.start()
            }
            "Dream" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dream)
                repro!!.start()
            }
            "Drink" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drink)
                repro!!.start()
            }
            "Drive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drive)
                repro!!.start()
            }
            "Eat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.eat)
                repro!!.start()
            }
            "Fall" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fall)
                repro!!.start()
            }
            "Feed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.feed)
                repro!!.start()
            }
            "Feel" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.feel)
                repro!!.start()
            }
            "Fight" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fight)
                repro!!.start()
            }
            "Find" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.find)
                repro!!.start()
            }
            "Fly" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fly)
                repro!!.start()
            }
            "Forbid" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forbid)
                repro!!.start()
            }
            "Forget" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forget)
                repro!!.start()
            }
            "Forgive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgive)
                repro!!.start()
            }
            "Freeze" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.freeze)
                repro!!.start()
            }
            "Get" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.get)
                repro!!.start()
            }
            "Give" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.give)
                repro!!.start()
            }
            "Go" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.go)
                repro!!.start()
            }
            "Grind" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grind)
                repro!!.start()
            }
            "Grow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grow)
                repro!!.start()
            }
            "Have" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.have)
                repro!!.start()
            }
            "Hear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hear)
                repro!!.start()
            }
            "Hide" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hide)
                repro!!.start()
            }
            "Hit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hit)
                repro!!.start()
            }
            "Hold" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hold)
                repro!!.start()
            }
            "Hurt" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hurt)
                repro!!.start()
            }
            "Keep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.keep)
                repro!!.start()
            }
            "Know" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.know)
                repro!!.start()
            }
            "Learn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.learn)
                repro!!.start()
            }
            "Leave" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.leave)
                repro!!.start()
            }
            "Let" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.let)
                repro!!.start()
            }
            "Lose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.lose)
                repro!!.start()
            }
            "Make" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.make)
                repro!!.start()
            }
            "Mean" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.mean)
                repro!!.start()
            }
            "Meet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.meet)
                repro!!.start()
            }
            "Pay" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.pay)
                repro!!.start()
            }
            "Put" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.put)
                repro!!.start()
            }
            "Read" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.read)
                repro!!.start()
            }
            "Ride" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ride)
                repro!!.start()
            }
            "Ring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ring)
                repro!!.start()
            }
            "Rise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rise)
                repro!!.start()
            }
            "Run" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.run)
                repro!!.start()
            }
            "Say" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.say)
                repro!!.start()
            }
            "See" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.see)
                repro!!.start()
            }
            "Sell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sell)
                repro!!.start()
            }
            "Send" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.send)
                repro!!.start()
            }
            "Set" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.set)
                repro!!.start()
            }
            "Shine" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shine)
                repro!!.start()
            }
            "Shoot" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shoot)
                repro!!.start()
            }
            "Show" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.show)
                repro!!.start()
            }
            "Shut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shut)
                repro!!.start()
            }
            "Sing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sing)
                repro!!.start()
            }
            "Sit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sit)
                repro!!.start()
            }
            "Sleep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sleep)
                repro!!.start()
            }
            "Speak" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.speak)
                repro!!.start()
            }
            "Spell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spell)
                repro!!.start()
            }
            "Spend" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spend)
                repro!!.start()
            }
            "Stand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stand)
                repro!!.start()
            }
            "Steal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.steal)
                repro!!.start()
            }
            "Stick" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stick)
                repro!!.start()
            }
            "Swim" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swim)
                repro!!.start()
            }
            "Swing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swing)
                repro!!.start()
            }
            "Take" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.take)
                repro!!.start()
            }
            "Teach" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.teach)
                repro!!.start()
            }
            "Tell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.tell)
                repro!!.start()
            }
            "Think" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.think)
                repro!!.start()
            }
            "Throw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.throw0)
                repro!!.start()
            }
            "Understand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.understand)
                repro!!.start()
            }
            "Wear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wear)
                repro!!.start()
            }
            "Win" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.win)
                repro!!.start()
            }
            "Wring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wring)
                repro!!.start()
            }
            "Write" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.write)
                repro!!.start()
            }
        }
        //devuelve el tiempo de reproduccion de sonido
         return repro.duration + 50
    }

    fun present_eg(verb:String):Any{

        when(verb) {

            "Arise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.arise_eg)
                repro!!.start()
            }
            "Wake" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wake_eg)
                repro!!.start()
            }
            "Be" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.be_eg)
                repro!!.start()
            }
            "Beat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.beat_eg)
                repro!!.start()
            }
            "Become" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.become_eg)
                repro!!.start()
            }
            "Begin" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.begin_eg)
                repro!!.start()
            }
            "Bet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bet_eg)
                repro!!.start()
            }
            "Bite" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bite_eg)
                repro!!.start()
            }
            "Bleed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bleed_eg)
                repro!!.start()
            }
            "Blow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.blow_eg)
                repro!!.start()
            }
            "Break" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.break_eg)
                repro!!.start()
            }
            "Breed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.breed_eg)
                repro!!.start()
            }
            "Bring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bring_eg)
                repro!!.start()
            }
            "Build" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.build_eg)
                repro!!.start()
            }
            "Burn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.burn_eg)
                repro!!.start()
            }
            "Buy" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.buy_eg)
                repro!!.start()
            }
            "Catch" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.catch_eg)
                repro!!.start()
            }
            "Choose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.choose_eg)
                repro!!.start()
            }
            "Come" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.come_eg)
                repro!!.start()
            }
            "Cost" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cost_eg)
                repro!!.start()
            }
            "Cut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cut_eg)
                repro!!.start()
            }
            "Deal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.deal_eg)
                repro!!.start()
            }
            "Dig" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dig_eg)
                repro!!.start()
            }
            "Do" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.do_eg)
                repro!!.start()
            }
            "Draw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.draw_eg)
                repro!!.start()
            }
            "Dream" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dream_eg)
                repro!!.start()
            }
            "Drink" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drink_eg)
                repro!!.start()
            }
            "Drive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drive_eg)
                repro!!.start()
            }
            "Eat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.eat_eg)
                repro!!.start()
            }
            "Fall" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fall_eg)
                repro!!.start()
            }
            "Feed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.feed_eg)
                repro!!.start()
            }
            "Feel" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.feel_eg)
                repro!!.start()
            }
            "Fight" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fight_eg)
                repro!!.start()
            }
            "Find" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.find_eg)
                repro!!.start()
            }
            "Fly" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fly_eg)
                repro!!.start()
            }
            "Forbid" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forbid_eg)
                repro!!.start()
            }
            "Forget" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forget_eg)
                repro!!.start()
            }
            "Forgive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgive_eg)
                repro!!.start()
            }
            "Freeze" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.freeze_eg)
                repro!!.start()
            }
            "Get" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.get_eg)
                repro!!.start()
            }
            "Give" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.give_eg)
                repro!!.start()
            }
            "Go" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.go_eg)
                repro!!.start()
            }
            "Grind" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grind_eg)
                repro!!.start()
            }
            "Grow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grow_eg)
                repro!!.start()
            }
            "Have" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.have_eg)
                repro!!.start()
            }
            "Hear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hear_eg)
                repro!!.start()
            }
            "Hide" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hide_eg)
                repro!!.start()
            }
            "Hit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hit_eg)
                repro!!.start()
            }
            "Hold" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hold_eg)
                repro!!.start()
            }
            "Hurt" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hurt_eg)
                repro!!.start()
            }
            "Keep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.keep_eg)
                repro!!.start()
            }
            "Know" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.know_eg)
                repro!!.start()
            }
            "Learn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.learn_eg)
                repro!!.start()
            }
            "Leave" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.leave_eg)
                repro!!.start()
            }
            "Let" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.let_eg)
                repro!!.start()
            }
            "Lose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.lose_eg)
                repro!!.start()
            }
            "Make" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.make_eg)
                repro!!.start()
            }
            "Mean" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.mean_eg)
                repro!!.start()
            }
            "Meet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.meet_eg)
                repro!!.start()
            }
            "Pay" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.pay_eg)
                repro!!.start()
            }
            "Put" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.put_eg)
                repro!!.start()
            }
            "Read" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.read_eg)
                repro!!.start()
            }
            "Ride" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ride_eg)
                repro!!.start()
            }
            "Ring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ring_eg)
                repro!!.start()
            }
            "Rise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rise_eg)
                repro!!.start()
            }
            "Run" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.run_eg)
                repro!!.start()
            }
            "Say" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.say_eg)
                repro!!.start()
            }
            "See" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.see_eg)
                repro!!.start()
            }
            "Sell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sell_eg)
                repro!!.start()
            }
            "Send" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.send_eg)
                repro!!.start()
            }
            "Set" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.set_eg)
                repro!!.start()
            }
            "Shine" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shine_eg)
                repro!!.start()
            }
            "Shoot" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shoot_eg)
                repro!!.start()
            }
            "Show" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.show_eg)
                repro!!.start()
            }
            "Shut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shut_eg)
                repro!!.start()
            }
            "Sing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sing_eg)
                repro!!.start()
            }
            "Sit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sit_eg)
                repro!!.start()
            }
            "Sleep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sleep_eg)
                repro!!.start()
            }
            "Speak" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.speak_eg)
                repro!!.start()
            }
            "Spell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spell_eg)
                repro!!.start()
            }
            "Spend" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spend_eg)
                repro!!.start()
            }
            "Stand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stand_eg)
                repro!!.start()
            }
            "Steal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.steal_eg)
                repro!!.start()
            }
            "Stick" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stick_eg)
                repro!!.start()
            }
            "Swim" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swim_eg)
                repro!!.start()
            }
            "Swing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swing_eg)
                repro!!.start()
            }
            "Take" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.take_eg)
                repro!!.start()
            }
            "Teach" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.teach_eg)
                repro!!.start()
            }
            "Tell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.tell_eg)
                repro!!.start()
            }
            "Think" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.think_eg)
                repro!!.start()
            }
            "Throw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.throw_eg)
                repro!!.start()
            }
            "Understand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.understand_eg)
                repro!!.start()
            }
            "Wear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wear_eg)
                repro!!.start()
            }
            "Win" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.win_eg)
                repro!!.start()
            }
            "Wring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wring_eg)
                repro!!.start()
            }
            "Write" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.write_eg)
                repro!!.start()
            }
        }
        //devuelve el tiempo de reproduccion de sonido
        return repro.duration + 50
    }

    fun past(verb:String):Any{
        when(verb) {
            "Arise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.arose)
                repro!!.start()
            }
            "Wake" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.woke)
                repro!!.start()
            }
            "Be" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.was0were)
                repro!!.start()
            }
            "Beat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.beat)
                repro!!.start()
            }
            "Become" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.became)
                repro!!.start()
            }
            "Begin" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.began)
                repro!!.start()
            }
            "Bet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bet0betted)
                repro!!.start()
            }
            "Bite" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bit)
                repro!!.start()
            }
            "Bleed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bled)
                repro!!.start()
            }
            "Blow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.blew)
                repro!!.start()
            }
            "Break" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.broke)
                repro!!.start()
            }
            "Breed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bred)
                repro!!.start()
            }
            "Bring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.brought)
                repro!!.start()
            }
            "Build" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.built)
                repro!!.start()
            }
            "Burn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.burnt)
                repro!!.start()
            }
            "Buy" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bought)
                repro!!.start()
            }
            "Catch" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.caught)
                repro!!.start()
            }
            "Choose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.chose)
                repro!!.start()
            }
            "Come" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.came)
                repro!!.start()
            }
            "Cost" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cost)
                repro!!.start()
            }
            "Cut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cut)
                repro!!.start()
            }
            "Deal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dealt)
                repro!!.start()
            }
            "Dig" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dug)
                repro!!.start()
            }
            "Do" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.did)
                repro!!.start()
            }
            "Draw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drew)
                repro!!.start()
            }
            "Dream" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dreamed0dreamt)
                repro!!.start()
            }
            "Drink" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drank)
                repro!!.start()
            }
            "Drive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drove)
                repro!!.start()
            }
            "Eat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ate)
                repro!!.start()
            }
            "Fall" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fell)
                repro!!.start()
            }
            "Feed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fed)
                repro!!.start()
            }
            "Feel" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.felt)
                repro!!.start()
            }
            "Fight" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fought)
                repro!!.start()
            }
            "Find" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.found)
                repro!!.start()
            }
            "Fly" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.flew)
                repro!!.start()
            }
            "Forbid" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forbade)
                repro!!.start()
            }
            "Forget" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgot)
                repro!!.start()
            }
            "Forgive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgave)
                repro!!.start()
            }
            "Freeze" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.froze)
                repro!!.start()
            }
            "Get" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.got)
                repro!!.start()
            }
            "Give" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.gave)
                repro!!.start()
            }
            "Go" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.went)
                repro!!.start()
            }
            "Grind" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ground)
                repro!!.start()
            }
            "Grow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grew)
                repro!!.start()
            }
            "Have" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.had)
                repro!!.start()
            }
            "Hear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.heard)
                repro!!.start()
            }
            "Hide" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hid)
                repro!!.start()
            }
            "Hit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hit)
                repro!!.start()
            }
            "Hold" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.held)
                repro!!.start()
            }
            "Hurt" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hurt)
                repro!!.start()
            }
            "Keep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.kept)
                repro!!.start()
            }
            "Know" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.knew)
                repro!!.start()
            }
            "Learn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.learned0learnt)
                repro!!.start()
            }
            "Leave" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.left)
                repro!!.start()
            }
            "Let" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.let)
                repro!!.start()
            }
            "Lose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.lost)
                repro!!.start()
            }
            "Make" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.made)
                repro!!.start()
            }
            "Mean" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.meant)
                repro!!.start()
            }
            "Meet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.met)
                repro!!.start()
            }
            "Pay" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.paid)
                repro!!.start()
            }
            "Put" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.put)
                repro!!.start()
            }
            "Read" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.read0past)
                repro!!.start()
            }
            "Ride" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rode)
                repro!!.start()
            }
            "Ring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rang)
                repro!!.start()
            }
            "Rise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rose)
                repro!!.start()
            }
            "Run" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ran)
                repro!!.start()
            }
            "Say" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.said)
                repro!!.start()
            }
            "See" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.saw)
                repro!!.start()
            }
            "Sell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sold)
                repro!!.start()
            }
            "Send" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sent)
                repro!!.start()
            }
            "Set" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.set)
                repro!!.start()
            }
            "Shine" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shone)
                repro!!.start()
            }
            "Shoot" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shot)
                repro!!.start()
            }
            "Show" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.showed)
                repro!!.start()
            }
            "Shut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shut)
                repro!!.start()
            }
            "Sing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sang)
                repro!!.start()
            }
            "Sit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sat)
                repro!!.start()
            }
            "Sleep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.slept)
                repro!!.start()
            }
            "Speak" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spoke)
                repro!!.start()
            }
            "Spell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spelt)
                repro!!.start()
            }
            "Spend" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spent)
                repro!!.start()
            }
            "Stand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stood)
                repro!!.start()
            }
            "Steal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stole)
                repro!!.start()
            }
            "Stick" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stuck)
                repro!!.start()
            }
            "Swim" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swam)
                repro!!.start()
            }
            "Swing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swung)
                repro!!.start()
            }
            "Take" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.took)
                repro!!.start()
            }
            "Teach" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.taught)
                repro!!.start()
            }
            "Tell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.told)
                repro!!.start()
            }
            "Think" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.thought)
                repro!!.start()
            }
            "Throw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.threw)
                repro!!.start()
            }
            "Understand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.understood)
                repro!!.start()
            }
            "Wear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wore)
                repro!!.start()
            }
            "Win" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.won)
                repro!!.start()
            }
            "Wring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wrung)
                repro!!.start()
            }
            "Write" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wrote)
                repro!!.start()
            }
        }
        //devuelve el tiempo de reproduccion de sonido
        return repro.duration + 50
    }

    fun past_eg(verb:String):Any{
        when(verb) {

            "Arise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.arose_eg)
                repro!!.start()
            }
            "Wake" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.woke_eg)
                repro!!.start()
            }
            "Be" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.was0were_eg)
                repro!!.start()
            }
            "Beat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.beatpast_eg)
                repro!!.start()
            }
            "Become" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.became_eg)
                repro!!.start()
            }
            "Begin" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.began_eg)
                repro!!.start()
            }
            "Bet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.betpast_eg)
                repro!!.start()
            }
            "Bite" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bit_eg)
                repro!!.start()
            }
            "Bleed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bledpast_eg)
                repro!!.start()
            }
            "Blow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.blew_eg)
                repro!!.start()
            }
            "Break" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.broke_eg)
                repro!!.start()
            }
            "Breed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bredpast_eg)
                repro!!.start()
            }
            "Bring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.broughtpast_eg)
                repro!!.start()
            }
            "Build" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.builtpast_eg)
                repro!!.start()
            }
            "Burn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.burntpast_eg)
                repro!!.start()
            }
            "Buy" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.boughtpast_eg)
                repro!!.start()
            }
            "Catch" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.caughtpast_eg)
                repro!!.start()
            }
            "Choose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.chose_eg)
                repro!!.start()
            }
            "Come" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.came_eg)
                repro!!.start()
            }
            "Cost" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.costpast_eg)
                repro!!.start()
            }
            "Cut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cutpast_eg)
                repro!!.start()
            }
            "Deal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dealtpast_eg)
                repro!!.start()
            }
            "Dig" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dugpast_eg)
                repro!!.start()
            }
            "Do" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.did_eg)
                repro!!.start()
            }
            "Draw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drew_eg)
                repro!!.start()
            }
            "Dream" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dreamtpast_eg)
                repro!!.start()
            }
            "Drink" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drank_eg)
                repro!!.start()
            }
            "Drive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drove_eg)
                repro!!.start()
            }
            "Eat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ate_eg)
                repro!!.start()
            }
            "Fall" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fell_eg)
                repro!!.start()
            }
            "Feed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fedpast_eg)
                repro!!.start()
            }
            "Feel" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.feltpast_eg)
                repro!!.start()
            }
            "Fight" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.foughtpast_eg)
                repro!!.start()
            }
            "Find" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.foundpast_eg)
                repro!!.start()
            }
            "Fly" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.flew_eg)
                repro!!.start()
            }
            "Forbid" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forbade_eg)
                repro!!.start()
            }
            "Forget" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgot_eg)
                repro!!.start()
            }
            "Forgive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgave_eg)
                repro!!.start()
            }
            "Freeze" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.froze_eg)
                repro!!.start()
            }
            "Get" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.got_eg)
                repro!!.start()
            }
            "Give" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.gave_eg)
                repro!!.start()
            }
            "Go" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.went_eg)
                repro!!.start()
            }
            "Grind" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.groundpast_eg)
                repro!!.start()
            }
            "Grow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grew_eg)
                repro!!.start()
            }
            "Have" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hadpast_eg)
                repro!!.start()
            }
            "Hear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.heardpast_eg)
                repro!!.start()
            }
            "Hide" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hid_eg)
                repro!!.start()
            }
            "Hit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hitpast_eg)
                repro!!.start()
            }
            "Hold" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.heldpast_eg)
                repro!!.start()
            }
            "Hurt" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hurtpast_eg)
                repro!!.start()
            }
            "Keep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.keptpast_eg)
                repro!!.start()
            }
            "Know" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.knew_eg)
                repro!!.start()
            }
            "Learn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.learnedpast_eg)
                repro!!.start()
            }
            "Leave" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.leftpast_eg)
                repro!!.start()
            }
            "Let" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.letpast_eg)
                repro!!.start()
            }
            "Lose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.lostpast_eg)
                repro!!.start()
            }
            "Make" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.madepast_eg)
                repro!!.start()
            }
            "Mean" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.meantpast_eg)
                repro!!.start()
            }
            "Meet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.metpast_eg)
                repro!!.start()
            }
            "Pay" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.paidpast_eg)
                repro!!.start()
            }
            "Put" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.putpast_eg)
                repro!!.start()
            }
            "Read" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.readpast_eg)
                repro!!.start()
            }
            "Ride" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rode_eg)
                repro!!.start()
            }
            "Ring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rang_eg)
                repro!!.start()
            }
            "Rise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rose_eg)
                repro!!.start()
            }
            "Run" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ran_eg)
                repro!!.start()
            }
            "Say" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.saidpast_eg)
                repro!!.start()
            }
            "See" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.saw_eg)
                repro!!.start()
            }
            "Sell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.soldpast_eg)
                repro!!.start()
            }
            "Send" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sentpast_eg)
                repro!!.start()
            }
            "Set" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.setpast_eg)
                repro!!.start()
            }
            "Shine" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shonepast_eg)
                repro!!.start()
            }
            "Shoot" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shotpast_eg)
                repro!!.start()
            }
            "Show" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.showed_eg)
                repro!!.start()
            }
            "Shut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shutpast_eg)
                repro!!.start()
            }
            "Sing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sang_eg)
                repro!!.start()
            }
            "Sit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.satpast_eg)
                repro!!.start()
            }
            "Sleep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sleptpast_eg)
                repro!!.start()
            }
            "Speak" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spoke_eg)
                repro!!.start()
            }
            "Spell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.speltpast_eg)
                repro!!.start()
            }
            "Spend" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spentpast_eg)
                repro!!.start()
            }
            "Stand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stoodpast_eg)
                repro!!.start()
            }
            "Steal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stole_eg)
                repro!!.start()
            }
            "Stick" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stuckpast_eg)
                repro!!.start()
            }
            "Swim" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swam_eg)
                repro!!.start()
            }
            "Swing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swungpast_eg)
                repro!!.start()
            }
            "Take" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.took_eg)
                repro!!.start()
            }
            "Teach" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.taughtpast_eg)
                repro!!.start()
            }
            "Tell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.toldpast_eg)
                repro!!.start()
            }
            "Think" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.thoughtpast_eg)
                repro!!.start()
            }
            "Throw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.threw_eg)
                repro!!.start()
            }
            "Understand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.understoodpast_eg)
                repro!!.start()
            }
            "Wear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wore_eg)
                repro!!.start()
            }
            "Win" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wonpast_eg)
                repro!!.start()
            }
            "Wring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wrungpast_eg)
                repro!!.start()
            }
            "Write" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wrote_eg)
                repro!!.start()
            }
        }
        //devuelve el tiempo de reproduccion de sonido
        return repro.duration + 50
    }

    fun participle(verb:String):Any{

        when(verb) {
            "Arise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.arisen)
                repro!!.start()
            }
            "Wake" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.woken)
                repro!!.start()
            }
            "Be" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.been)
                repro!!.start()
            }
            "Beat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.beaten)
                repro!!.start()
            }
            "Become" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.become)
                repro!!.start()
            }
            "Begin" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.begun)
                repro!!.start()
            }
            "Bet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bet0betted)
                repro!!.start()
            }
            "Bite" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bitten)
                repro!!.start()
            }
            "Bleed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bled)
                repro!!.start()
            }
            "Blow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.blown)
                repro!!.start()
            }
            "Break" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.broken)
                repro!!.start()
            }
            "Breed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bred)
                repro!!.start()
            }
            "Bring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.brought)
                repro!!.start()
            }
            "Build" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.built)
                repro!!.start()
            }
            "Burn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.burnt)
                repro!!.start()
            }
            "Buy" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bought)
                repro!!.start()
            }
            "Catch" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.caught)
                repro!!.start()
            }
            "Choose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.chosen)
                repro!!.start()
            }
            "Come" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.come)
                repro!!.start()
            }
            "Cost" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cost)
                repro!!.start()
            }
            "Cut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cut)
                repro!!.start()
            }
            "Deal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dealt)
                repro!!.start()
            }
            "Dig" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dug)
                repro!!.start()
            }
            "Do" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.done)
                repro!!.start()
            }
            "Draw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drawn)
                repro!!.start()
            }
            "Dream" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dreamed0dreamt)
                repro!!.start()
            }
            "Drink" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drunk)
                repro!!.start()
            }
            "Drive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.driven)
                repro!!.start()
            }
            "Eat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.eaten)
                repro!!.start()
            }
            "Fall" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fallen)
                repro!!.start()
            }
            "Feed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fed)
                repro!!.start()
            }
            "Feel" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.felt)
                repro!!.start()
            }
            "Fight" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fought)
                repro!!.start()
            }
            "Find" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.found)
                repro!!.start()
            }
            "Fly" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.flown)
                repro!!.start()
            }
            "Forbid" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forbidden)
                repro!!.start()
            }
            "Forget" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgotten)
                repro!!.start()
            }
            "Forgive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgiven)
                repro!!.start()
            }
            "Freeze" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.frozen)
                repro!!.start()
            }
            "Get" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.gotten)
                repro!!.start()
            }
            "Give" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.given)
                repro!!.start()
            }
            "Go" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.gone)
                repro!!.start()
            }
            "Grind" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ground)
                repro!!.start()
            }
            "Grow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grown)
                repro!!.start()
            }
            "Have" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.had)
                repro!!.start()
            }
            "Hear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.heard)
                repro!!.start()
            }
            "Hide" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hidden)
                repro!!.start()
            }
            "Hit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hit)
                repro!!.start()
            }
            "Hold" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.held)
                repro!!.start()
            }
            "Hurt" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hurt)
                repro!!.start()
            }
            "Keep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.kept)
                repro!!.start()
            }
            "Know" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.known)
                repro!!.start()
            }
            "Learn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.learned0learnt)
                repro!!.start()
            }
            "Leave" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.left)
                repro!!.start()
            }
            "Let" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.let)
                repro!!.start()
            }
            "Lose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.lost)
                repro!!.start()
            }
            "Make" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.made)
                repro!!.start()
            }
            "Mean" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.meant)
                repro!!.start()
            }
            "Meet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.met)
                repro!!.start()
            }
            "Pay" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.paid)
                repro!!.start()
            }
            "Put" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.put)
                repro!!.start()
            }
            "Read" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.read0past)
                repro!!.start()
            }
            "Ride" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ridden)
                repro!!.start()
            }
            "Ring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rung)
                repro!!.start()
            }
            "Rise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.risen)
                repro!!.start()
            }
            "Run" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.run)
                repro!!.start()
            }
            "Say" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.said)
                repro!!.start()
            }
            "See" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.seen)
                repro!!.start()
            }
            "Sell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sold)
                repro!!.start()
            }
            "Send" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sent)
                repro!!.start()
            }
            "Set" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.set)
                repro!!.start()
            }
            "Shine" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shone)
                repro!!.start()
            }
            "Shoot" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shot)
                repro!!.start()
            }
            "Show" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shown)
                repro!!.start()
            }
            "Shut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shut)
                repro!!.start()
            }
            "Sing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sung)
                repro!!.start()
            }
            "Sit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sat)
                repro!!.start()
            }
            "Sleep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.slept)
                repro!!.start()
            }
            "Speak" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spoken)
                repro!!.start()
            }
            "Spell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spelt)
                repro!!.start()
            }
            "Spend" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spent)
                repro!!.start()
            }
            "Stand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stood)
                repro!!.start()
            }
            "Steal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stolen)
                repro!!.start()
            }
            "Stick" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stuck)
                repro!!.start()
            }
            "Swim" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swum)
                repro!!.start()
            }
            "Swing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swung)
                repro!!.start()
            }
            "Take" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.taken)
                repro!!.start()
            }
            "Teach" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.taught)
                repro!!.start()
            }
            "Tell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.told)
                repro!!.start()
            }
            "Think" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.thought)
                repro!!.start()
            }
            "Throw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.thrown)
                repro!!.start()
            }
            "Understand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.understood)
                repro!!.start()
            }
            "Wear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.worn)
                repro!!.start()
            }
            "Win" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.won)
                repro!!.start()
            }
            "Wring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wrung)
                repro!!.start()
            }
            "Write" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.written)
                repro!!.start()
            }
        }
        //devuelve el tiempo de reproduccion de sonido
        return repro.duration + 50
    }

    fun participle_eg(verb:String):Any {

        when(verb) {

            "Arise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.arosen_eg)
                repro!!.start()
            }
            "Wake" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.woken_eg)
                repro!!.start()
            }
            "Be" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.been_eg)
                repro!!.start()
            }
            "Beat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.beaten_eg)
                repro!!.start()
            }
            "Become" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.becomepp_eg)
                repro!!.start()
            }
            "Begin" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.begun_eg)
                repro!!.start()
            }
            "Bet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.betpp_eg)
                repro!!.start()
            }
            "Bite" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bitten_eg)
                repro!!.start()
            }
            "Bleed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bledpp_eg)
                repro!!.start()
            }
            "Blow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.blown_eg)
                repro!!.start()
            }
            "Break" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.broken_eg)
                repro!!.start()
            }
            "Breed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.bredpp_eg)
                repro!!.start()
            }
            "Bring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.broughtpp_eg)
                repro!!.start()
            }
            "Build" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.builtpp_eg)
                repro!!.start()
            }
            "Burn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.burntpp_eg)
                repro!!.start()
            }
            "Buy" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.boughtpp_eg)
                repro!!.start()
            }
            "Catch" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.caughtpp_eg)
                repro!!.start()
            }
            "Choose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.chosen_eg)
                repro!!.start()
            }
            "Come" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.comepp_eg)
                repro!!.start()
            }
            "Cost" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.costpp_eg)
                repro!!.start()
            }
            "Cut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.cutpp_eg)
                repro!!.start()
            }
            "Deal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dealtpp_eg)
                repro!!.start()
            }
            "Dig" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dugpp_eg)
                repro!!.start()
            }
            "Do" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.done_eg)
                repro!!.start()
            }
            "Draw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drawn_eg)
                repro!!.start()
            }
            "Dream" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.dreamtpp_eg)
                repro!!.start()
            }
            "Drink" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.drunk_eg)
                repro!!.start()
            }
            "Drive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.driven_eg)
                repro!!.start()
            }
            "Eat" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.eaten_eg)
                repro!!.start()
            }
            "Fall" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fallen_eg)
                repro!!.start()
            }
            "Feed" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.fedpp_eg)
                repro!!.start()
            }
            "Feel" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.feltpp_eg)
                repro!!.start()
            }
            "Fight" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.foughtpp_eg)
                repro!!.start()
            }
            "Find" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.foundpp_eg)
                repro!!.start()
            }
            "Fly" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.flown_eg)
                repro!!.start()
            }
            "Forbid" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forbidden_eg)
                repro!!.start()
            }
            "Forget" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgotten_eg)
                repro!!.start()
            }
            "Forgive" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.forgiven_eg)
                repro!!.start()
            }
            "Freeze" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.frozen_eg)
                repro!!.start()
            }
            "Get" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.gotten_eg)
                repro!!.start()
            }
            "Give" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.given_eg)
                repro!!.start()
            }
            "Go" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.gone_eg)
                repro!!.start()
            }
            "Grind" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.groundpp_eg)
                repro!!.start()
            }
            "Grow" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.grown_eg)
                repro!!.start()
            }
            "Have" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hadpp_eg)
                repro!!.start()
            }
            "Hear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.heardpp_eg)
                repro!!.start()
            }
            "Hide" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hidden_eg)
                repro!!.start()
            }
            "Hit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hitpp_eg)
                repro!!.start()
            }
            "Hold" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.heldpp_eg)
                repro!!.start()
            }
            "Hurt" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.hurtpp_eg)
                repro!!.start()
            }
            "Keep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.keptpp_eg)
                repro!!.start()
            }
            "Know" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.known_eg)
                repro!!.start()
            }
            "Learn" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.learnedpp_eg)
                repro!!.start()
            }
            "Leave" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.leftpp_eg)
                repro!!.start()
            }
            "Let" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.letpp_eg)
                repro!!.start()
            }
            "Lose" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.lostpp_eg)
                repro!!.start()
            }
            "Make" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.madepp_eg)
                repro!!.start()
            }
            "Mean" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.meantpp_eg)
                repro!!.start()
            }
            "Meet" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.metpp_eg)
                repro!!.start()
            }
            "Pay" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.paidpp_eg)
                repro!!.start()
            }
            "Put" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.putpp_eg)
                repro!!.start()
            }
            "Read" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.readpp_eg)
                repro!!.start()
            }
            "Ride" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.ridden_eg)
                repro!!.start()
            }
            "Ring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.rung_eg)
                repro!!.start()
            }
            "Rise" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.risen_eg)
                repro!!.start()
            }
            "Run" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.runpp_eg)
                repro!!.start()
            }
            "Say" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.saidpp_eg)
                repro!!.start()
            }
            "See" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.seen_eg)
                repro!!.start()
            }
            "Sell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.soldpp_eg)
                repro!!.start()
            }
            "Send" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sentpp_eg)
                repro!!.start()
            }
            "Set" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.setpp_eg)
                repro!!.start()
            }
            "Shine" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shonepp_eg)
                repro!!.start()
            }
            "Shoot" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shotpp_eg)
                repro!!.start()
            }
            "Show" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.showed_eg)
                repro!!.start()
            }
            "Shut" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.shutpp_eg)
                repro!!.start()
            }
            "Sing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sung_eg)
                repro!!.start()
            }
            "Sit" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.satpp_eg)
                repro!!.start()
            }
            "Sleep" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.sleptpp_eg)
                repro!!.start()
            }
            "Speak" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spoken_eg)
                repro!!.start()
            }
            "Spell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.speltpp_eg)
                repro!!.start()
            }
            "Spend" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.spentpp_eg)
                repro!!.start()
            }
            "Stand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stoodpp_eg)
                repro!!.start()
            }
            "Steal" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stolen_eg)
                repro!!.start()
            }
            "Stick" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.stuckpp_eg)
                repro!!.start()
            }
            "Swim" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swum_eg)
                repro!!.start()
            }
            "Swing" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.swungpp_eg)
                repro!!.start()
            }
            "Take" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.taken_eg)
                repro!!.start()
            }
            "Teach" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.taughtpp_eg)
                repro!!.start()
            }
            "Tell" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.toldpp_eg)
                repro!!.start()
            }
            "Think" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.thoughtpp_eg)
                repro!!.start()
            }
            "Throw" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.thrown_eg)
                repro!!.start()
            }
            "Understand" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.understoodpp_eg)
                repro!!.start()
            }
            "Wear" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.worn_eg)
                repro!!.start()
            }
            "Win" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wonpp_eg)
                repro!!.start()
            }
            "Wring" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.wrungpp_eg)
                repro!!.start()
            }
            "Write" -> {
                if(repro != null)
                {
                    repro!!.release()
                }
                repro = MediaPlayer.create(context, R.raw.written_eg)
                repro!!.start()
            }
        }
        //devuelve el tiempo de reproduccion de sonido
        return repro.duration + 50
    }
}