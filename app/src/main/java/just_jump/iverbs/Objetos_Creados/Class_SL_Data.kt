package just_jump.iverbs.Objetos_Creados

import android.content.Context
import com.google.gson.Gson

class Class_SL_Data(val context: Context)
{
    var ListaVerb_Completa: Class_ListIVerb = Class_ListIVerb(context)

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
}