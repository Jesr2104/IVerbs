package just_jump.iverbs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.Toolbar
import android.widget.Toast
import just_jump.iverbs.Objetos_Creados.Class_SL_Data
import kotlinx.android.synthetic.main.activity_configuracion.*

class Configuracion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        var mytoolB: Toolbar = findViewById(R.id.toolbar_2104)
        setSupportActionBar(mytoolB)

        Reset_Progress.setOnClickListener{

            var saveData: Class_SL_Data = Class_SL_Data(this)

            if(saveData.ValidarData())
            {
                val mensaje = AlertDialog.Builder(this)
                val text = "Se elimino correctamente"
                val duration = Toast.LENGTH_SHORT


                mensaje.setTitle("Esta seguro que desea borrar su progreso.")
                mensaje.setCancelable(false)
                mensaje.setPositiveButton(getString(R.string.text_aceptar)) { dialog, which -> saveData.Reset_Statistics(); val toast = Toast.makeText(applicationContext, text, duration); toast.show() }
                mensaje.setNegativeButton(getString(R.string.text_cancelar)) { dialog, which -> }
                mensaje.show()





            }
        }
    }
}
