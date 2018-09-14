package just_jump.iverbs.Objetos_Creados

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import just_jump.iverbs.R

class Class_AdaptadorListFallos(var context: Context, ListItem:ArrayList<Contenedor_data>):BaseAdapter()
{
    var items:ArrayList<Contenedor_data>? = null

    init
    {
        this.items = ListItem
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var holder:ViewHolder? = null
        var vista:View? = p1

        if(vista == null)
        {
            vista = LayoutInflater.from(context).inflate(R.layout.item_maquetacion_listfallos, null)
            holder = ViewHolder(vista)
            vista.tag = holder
        }
        else
        {
            holder = vista.tag as? ViewHolder
        }

        val item = getItem(p0) as Contenedor_data

        holder?.TextFallo?.text = item.NVerb
        holder?.NFallo?.text = item.Numero.toString()

        if(item.Tiempo == 0)
        {
            holder?.Tiempo?.text = context.getString(R.string.Presente)
        }
        else if (item.Tiempo == 1)
        {
            holder?.Tiempo?.text = context.getString(R.string.Pasado)
        }
        else if (item.Tiempo == 2)
        {
            holder?.Tiempo?.text = context.getString(R.string.PasadoParticipio)
        }
        else
        {
            holder?.Tiempo?.text = ""
            holder?.NFallo?.text = ""
        }

        return vista!!
    }

    override fun getItem(p0: Int): Any {
        return items?.get(p0)!!
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return items?.count()!!
    }

    private class ViewHolder(vista: View)
    {
        var TextFallo: TextView? = null
        var NFallo: TextView? = null
        var Tiempo: TextView? = null

        init
        {
            TextFallo = vista.findViewById(R.id.fallos_text)
            NFallo = vista.findViewById(R.id.NFallo)
            Tiempo = vista.findViewById(R.id.Tiempo)
        }
    }
}