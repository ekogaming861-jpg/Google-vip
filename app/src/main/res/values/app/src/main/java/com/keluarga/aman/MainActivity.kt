
package com.keluarga.aman

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dark = Color.rgb(19, 18, 31)
        val purple = Color.rgb(125, 85, 230)
        val white = Color.WHITE
        val isParent = BuildConfig.FLAVOR == "parent"

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 32, 28, 32)
            setBackgroundColor(dark)
        }

        fun addText(
            value: String,
            size: Float,
            color: Int
        ) {
            val text = TextView(this).apply {
                text = value
                textSize = size
                setTextColor(color)
                gravity = Gravity.CENTER
                setPadding(8, 14, 8, 14)
            }
            layout.addView(text)
        }

        addText("KELUARGA AMAN", 27f, white)

        addText(
            if (isParent) "DASHBOARD ORANG TUA"
            else "PERANGKAT ANAK",
            19f,
            purple
        )

        addText(
            if (isParent)
                "Aplikasi pendamping orang tua"
            else
                "Aplikasi pendamping anak",
            16f,
            white
        )

        addText(
            "Versi 1.0",
            13f,
            Color.LTGRAY
        )

        addText(
            "Project berhasil dijalankan. " +
            "Fitur koneksi perangkat dan pemantauan " +
            "akan ditambahkan pada tahap berikutnya.",
            15f,
            white
        )

        setContentView(layout)
    }
}
