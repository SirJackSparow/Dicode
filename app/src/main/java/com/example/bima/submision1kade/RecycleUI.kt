package com.example.bima.submision1kade

import android.support.v7.widget.LinearLayoutManager
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class RecycleUI (val RecyclerViewAdapter: RecyclerViewAdapter) : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {
        verticalLayout {
            padding = dip(16)

            recyclerView {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                adapter = RecyclerViewAdapter
            }.lparams(width= matchParent, height = wrapContent)
        }
    }
}