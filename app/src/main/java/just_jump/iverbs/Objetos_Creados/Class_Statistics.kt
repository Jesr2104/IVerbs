package just_jump.iverbs.Objetos_Creados

class Class_Statistics
{
    var num_test_complete:Int = Int.MIN_VALUE
    var num_test_complete_without_error:Int = Int.MIN_VALUE
    var porcentaje_palabras_aprendidas:Int = Int.MIN_VALUE

    // Lista para recoger la informacion de los fallos aciertos y palabras mas usadas
    var dictverbs_wrong:ArrayList<Contenedor_data> = ArrayList()
    var dictverbs_correct:ArrayList<Contenedor_data> = ArrayList()
    var dictverbs_usered:ArrayList<Contenedor_data> = ArrayList()

    init
    {
        num_test_complete = 0
        num_test_complete_without_error = 0
        porcentaje_palabras_aprendidas = 0
    }

    fun inicializar_Clase(listVariable:ArrayList<Contenedor_data>)
    {
        // Inicializa la variable a 0 donde se almecenara el numero de fallos por cada palabra.
        dictverbs_wrong = listVariable

        // Inicializa la variable a 0 donde se almecenara el numero de palabras contestadas corectamente.
        dictverbs_correct = listVariable

        // Inicializa la varianle a 0 donde se almacenara el numero de veces que se una el verbo en una prueba.
        dictverbs_usered = listVariable
    }

    fun actualizar(list: ArrayList<Contenedor_data>)
    {
        var contador = list.size
        var cont = 0
        var comprueba = false

        // incrementa el numero test completado
        num_test_complete ++

        //------------------------------------------------------------------------------------------
        //  failures and successes
        //------------------------------------------------------------------------------------------
        for (Item in list)
        {
            if(Item.Numero == 0)
            {
                dictverbs_correct[getindex(Item.NVerb)].Numero += 1
            }
            else if(Item.Numero == 1)
            {
                dictverbs_wrong[getindex(Item.NVerb)].Numero += 1
            }
        }

        //------------------------------------------------------------------------------------------
        //  cuenta el numero de veces que se termina un test sin errores
        //------------------------------------------------------------------------------------------
        for (Item in list)
        {
            if (Item.Numero == 1)
            {
                comprueba = true
            }
        }
        if(comprueba == false)
        {
            num_test_complete_without_error += 1
        }

        //------------------------------------------------------------------------------------------
        //  cuenta el numero de veces que es usada una palabra en un test
        //------------------------------------------------------------------------------------------
        for (Item in list)
        {
            dictverbs_usered[getindex(Item.NVerb)].Numero += 1
        }

        //------------------------------------------------------------------------------------------
        // Actualizar fallos
        // Actualizar aciertos
        // Actualizar prueba terminada
        // Actualizar prueba terminada sin fallos
        // Actualizar Palabras usadas en el test
        // Actualizar porcentaje_palabras_aprendidas     ->  ->  ->  ->  -> "Falta Por Solucionar"
        //------------------------------------------------------------------------------------------
    }

    // funcion que ordenas los datos de mayor a menos
    fun Orderlist(TypeList:Int): ArrayList<Contenedor_data>
    {
        var temp:ArrayList<Contenedor_data> = ArrayList()
        var temporal:Contenedor_data = Contenedor_data()

        if(TypeList == 0)
        {
            temp = dictverbs_correct
        }
        else if(TypeList == 1)
        {
            temp = dictverbs_wrong
        }
        else if(TypeList == 2)
        {
            temp = dictverbs_usered
        }

        for (i in 0 until temp.size) {
            for (j in 1 until temp.size - i) {

                if (temp[j - 1].Numero < temp[j].Numero)
                {
                    temporal = temp[j - 1]
                    temp[j - 1] = temp[j]
                    temp[j] = temporal
                }
            }
        }

        return temp
    }

    fun getNTest():Int
    {
        return num_test_complete
    }

    fun getNTestwithouterror():Int
    {
        return num_test_complete_without_error
    }

    fun getListUsedVerb():ArrayList<Contenedor_data>
    {
        return dictverbs_usered
    }

    fun getListwrong():ArrayList<Contenedor_data>
    {
        return dictverbs_wrong
    }

    fun getListcorrect():ArrayList<Contenedor_data>
    {
        return dictverbs_correct
    }

    fun getindex(word:String): Int
    {
        var cont = 0
        for(Item in dictverbs_usered)
        {
            if(Item.NVerb.toLowerCase().equals(word.toLowerCase()))
            {
                return cont
            }
            cont++
        }
        return -1
    }
}