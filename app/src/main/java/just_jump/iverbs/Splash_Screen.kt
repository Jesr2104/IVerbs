package just_jump.iverbs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)

        var Manejador = Handler().postDelayed({
            var inten: Intent = Intent(this,MainActivity::class.java)
            startActivity(inten)
            finish()
        }, 1500)
    }
}
