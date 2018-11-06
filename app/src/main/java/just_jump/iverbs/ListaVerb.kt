package just_jump.iverbs

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.Menu
import android.widget.AdapterView
import just_jump.iverbs.Objetos_Creados.Class_AdaptadorCoustom
import just_jump.iverbs.Objetos_Creados.Class_IVerb
import just_jump.iverbs.Objetos_Creados.Class_ListIVerb
import just_jump.iverbs.Objetos_Creados.Class_MapListview
import kotlinx.android.synthetic.main.activity_lista_verb.*
import android.support.v7.widget.SearchView
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import android.widget.LinearLayout

class ListaVerb : AppCompatActivity(), SearchView.OnQueryTextListener
{
    //------------------------------------------------
    //   Variables Globales
    //------------------------------------------------
    private var search: SearchView? = null
    private var MyList:ArrayList<Class_MapListview> = ArrayList()
    private lateinit var adapter: Class_AdaptadorCoustom
    lateinit var icon: ImageView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_verb)

        var mytoolB: Toolbar = findViewById(R.id.toolbar_2104)
        setSupportActionBar(mytoolB)

        //------------------------------------------------
        //   Variables Locales
        //------------------------------------------------
        var objeto = Class_ListIVerb(this)
        var Contador: Int = 0

        //Crea e inicializa el objetos con la lista de verbos irrregulares
        objeto.InicializarObjetoLista()

        while(objeto.Nunelementos()> Contador)
        {
            var Nuevo: Class_IVerb = objeto.ObtenerIverb(Contador)
            MyList.add(Class_MapListview(Nuevo.S_Traduccion[0],Nuevo.S_Palabra[0],Nuevo.S_Palabra[1],Nuevo.S_Palabra[2],Nuevo.S_Palabra[0]))

            Contador ++
        }

        adapter = Class_AdaptadorCoustom(this, MyList)
        NombreLista.adapter = adapter

        NombreLista.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, Position, Ml ->

            //--------------------------------------------------------
            // llamada del Intent info-Iverb
            //--------------------------------------------------------
            var nova = adapterView.getAdapter().getItem(Position)
            var VerbBuscar = (nova as Class_MapListview).titleverb

            startActivity(DatosApasar(this, objeto.get_SVerbs(VerbBuscar)!!))
        }
    }

    //-----------------------------------------------------------------------------------------------------
    // Funcion para crear el menu de busqueda de los verbos
    //-----------------------------------------------------------------------------------------------------
    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        menuInflater.inflate(R.menu.munubuscarverbs1,menu)

        search = menu.findItem(R.id.bar_search).actionView as SearchView
        search!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS
        search!!.queryHint = getString(R.string.ListVerbBuscar)

        icon = search!!.findViewById(R.id.search_button)
        icon.setImageDrawable(resources.getDrawable(R.drawable.ic_search_black_24dp))

        icon = search!!.findViewById(R.id.search_close_btn)
        icon.setImageDrawable(resources.getDrawable(R.drawable.ic_close_black_24dp))

        val ll = search!!.getChildAt(0) as LinearLayout
        val ll2 = ll.getChildAt(2) as LinearLayout
        val ll3 = ll2.getChildAt(1) as LinearLayout
        val autoComplete = ll3.getChildAt(0) as SearchView.SearchAutoComplete

        autoComplete.setHintTextColor(Color.BLACK);
        autoComplete.setTextColor(Color.BLACK);

        search!!.setOnQueryTextListener(this)

        return true
    }

    override fun onQueryTextSubmit(p0: String?): Boolean
    {
        return false
    }
    override fun onQueryTextChange(CadenaAbuscar: String): Boolean
    {
        //-------------------------------------------------------------------------------
        //   Evento que se ejecuta cuando el texto de la consulta cambia
        //-------------------------------------------------------------------------------

        /*
        * 0. Comprobar si esta vacio
        * 1. basear listview o adaptador
        * 2. general un bucle que consiga los objetos que contengan la palabras introducida
        * 3. llenar el nuevo array con esas palabras
        * 4. cargar el adaptador con la nueva ingormacion
        * */

        if(!(CadenaAbuscar.length == 0))
        {
            var MyListaDePaso:ArrayList<Class_MapListview> = ArrayList()
            var Contador: Int = 0

            while(MyList.size > Contador)
            {
                if(MyList.get(Contador).traduccion.contains(CadenaAbuscar,true) || MyList.get(Contador).present.contains(CadenaAbuscar,true) || MyList.get(Contador).past.contains(CadenaAbuscar,true) || MyList.get(Contador).pastp.contains(CadenaAbuscar,true))
                {
                    MyListaDePaso.add(MyList.get(Contador))
                }
                else
                {
                    //Toast.makeText(this,getString(R.string.Mensaje1), Toast.LENGTH_LONG).show()
                    //  Falta por solucionar que el mensajes solo salga una ves
                }
                Contador++
            }

            adapter = Class_AdaptadorCoustom(this, MyListaDePaso)
            NombreLista.adapter = adapter
        }
        else
        {
            adapter = Class_AdaptadorCoustom(this, MyList)
            NombreLista.adapter = adapter
        }
        return false
    }
    //-----------------------------------------------------------------------------------------------------
    // Funcion para crear el Intent de la informacion del IVerb
    //-----------------------------------------------------------------------------------------------------
    fun DatosApasar(context: Context, IVerbo: Class_IVerb): Intent
    {
        var intent = Intent(context, InforVerbs::class.java)
        intent.putExtra("VerboInfo",IVerbo)

        return intent
    }
}
