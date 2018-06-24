package just_jump.iverbs.Objetos_Creados

class Class_Statistics()
{
    var num_test_complete:Int = Int.MIN_VALUE
    var num_test_complete_without_error:Int = Int.MIN_VALUE
    var porcentaje_palabras_aprendidas:Int = Int.MIN_VALUE

    val dictverbs_wrong = HashMap<String , Int>()
    val dictverbs_correct = HashMap<String , Int>()
    val dictverbs_usered = HashMap<String , Int>()

    val listverb = "arise;arose;arisen;be;was/were;been;beat;beat;beaten;become;became;become;begin;began;begun;bet;betted/bet;betted/bet;bite;bit;bitten;bleed;bled;bled;blow;blew;blown;break;broke;broken;breed;bred;bred;bring;brought;brought;build;built;built;burn;burnt;burnt;buy;bought;bought;catch;caught;caught;choose;chose;chosen;come;came;come;cost;cost;cost;cut;cut;cut;deal;dealt;dealt;dig;dug;dug;do;did;done;draw;drew;drawn;dream;dreamed/dreamt;dreamed/dreamt;drink;drank;drunk;drive;drove;driven;eat;ate;eaten;fall;fell;fallen;feed;fed;fed;feel;felt;felt;fight;fought;fought;find;found;found;fly;flew;flown;forbid;forbade;forbidden;forget;forgot;forgotten;forgive;forgave;forgiven;freeze;froze;frozen;get;got;gotten;give;gave;given;go;went;gone;grind;ground;ground;grow;grew;grown;have;had;had;hear;heard;heard;hide;hid;hidden;hit;hit;hit;hold;held;held;hurt;hurt;hurt;keep;kept;kept;know;knew;known;learn;learned/learnt;learned/learnt;leave;left;left;let;let;let;lose;lost;lost;make;made;made;mean;meant;meant;meet;met;met;pay;paid;paid;put;put;put;read;read;read;ride;rode;ridden;ring;rang;rung;rise;rose;risen;run;ran;run;say;said;said;see;saw;seen;sell;sold;sold;send;sent;sent;set;set;set;shine;shone;shone;shoot;shot;shot;show;showed;shown;shut;shut;shut;sing;sang;sung;sit;sat;sat;sleep;slept;slept;speak;spoke;spoken;spell;spelt;spelt;spend;spent;spent;stand;stood;stood;steal;stole;stolen;stick;stuck;stuck;swim;swam;swum;swing;swung;swung;take;took;taken;teach;taught;taught;tell;told;told;think;thought;thought;throw;threw;thrown;understand;understood;understood;wake;woke;woken;wear;wore;worn;win;won;won;wring;wrung;wrung;write;wrote;written;"

    init
    {
        num_test_complete = 0
        num_test_complete_without_error = 0
        porcentaje_palabras_aprendidas = 0


        // Creo una lista con todos los verbos irregulares con todos los verbos y sus tiempos 96 verbos en 3 tiempos 96 x 3 = 288
        var wordlist= listverb.split(";")

        // Crear el "Hash Map" con el cada uno de los indices para los verbos y con el valor 0 ##( write = 0 )##
        // Inicializa la variable a 0 donde se almecenara el numero de fallos por cada palabra.
        for(item in wordlist)
        {
            dictverbs_wrong.put(item , 0)
        }

        // Inicializa la variable a 0 donde se almecenara el numero de palabras contestadas corectamente.
        for(item in wordlist)
        {
            dictverbs_correct.put(item , 0)
        }

        // Inicializa la varianle a 0 donde se almacenara el numero de veces que se una el verbo en una prueba.
        for(item in wordlist)
        {
            dictverbs_usered.put(item , 0)
        }
    }

    fun verbo_menos_usado()
    {

    }

    fun verbo_mas_usado()
    {

    }

    fun verbo_mas_fallado()
    {

    }

    fun verbos_conmas_aciertos()
    {

    }

    fun calcular_porcentaje_de_palabras_aprendidas()
    {

    }

    fun getNTest():Int
    {
        return num_test_complete
    }

    fun getNTestwithouterror():Int
    {
        return num_test_complete_without_error
    }

    fun getListUsedVerb():HashMap<String , Int>
    {
        return dictverbs_usered
    }

    fun getListwrong():HashMap<String , Int>
    {
        return dictverbs_wrong
    }

    fun getListcorrect():HashMap<String , Int>
    {
        return dictverbs_correct
    }

    fun actualizar(List: HashMap<String , Int>)
    {
        var contador = List.size
        var cont = 0
        var comprueba = false

        // incrementa el numero test completado
        num_test_complete ++

        //------------------------------------------------------------------------------------------
        //failures and successes
        //------------------------------------------------------------------------------------------
        for (Item in List)
        {
            if(Item.value == 0)
            {
                dictverbs_correct.set(Item.key,dictverbs_correct.getValue(Item.key)+1)
            }
            else if(Item.value == 1)
            {
                dictverbs_wrong.set(Item.key,dictverbs_wrong.getValue(Item.key)+1)
            }
        }

        //------------------------------------------------------------------------------------------
        // cuenta el numero de veces que se termina un test sin errores
        //------------------------------------------------------------------------------------------
        for (Item in List)
        {
            if (Item.value == 1)
            {
                comprueba = true
            }
        }
        if(comprueba == false)
        {
            num_test_complete_without_error += 1
        }

        //------------------------------------------------------------------------------------------
        // cuenta el numero de veces que es usada una palabra en un test
        //------------------------------------------------------------------------------------------
        for (Item in List)
        {
            dictverbs_usered.set(Item.key,dictverbs_usered.getValue(Item.key)+1)
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
}