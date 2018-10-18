package com.example.bima.submision1kade

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.view.Gravity
import android.view.View
import org.jetbrains.anko.*

class DetailClubFootball : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        val name = intent.getStringExtra("name")
        val image = intent.getIntExtra("images", 0)
        val deskripsi = intent.getStringExtra("deskripsi")


        DetailUi(name, image, deskripsi).setContentView(this)
    }

    class DetailUi (val name: String, val gambar:Int, val deskripsi: String) : AnkoComponent<DetailClubFootball>{
        override fun createView(ui: AnkoContext<DetailClubFootball>) : View =  with(ui) {
            verticalLayout {
                imageView {
                    setImageResource(gambar)
                    setPadding(0,0,0,8)

                }.lparams(width= wrapContent, height =300){
                    marginStart = dip(10)
                }

                textView {
                    text = name
                    textSize = 20f
                    textColor = Color.GRAY
                    gravity = Gravity.CENTER_HORIZONTAL
                    setPadding(0,0,0,16)
                }.lparams(width= matchParent, height = wrapContent)

                textView {
                    text = deskripsi
                    textColor = Color.GRAY
                    textSize = 12f
                    setPadding(7,0,7,0)
                }.lparams(width= matchParent, height = wrapContent)
            }
        }

    }
}

