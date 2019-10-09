package com.example.epoxy

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass(layout = R.layout.list_item)
abstract class SingleData : EpoxyModelWithHolder<SingleData.DataHolder>() {

    @EpoxyAttribute
    var id: Long = 0

    @EpoxyAttribute
    var title: String? = ""

    @EpoxyAttribute
    var name: String = ""


    override fun bind(holder: DataHolder) {

        holder.title?.text = title
        holder.name?.text = name
    }


    inner class DataHolder : EpoxyHolder() {

        var title: TextView? = null
        var name: TextView? = null
        override fun bindView(itemView: View?) {
            title = itemView?.findViewById(R.id.title)
            name = itemView?.findViewById(R.id.name)
        }

    }
}