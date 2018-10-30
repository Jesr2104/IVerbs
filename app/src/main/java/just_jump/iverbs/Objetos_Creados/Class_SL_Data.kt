package just_jump.iverbs.Objetos_Creados

import android.content.Context
import com.google.gson.Gson

class Class_SL_Data(val context: Context)
{
    // creo que esta linea sera innecesaria
    //var ListaVerb_Completa: Class_ListIVerb = Class_ListIVerb(context)

    fun ValidarData(): Boolean
    {
        val prefs_Load = context.getSharedPreferences("Datos_Estadisticos", Context.MODE_PRIVATE)
        return prefs_Load.contains("statistics")

        // true cuando el fichero exite
        // false cuando no exite
    }

    fun Data_Save(new_statistics: Class_Statistics)
    {
        val prefs_Save = context.getSharedPreferences("Datos_Estadisticos", Context.MODE_PRIVATE)
        val editor = prefs_Save.edit()
        val gson = Gson()

        // myObject pasado como un objetos Json para poder serializarlos como un String
        val json = gson.toJson(new_statistics)

        editor.putString("statistics", json)
        editor.commit()
    }

    fun Data_Load(): Class_Statistics
    {
        val prefs_Load = context.getSharedPreferences("Datos_Estadisticos", Context.MODE_PRIVATE)
        val gson = Gson()

        val json = prefs_Load.getString("statistics", "DEFAULT")
        val statistics = gson.fromJson<Class_Statistics>(json, Class_Statistics::class.java!!)

        return statistics
    }

    fun Reset_Statistics()
    {
        var objeto = Class_ListIVerb(context)

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
        Data_Save(statistics)
    }
}