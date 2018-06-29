package just_jump.iverbs.Objetos_Creados

import android.content.Context
import android.widget.Toast
import java.io.BufferedReader
import java.io.InputStreamReader
import just_jump.iverbs.R

/**
 * Created by Just Jump on 24/01/2018.
 * Clase para crear la lista con los verbos irregulares
 */
class Class_ListIVerb(val context: Context)
{
    var ListIVerb = mutableListOf<Class_IVerb>()
    var NumberIdentificador: Int = 1000
    var contador = 0

    //--------------------------------------------------------------------------------------------------
    // Funcion para inicializar los datos de la lista de Verbos irregulares
    //--------------------------------------------------------------------------------------------------
    fun InicializarObjetoLista()
    {
        try
        {
            var Recursos = context.getResources().openRawResource(R.raw.datos)
            var FicheroCSV =  BufferedReader(InputStreamReader(Recursos))
            var NumeroDeDatos: Int = 7
            var linea = FicheroCSV.readLine()
                linea = FicheroCSV.readLine()

            while(linea!= null)
            {
                var CadenaSeparada = linea.split(";".toRegex())
                if (CadenaSeparada.size == NumeroDeDatos)
                {
                    var myarray = arrayOf(PasarCharUpper(CadenaSeparada[0]),PasarCharUpper(CadenaSeparada[1]),PasarCharUpper(CadenaSeparada[2]))
                    var MylistaTraducciones = arrayOf(PasarCharUpper(CadenaSeparada[3]))
                    var EjemploPresent = CadenaSeparada[4]
                    var EjemploPast = CadenaSeparada[5]
                    var EjemploPastP = CadenaSeparada[6]

                    var ObjetVerb = Class_IVerb(GetID(),myarray,MylistaTraducciones,EjemploPresent,EjemploPast,EjemploPastP,SetDifficulty(CadenaSeparada[0]))
                    InsertarIverb(ObjetVerb)
                }
                else
                {
                    Toast.makeText(context, "Error tamano del fichero", Toast.LENGTH_LONG).show()
                }

                linea = FicheroCSV.readLine()
                contador++
            }
            Recursos.close()
        }
        catch (e: Exception)
        {
            Toast.makeText(context, e.message, Toast.LENGTH_LONG).show()
        }

        var numero_faciles = 0
        var numero_dificiles = 0
        var nueva = ""
        for (verb in ListIVerb)
        {

            nueva += verb.S_Palabra[0].toLowerCase()+";"+verb.S_Palabra[1].toLowerCase()+";"+verb.S_Palabra[2].toLowerCase()+";"

            if(verb.I_NivelDificiltad == 1)
            {
                numero_faciles++
            }
            else if (verb.I_NivelDificiltad == 2)
            {
                numero_dificiles++
            }
        }
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para pasar el primer caracter de la palabra
    //--------------------------------------------------------------------------------------------------
    fun PasarCharUpper(Palabra: String): String
    {
        var PalabraModificada: String = ""
        var Cont: Int = 0

        PalabraModificada += Palabra[Cont].toUpperCase()
        Cont++

        while(Palabra.length > Cont)
        {
            PalabraModificada = PalabraModificada+ Palabra[Cont]
            Cont++
        }
        return PalabraModificada
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para general el numero ID
    //--------------------------------------------------------------------------------------------------
    fun GetID(): Int
    {
        return NumberIdentificador++
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para Obtener un elemento de la lista
    //--------------------------------------------------------------------------------------------------
    fun ObtenerIverb(Indice: Int): Class_IVerb
    {
        return ListIVerb.get(Indice)
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para insertar un elemento en el array
    //--------------------------------------------------------------------------------------------------
    fun InsertarIverb(ObjetoIVerb: Class_IVerb)
    {
        ListIVerb.add(ObjetoIVerb)
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para saber el numero de elementos
    //--------------------------------------------------------------------------------------------------
    fun Nunelementos(): Int
    {
        return ListIVerb.size
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para establecer dificultad
    //--------------------------------------------------------------------------------------------------
    fun SetDifficulty(SVerb:String): Int
    {
        when(SVerb) {

            "arise" -> {
                return 2
            }
            "wake" -> {
                return 2
            }
            "be" -> {
                return 2
            }
            "beat" -> {
                return 2
            }
            "become" -> {

            }
            "begin" -> {
                return 2
            }
            "bet" -> {

            }
            "bite" -> {
                return 2
            }
            "bleed" -> {

            }
            "blow" -> {
                return 2
            }
            "break" -> {
                return 2
            }
            "breed" -> {

            }
            "bring" -> {

            }
            "build" -> {

            }
            "burn" -> {

            }
            "buy" -> {

            }
            "catch" -> {

            }
            "choose" -> {
                return 2
            }
            "come" -> {

            }
            "cost" -> {

            }
            "cut" -> {

            }
            "deal" -> {

            }
            "dig" -> {

            }
            "do" -> {
                return 2
            }
            "draw" -> {
                return 2
            }
            "dream" -> {

            }
            "drink" -> {
                return 2
            }
            "drive" -> {
                return 2
            }
            "eat" -> {
                return 2
            }
            "fall" -> {
                return 2
            }
            "feed" -> {

            }
            "feel" -> {

            }
            "fight" -> {

            }
            "find" -> {

            }
            "fly" -> {
                return 2
            }
            "forbid" -> {
                return 2
            }
            "forget" -> {
                return 2
            }
            "forgive" -> {
                return 2
            }
            "freeze" -> {
                return 2
            }
            "get" -> {

            }
            "give" -> {
                return 2
            }
            "go" -> {
                return 2
            }
            "grind" -> {

            }
            "grow" -> {
                return 2
            }
            "have" -> {

            }
            "hear" -> {

            }
            "hide" -> {
                return 2
            }
            "hit" -> {

            }
            "hold" -> {

            }
            "hurt" -> {

            }
            "heep" -> {

            }
            "know" -> {
                return 2
            }
            "learn" -> {

            }
            "leave" -> {

            }
            "let" -> {

            }
            "lose" -> {

            }
            "make" -> {

            }
            "mean" -> {

            }
            "meet" -> {

            }
            "pay" -> {

            }
            "put" -> {

            }
            "read" -> {

            }
            "ride" -> {
                return 2
            }
            "ring" -> {
                return 2
            }
            "rise" -> {
                return 2
            }
            "run" -> {

            }
            "say" -> {

            }
            "see" -> {
                return 2
            }
            "sell" -> {

            }
            "send" -> {

            }
            "set" -> {

            }
            "shine" -> {

            }
            "shoot" -> {

            }
            "show" -> {
                return 2
            }
            "shut" -> {

            }
            "sing" -> {

            }
            "sit" -> {

            }
            "sleep" -> {

            }
            "speak" -> {
                return 2
            }
            "spell" -> {

            }
            "spend" -> {

            }
            "stand" -> {

            }
            "steal" -> {
                return 2
            }
            "stick" -> {

            }
            "swmin" -> {
                return 2
            }
            "swing" -> {

            }
            "take" -> {
                return 2
            }
            "teach" -> {

            }
            "tell" -> {

            }
            "think" -> {

            }
            "throw" -> {
                return 2
            }
            "understand" -> {

            }
            "wear" -> {
                return 2
            }
            "win" -> {

            }
            "wring" -> {

            }
            "write" -> {
                return 2
            }
        }
        return 1
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para obtener un elementos
    //--------------------------------------------------------------------------------------------------
    @Override
    fun getItem(position: Int): Any
    {
        return ListIVerb.get(position)
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para buscar un elementos por el presente
    //--------------------------------------------------------------------------------------------------
    @Override
    fun get_SVerbs(nameverb: String): Class_IVerb?
    {
        if(!ListIVerb.isEmpty()) {
            for (item in ListIVerb){
                if (item.S_Palabra[0].toUpperCase().equals(nameverb.toUpperCase()))
                {
                    return item
                }
            }
        }
        return null
    }

    //--------------------------------------------------------------------------------------------------
    // Funcion para buscar un elementos por cualquier tiempo verbal
    //--------------------------------------------------------------------------------------------------
    fun getVerbs(Nverb: String): Class_IVerb?
    {
        if(!ListIVerb.isEmpty())
        {
            for(item in ListIVerb)
            {
                var present = item.S_Palabra[0].toUpperCase().equals(Nverb.toUpperCase())
                var past = item.S_Palabra[1].toUpperCase().equals(Nverb.toUpperCase())
                var pparticipio = item.S_Palabra[2].toUpperCase().equals(Nverb.toUpperCase())

                if(present or past or pparticipio)
                {
                    return item
                }
            }
        }
        return null
    }
}