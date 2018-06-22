package just_jump.iverbs.Objetos_Creados

import android.content.Context
import java.util.*
import kotlin.collections.ArrayList

class Class_Test_1(val context: Context)
{
    var ListPregunta = mutableListOf<Class_Pregunta>()
    val ListaVerb_Completa: Class_ListIVerb = Class_ListIVerb(context)
    val numeroPregunta = 20
    var Gnera_rand = Random()

    // variable de porsetajes de proguntas
    var PxDificiles = 0.10
    var PxFaciles = 0.00
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
        //==        Conseguimos los 20% de las preguntas dificiles
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
        //==        Conseguimos los 20% de las preguntas faciles
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
    }

    fun preguntas_masFalladas()
    {

    }

    fun preguntas_menosUsadas()
    {

    }

    fun preguntas_dificiles()
    {

    }

    fun preguntas_faciles()
    {

    }
}