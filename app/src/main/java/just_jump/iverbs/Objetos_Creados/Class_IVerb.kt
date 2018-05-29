package just_jump.iverbs.Objetos_Creados

import java.io.Serializable

/**
 * Created by Jorge Soto on 24/01/2018.
 * Clase contenedora de todos los atributos de Objetos VerboIrregular
 *
 */
class Class_IVerb(): Serializable
{
    var L_Identificador: Int = 0
    var S_Palabra = arrayOf<String>()
    var S_Traduccion = arrayOf<String>() /*Nunca utilizar este tipo de inicializacion que da problemas ==> *///Array<String> by Delegates.notNull()
    //--------------------------------------------------------------------------------------------------
    // EL campo S_Traduccion almacenara la traduccion de la palabra en los idiomas que esta se encuentre
    //--------------------------------------------------------------------------------------------------
    // 0 Ingles
    // 1 Español
    // 2 Aleman
    // 3 Italiano
    // 4 Frances
    var S_EjemplosPresent: String = String()
    var S_EjemplosPast: String = String()
    var S_EjemplosPastParticiple: String = String()

    //--------------------------------------------------------------------------------------------------
    // El campo I_NivelDificiltad almacenara un numero entero para agrupar los verbos
    //--------------------------------------------------------------------------------------------------
    var I_NivelDificiltad: Int = 0

    constructor
            (
                    Ident: Int,
                    Palabra: Array<String>,
                    Traduccion: Array<String>,
                    EjPresent: String,
                    EjPast: String,
                    EjPParticiple: String,
                    Dificiltad: Int

            ):this()
    {
        this.L_Identificador = Ident
        this.S_Palabra = Palabra
        this.S_Traduccion = Traduccion
        this.S_EjemplosPresent = EjPresent
        this.S_EjemplosPast = EjPast
        this.S_EjemplosPastParticiple = EjPParticiple
        this.I_NivelDificiltad = Dificiltad
    }
}