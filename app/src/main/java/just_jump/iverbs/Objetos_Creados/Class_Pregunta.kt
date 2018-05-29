package just_jump.iverbs.Objetos_Creados

class Class_Pregunta(Pregunta: Int, Verb: Class_IVerb)
{
    private var TPreguntado: Int = Int.MAX_VALUE
    private var Verbo_pregunta: Class_IVerb = Class_IVerb()

    init
    {
        TPreguntado = Pregunta
        Verbo_pregunta = Verb
    }

    fun getTPreguntado(): Int
    {
        return TPreguntado
    }

    fun setTPreguntado(TPregunta: Int)
    {
        if(TPregunta > -1 && TPregunta < 3)
        {
            TPreguntado = TPregunta
        }
    }

    fun getVerb(): Class_IVerb
    {
        return Verbo_pregunta
    }

    fun setVerb(Verb: Class_IVerb)
    {
        Verbo_pregunta = Verb
    }
}