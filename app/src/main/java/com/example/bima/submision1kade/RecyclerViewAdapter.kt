package com.example.bima.submision1kade

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import org.jetbrains.anko.AnkoContext




class RecyclerViewAdapter (private val context: Context, private val items: List<Item>, private val listener: (Item)-> Unit )
      :RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(AnkoDesign().createView(AnkoContext.create(context, parent, false)))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder : ViewHolder, position: Int) {
      holder.bindItem(items[position],listener)
    }

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer{

        var name = itemView.findViewById<TextView>(AnkoDesign.name)
        var image = itemView.findViewById<ImageView>(AnkoDesign.images)

        fun bindItem(items: Item, listener: (Item) -> Unit) {
            name.text = items.name
            Glide.with(itemView.context).load(items.image).into(image)
            containerView.setOnClickListener { listener(items) }
        }
    }
}