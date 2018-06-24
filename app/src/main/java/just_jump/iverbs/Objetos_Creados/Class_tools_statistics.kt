package just_jump.iverbs.Objetos_Creados

import android.content.Context
import android.widget.Toast
import com.google.gson.Gson

class Class_tools_statistics(val context: Context)
{
    fun serializarobjeto(new_statistics: Class_Statistics)
    {
        val prefs_Save = context.getSharedPreferences("Datos_Estadisticos", Context.MODE_PRIVATE)
        val editor = prefs_Save.edit()
        val gson = Gson()

        // myObject pasado como un objetos Json para poder serializarlos como un String
        val json = gson.toJson(new_statistics)

        editor.putString("statistics", json)
        editor.commit()
    }

    fun deserializarobjeto(): Class_Statistics
    {
        val prefs_Load = context.getSharedPreferences("Datos_Estadisticos", Context.MODE_PRIVATE)
        val gson = Gson()

        var json = prefs_Load.getString("statistics", "DEFAULT")
        if(json == "DEFAULT")
        {
            var New:Class_Statistics = Class_Statistics()
            serializarobjeto(New)
            json = gson.toJson(New)

            val toast = Toast.makeText(context, "Primera vez", Toast.LENGTH_LONG)
            toast.show()
        }
        val statistics = gson.fromJson<Class_Statistics>(json, Class_Statistics::class.java!!)

        return statistics
    }
}