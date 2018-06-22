package just_jump.iverbs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Linea de codigo para vizualizar el icono en la action bar*/
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setLogo(R.drawable.logo)

        B_ListaVerbos.setOnClickListener({
            var inten: Intent = Intent(this,ListaVerb::class.java)
            startActivity(inten)
        })

        B_Examen.setOnClickListener({
            var inten: Intent = Intent(this,Test::class.java)
            startActivity(inten)
        })
    }
    override fun onBackPressed(){

        contador ++
        if (contador == 2)
        {
            this.finish()
        }
        else
        {
            val text = getString(R.string.app_back_pressed_exit)
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        var Manejador = Handler().postDelayed({
            contador = 0
        }, 1500)
    }
}
