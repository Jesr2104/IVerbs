package just_jump.iverbs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import just_jump.iverbs.Objetos_Creados.Class_ListIVerb
import just_jump.iverbs.Objetos_Creados.Class_SL_Data
import just_jump.iverbs.Objetos_Creados.Class_Statistics
import just_jump.iverbs.Objetos_Creados.Contenedor_data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //------------------------------------------------------------------------------------------
        //  Inicializar Listar de Verbos para el Objeto estadistica y su grabado en memoria
        //------------------------------------------------------------------------------------------
        var saveData: Class_SL_Data = Class_SL_Data(this)

        if(!saveData.ValidarData())
        {
            var objeto = Class_ListIVerb(this)

            // Crea e inicializa el objetos con la lista de verbos irrregulares que seran usado para
            // crear la lista de los verbos para la clase estadistica
            objeto.InicializarObjetoLista()

            var temp:ArrayList<Contenedor_data> = ArrayList()

            for(item in objeto.ListIVerb)
            {
                var verbTempPresent:Contenedor_data = Contenedor_data()
                verbTempPresent.NVerb = item.S_Palabra[0]
                verbTempPresent.Numero = 0
                verbTempPresent.Tiempo = 0

                var verbTempPast:Contenedor_data = Contenedor_data()
                verbTempPast.NVerb = item.S_Palabra[1]
                verbTempPast.Numero = 0
                verbTempPast.Tiempo = 1

                var verbTempPastParticiple:Contenedor_data = Contenedor_data()
                verbTempPastParticiple.NVerb = item.S_Palabra[2]
                verbTempPastParticiple.Numero = 0
                verbTempPastParticiple.Tiempo = 2

                temp.add(verbTempPresent)
                temp.add(verbTempPast)
                temp.add(verbTempPastParticiple)
            }

            var statistics:Class_Statistics = Class_Statistics()
            statistics.inicializar_Clase(temp)

            // Escribe la informacion para que la proxima ves que ser carge el objeto ya tenga la lista
            // de palabras actualizadas para general las variable en el objeto estadistica
            saveData.Data_Save(statistics)
        }
        else
        {
            // la variable ya esta creada anteriormente
        }

        //------------------------------------------------------------------------------------------

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
            var inten: Intent = Intent(this,Test_1::class.java)
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
