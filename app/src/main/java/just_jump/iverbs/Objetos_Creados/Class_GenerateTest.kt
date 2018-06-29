package just_jump.iverbs.Objetos_Creados

import android.content.Context
import java.util.*
import kotlin.collections.ArrayList

class Class_GenerateTest(val context: Context)
{
    var ListPregunta = mutableListOf<Class_Pregunta>()
    val ListaVerb_Completa: Class_ListIVerb = Class_ListIVerb(context)
    val numeroPregunta = 20
    var Gnera_rand = Random()

    var tools: Class_SL_Data = Class_SL_Data(context)
    var newliston = tools.Data_Load()

    // variable de porsetajes de proguntas
    var PxDificiles = 0.10
    var PxFaciles = 0.10
    var PxMasFalladas = 0.10
    var PxMenosUsadas = 0.10

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
        var cont = 0

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
        var Listar_Ordenada = newliston.Orderlist(1)
        var ListaMFallados: ArrayList<Class_IVerb> = ArrayList()

        for (item in Listar_Ordenada)
        {
            ListaMFallados.add(ListaVerb_Completa.getVerbs(item.NVerb)!!)
        }

        contador=0
        cont=0

        while (contador < (numeroPregunta * PxMasFalladas))
        {
            var nueva_pregunta: Class_Pregunta = Class_Pregunta(pregunta,ListaMFallados[cont])
            pregunta = Gnera_rand.nextInt(3)

            if(Check_repeated(nueva_pregunta))
            {
                ListPregunta.add(nueva_pregunta)
                contador ++
            }
            else
            {
                cont++
            }
        }

        //========================================================================================

        //========================================================================================
        //==        Conseguimos los 20% de las preguntas menos usadas
        //========================================================================================
        var Listar_Ordenada_usados = newliston.Orderlist(2)
        var ListaMUsados: ArrayList<Class_IVerb> = ArrayList()
        contador = Listar_Ordenada_usados.size -1

        while(cont < Listar_Ordenada_usados.size)
        {
            ListaMUsados.add(ListaVerb_Completa.getVerbs(Listar_Ordenada_usados[contador].NVerb)!!)
            contador--
            cont++
        }

        contador=0
        cont=0

        while (contador < (numeroPregunta * PxMenosUsadas))
        {
            var nueva_pregunta: Class_Pregunta = Class_Pregunta(pregunta,ListaMUsados[cont])
            pregunta = Gnera_rand.nextInt(3)

            if(Check_repeated(nueva_pregunta))
            {
                ListPregunta.add(nueva_pregunta)
                contador ++
            }
            else
            {
                cont++
            }
        }

        //========================================================================================
    }

    // funcion para chequear si el verbo que se va a agregar ua existe o no en las lista
    fun Check_repeated(Pregunta:Class_Pregunta): Boolean
    {
        for(Item in ListPregunta)
        {
            if(Item.getVerb().S_Palabra.equals(Pregunta.getVerb().S_Palabra))
            {
                return false
            }
        }
        return true
    }

    fun getNewpregunta(): Class_Pregunta
    {
        var pregunta = Gnera_rand.nextInt(3)
        var Numero_rand = Gnera_rand.nextInt(ListaVerb_Completa.ListIVerb.size)

        var newpregunta:Class_Pregunta = Class_Pregunta(pregunta,ListaVerb_Completa.ListIVerb.get(Numero_rand))

        return newpregunta

    }
}