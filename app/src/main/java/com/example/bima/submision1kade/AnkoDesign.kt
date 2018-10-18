package com.example.bima.submision1kade

import android.graphics.Color
import android.support.constraint.ConstraintLayout
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class AnkoDesign : AnkoComponent<ViewGroup> {

    companion object {
        val images = 1
        val name = 2
    }
    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        linearLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView(R.drawable.img_barca){
                id = images
                layoutParams = LinearLayout.LayoutParams(100, 100)
                setImageResource(R.color.colorAccent)
            }

            textView(text = "Barcelona FC") {
                id = name
                layoutParams = LinearLayout.LayoutParams(matchParent, 100)
                text = "Nama Tim"
                textColor = Color.BLACK
                gravity = Gravity.CENTER_VERTICAL
                setPadding(16, 0, 0, 0)
            }
        }
    }

}