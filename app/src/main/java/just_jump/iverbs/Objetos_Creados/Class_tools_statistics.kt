package just_jump.iverbs.Objetos_Creados

import android.content.Context
import com.google.gson.Gson

class Class_tools_statistics(val context: Context)
{
    var statistics_objet: Class_Statistics = Class_Statistics()
    val prefs = context.getSharedPreferences("shared_login_data", Context.MODE_PRIVATE)

    fun serializarobjeto()
    {
        val editor = prefs.edit()
        val gson = Gson()

        // myObject - instance of MyObject
        val json = gson.toJson(statistics_objet)

        editor.putString("statistics", json)
        editor.commit()
    }

    fun deserializarobjeto(): Class_Statistics
    {
        val gson = Gson()

        val json = prefs.getString("statistics", "")
        val statistics = gson.fromJson<Class_Statistics>(json, Class_Statistics::class.java!!)

        return statistics
    }
}