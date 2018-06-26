package just_jump.iverbs.Objetos_Creados

import android.content.Context
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class Class_Test_1(val context: Context)
{
    var ListPregunta = mutableListOf<Class_Pregunta>()
    val ListaVerb_Completa: Class_ListIVerb = Class_ListIVerb(context)
    val numeroPregunta = 20
    var Gnera_rand = Random()

    // variable de porsetajes de proguntas
    var PxDificiles = 0.30
    var PxFaciles = 0.30
    var PxMasFalladas = 0.20
    var PxMenosUsadas = 0.20

    init
    {
        ListaVerb_Completa.InicializarObjetoLista()
        Generar_Preguntas()
    }

    fun Generar_Preguntas()
    {
        var Numero_rand = 0
        var pregunta = 0
        var contador = 0

        //========================================================================================
        //==        Conseguimos los 30% de las preguntas dificiles
        //========================================================================================
        var ListaDificil: ArrayList<Class_IVerb> = ArrayList()
        for (item in ListaVerb_Completa.ListIVerb)
        {
            if (item.I_NivelDificiltad == 2)
            {
                ListaDificil.add(item)
            }
        }

        while (contador < (numeroPregunta * PxDificiles))
        {
            Numero_rand = Gnera_rand.nextInt(ListaDificil.size)
            pregunta = Gnera_rand.nextInt(3)

            var nueva_pregunta: Class_Pregunta = Class_Pregunta(pregunta,ListaDificil.get(Numero_rand))
            ListPregunta.add(nueva_pregunta)
            contador ++
        }
        //========================================================================================

        //========================================================================================
        //==        Conseguimos los 30% de las preguntas faciles
        //========================================================================================
        contador = 0
        var Listafacil: ArrayList<Class_IVerb> = ArrayList()
        for (item in ListaVerb_Completa.ListIVerb)
        {
            if (item.I_NivelDificiltad == 1)
            {
                Listafacil.add(item)
            }
        }

        while (contador < (numeroPregunta * PxFaciles))
        {
            Numero_rand = Gnera_rand.nextInt(Listafacil.size)
            pregunta = Gnera_rand.nextInt(3)

            var nueva_pregunta: Class_Pregunta = Class_Pregunta(pregunta,Listafacil.get(Numero_rand))
            ListPregunta.add(nueva_pregunta)
            contador ++
        }
        //========================================================================================

        //========================================================================================
        //==        Conseguimos los 20% de las preguntas mas falladas
        //========================================================================================
        var ListaMFalladosOrder = Orderlist()
        var ListaMFallados: ArrayList<Class_IVerb> = ArrayList()
        contador = 0

        for (item in ListaMFalladosOrder)
        {
            ListaMFallados.add(ListaVerb_Completa.getVerbs(item.key)!!)
        }

        while (contador < (numeroPregunta * PxMasFalladas))
        {
            pregunta = Gnera_rand.nextInt(3)

            var nueva_pregunta: Class_Pregunta = Class_Pregunta(pregunta,ListaMFallados[contador])
            ListPregunta.add(nueva_pregunta)
            contador ++
        }
        //========================================================================================

        //========================================================================================
        //==        Conseguimos los 20% de las preguntas menos usadas
        //========================================================================================
        //contador = 0
        //var ListaMUsadas: ArrayList<Class_IVerb> = ArrayList()

        //========================================================================================

    }

    fun Orderlist():HashMap<String,Int>{

        class contenedor_data
        {
            var Numero: Int = 0
            var NVerb: String = ""
        }
        var numberArray:ArrayList<contenedor_data> = ArrayList()

        var tools: Class_SL_Data = Class_SL_Data(context)
        var LoadStatisticas:Class_Statistics = tools.Data_Load()
        var list = LoadStatisticas.getListwrong()
        var listEmpty = HashMap<String , Int>()
        var temporal:contenedor_data = contenedor_data()

        if (list != null){

            for(Item in list)
            {
                /*val toast = Toast.makeText(context, Item.key.toUpperCase() + " Valor =>" + Item.value, Toast.LENGTH_SHORT)
                toast.show()*/

                //Creo un elemento de tipo contenedor_data
                var newElement:contenedor_data = contenedor_data()

                newElement.Numero = Item.value
                newElement.NVerb = Item.key

                numberArray.add(newElement)
            }
        }

        for (i in 0 until numberArray.size) {
            for (j in 1 until numberArray.size - i) {

                if (numberArray[j - 1].Numero < numberArray[j].Numero)
                {
                    temporal = numberArray[j - 1]
                    numberArray[j - 1] = numberArray[j]
                    numberArray[j] = temporal
                }
            }
        }

        /*for(item in numberArray){
            if(item.Numero != 0)
            {
                val toast = Toast.makeText(context, "Numero => "+item.NVerb  + " Numero => "+item.Numero, Toast.LENGTH_SHORT)
                toast.show()
            }
        }*/

        for(Item in numberArray)
        {
            listEmpty.put(Item.NVerb,Item.Numero)
        }

        return listEmpty
    }

    fun palabras_masFalladas()
    {

    }

    fun palabras_menosUsadas()
    {

    }

    fun palabras_dificiles()
    {

    }

    fun palabras_faciles()
    {

    }
}