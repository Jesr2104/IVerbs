package just_jump.iverbs.Objetos_Creados

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import just_jump.iverbs.R

class Class_AdaptadorCoustom(var context: Context, Item:ArrayList<Class_MapListview>) :BaseAdapter(){

    var item:ArrayList<Class_MapListview> = ArrayList()

    init {
        this.item = Item
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var holder:viewHolder? = null

        var vista:View? = p1

        if(vista == null)
        {
            vista = LayoutInflater.from(context).inflate(R.layout.tem_maquetacionlistview,null)
            holder = viewHolder(vista)
            vista.tag = holder
        }
        else
        {
            holder = vista.tag as? viewHolder
        }

        var items = getItem(p0) as Class_MapListview

        holder?.present?.text = items.present
        holder?.past?.text = items.past
        holder?.pastp?.text = items.pastp

        //Solo deja una traduccion para mantener el aspecto
        var dato1 = items.traduccion.split(" ")
        holder?.traduccion?.text = dato1[0]

        holder?.TitleVerb?.text = items.titleverb

        return vista!!
    }

    override fun getItem(p0: Int): Any {
        return item?.get(p0)!!
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return item.count()!!
    }

    private class viewHolder(vista:View){

        var traduccion:TextView? = null
        var present:TextView? = null
        var past:TextView? = null
        var pastp:TextView? = null
        var TitleVerb:TextView? = null

        init {
            traduccion = vista.findViewById(R.id.DatosTraduccion)
            present = vista.findViewById(R.id.Datos1Present)
            past = vista.findViewById(R.id.Datos2Past)
            pastp = vista.findViewById(R.id.Datos3PP)
            TitleVerb = vista.findViewById(R.id.TitleVerb)
        }
    }
}