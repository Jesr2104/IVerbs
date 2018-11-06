package just_jump.iverbs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import just_jump.iverbs.Objetos_Creados.Class_AdaptadorListFallos
import just_jump.iverbs.Objetos_Creados.Class_SL_Data
import just_jump.iverbs.Objetos_Creados.Class_Statistics
import just_jump.iverbs.Objetos_Creados.Contenedor_data

class ListaMFalladas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_mfalladas)

        var mytoolB: Toolbar = findViewById(R.id.toolbar_2104)
        setSupportActionBar(mytoolB)

        val tools_Save_Load: Class_SL_Data = Class_SL_Data(this)
        var statistics_object: Class_Statistics

        // cargar el objetos estadisticas
        statistics_object = tools_Save_Load.Data_Load()

        var list = findViewById<ListView>(R.id.Lista_Datos)


        //------------------------------------------------------------------------------------------
        //      Informacion que recimos del intent que se solicita crear
        //------------------------------------------------------------------------------------------

        val datos = this.getIntent().getExtras()
        var check = datos.getInt("TAG")

        var Datos:ArrayList<Contenedor_data> = ArrayList()
        //------------------------------------------------------------------------------------------

        if(check == 0)
        {
            Datos = statistics_object.Orderlist(1)
        }
        else if(check == 1)
        {
            Datos = statistics_object.Orderlist(2)
        }

        val adaptador = Class_AdaptadorListFallos(this, Datos)

        list.adapter = adaptador as ListAdapter?
    }
}
