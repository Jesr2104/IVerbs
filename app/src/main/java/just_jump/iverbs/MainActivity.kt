package just_jump.iverbs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.*
import just_jump.iverbs.Objetos_Creados.*
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

        //------------------------------------------------------------------------------------------
        //         Inicializar estadisticas de la aplicacion
        //------------------------------------------------------------------------------------------

        val tools_Save_Load: Class_SL_Data = Class_SL_Data(this)
        var statistics_object:Class_Statistics

        // cargar el objetos estadisticas
        statistics_object = tools_Save_Load.Data_Load()

        var list = findViewById<ListView>(R.id.Lista_mFallados)
        var list1 = findViewById<ListView>(R.id.Lista_menosFallados)

        var DatosTest1 = findViewById<TextView>(R.id.DTest1)
        var DatosTest2 = findViewById<TextView>(R.id.DTest2)

        var Datos = statistics_object.Orderlist(1)
        var Datos2 = statistics_object.Orderlist(2)

        var nuevalist:ArrayList<Contenedor_data> = ArrayList()
        var nuevalist1:ArrayList<Contenedor_data> = ArrayList()

        DatosTest1.setText("" + statistics_object.getNTestwithouterror())
        DatosTest2.setText("" + statistics_object.getNTest())

        var cont:Int = 0
        var numdata:Int = 4

        for (Item in Datos)
        {
            if(cont<numdata)
            {
                if (Item.Numero != 0)
                {
                    nuevalist.add(Item)
                }
                cont++
            }
            if(cont == numdata)
            {
                var new:Contenedor_data = Contenedor_data()

                new.NVerb = "Ver mas.."
                new.Numero = 0
                new.Tiempo = 3
                nuevalist.add(new)
                cont++
            }
        }

        cont = 0
        numdata = 4

        for (Item in Datos2)
        {
            if(cont<numdata)
            {
                if (Item.Numero != 0)
                {
                    nuevalist1.add(Item)
                }
                cont++
            }
            if(cont == numdata)
            {
                var new:Contenedor_data = Contenedor_data()

                new.NVerb = "Ver mas.."
                new.Numero = 0
                new.Tiempo = 3
                nuevalist1.add(new)
                cont++
            }
        }

        val adaptador = Class_AdaptadorListFallos(this, nuevalist)
        val adaptador1 = Class_AdaptadorListFallos(this, nuevalist1)

        list.adapter = adaptador as ListAdapter?
        list1.adapter = adaptador1 as ListAdapter?

        list.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            if(i == nuevalist.size -1)
            {
                var inten: Intent = Intent(this, ListaMFalladas::class.java)
                //----------------------------------------------------------------------------------
                //  ENVIAMOS LA INFORMACION AL INTENT QUE ESPECIFICA LA LISTA QUE SE QUIERES MOSTRAR
                //----------------------------------------------------------------------------------
                inten.putExtra("TAG",0)
                startActivity(inten)
            }
        }

        list1.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            if (i == nuevalist1.size - 1) {

                var inten: Intent = Intent(this, ListaMFalladas::class.java)
                //----------------------------------------------------------------------------------
                //  ENVIAMOS LA INFORMACION AL INTENT QUE ESPECIFICA LA LISTA QUE SE QUIERES MOSTRAR
                //----------------------------------------------------------------------------------
                inten.putExtra("TAG",1)
                startActivity(inten)
            }
        }

        //------------------------------------------------------------------------------------------

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
