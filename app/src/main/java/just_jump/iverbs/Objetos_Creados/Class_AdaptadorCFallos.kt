package just_jump.iverbs.Objetos_Creados

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import just_jump.iverbs.R

class Class_AdaptadorCFallos(var context: Context, Listafallos: ArrayList<String>): BaseAdapter()
{
    var item: ArrayList<String>? = null
    init
    {
        this.item = Listafallos
    }
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var holder:ViewHolder? = null
        var vista:View? = p1

        if(vista == null)
        {
            vista = LayoutInflater.from(context).inflate(R.layout.item_maquetacion_fallos,null)
            holder = ViewHolder(vista)
            vista.tag = holder
        }
        else
        {
            holder = vista.tag as? ViewHolder
        }

        val item = getItem(p0) as String

        holder!!.textFallo!!.setText(item)

        return vista!!
    }

    override fun getItem(p0: Int): Any {
        return item?.get(p0)!!
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return item?.count()!!
    }

    private class ViewHolder(vista: View)
    {
        var textFallo:TextView? = null

        init
        {
            textFallo = vista.findViewById(R.id.fallos_text)
        }
    }
}