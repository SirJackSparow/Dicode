package com.example.bima.submision1kade

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val deskripsi =  resources.getStringArray(R.array.deskripsi)
        val image = resources.obtainTypedArray(R.array.club_image)
        items.clear()
        for (i in name.indices){
            items.add(Item(name[i],image.getResourceId(i, 0), deskripsi[i]))
        }

        RecycleUI(RecyclerViewAdapter(this,items) {
            startActivity<DetailClubFootball>("name" to it.name,"images" to it.image, "deskripsi" to it.deskripsi)
        }).setContentView(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
    }
}

