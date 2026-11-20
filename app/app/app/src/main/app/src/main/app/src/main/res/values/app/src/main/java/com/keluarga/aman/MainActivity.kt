
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

        val isParent = BuildConfig.FLAVOR == "parent"

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 32, 28, 32)
            setBackgroundColor(Color.rgb(19, 18, 31))
        }

        fun addText(value: String, size: Float, color: Int) {
            layout.addView(TextView(this).apply {
                text = value
                textSize = size
                setTextColor(color)
                gravity = Gravity.CENTER
                setPadding(8, 14, 8, 14)
            })
        }

        addText("KELUARGA AMAN", 27f, Color.WHITE)
        addText(
            if (isParent) "DASHBOARD ORANG TUA" else "PERANGKAT ANAK",
            19f,
            Color.rgb(160, 120, 255)
        )
        addText("Versi 1.0", 14f, Color.LTGRAY)
        addText(
            "Aplikasi berhasil dijalankan. Fitur berikutnya akan ditambahkan.",
            16f,
            Color.WHITE
        )

        setContentView(layout)
    }
}
