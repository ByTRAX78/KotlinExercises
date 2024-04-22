package com.example.myapplication2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccept: Button
    private lateinit var text_t: EditText
    private lateinit var text_t1: EditText
    private lateinit var text_t2: EditText
    private lateinit var text_t3: EditText
    private lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encuentra el Button por su ID definido en XML
        btnAccept = findViewById(R.id.btnAccept)

        // Encuentra el TextView por su ID definido en XML
        text_t = findViewById(R.id.editText)
        text_t1 = findViewById(R.id.editText2)
        text_t2 = findViewById(R.id.editText3)
        text_t3 = findViewById(R.id.editText4)

        imageView = findViewById(R.id.Status)

        // Ahora puedes usar btnAccept y text_t en tu código
        btnAccept.setOnClickListener {
            // Obtener el texto del EditText
            val inputText = text_t.text.toString().trim() // Obtiene el texto y elimina espacios en blanco al inicio y al final
            val inputText1 = text_t1.text.toString().trim()
            val inputText2 = text_t2.text.toString().trim()
            val inputText3 = text_t3.text.toString().trim()
            // Verificar si el texto no está vacío
            if (inputText.isNotEmpty() && inputText1.isNotEmpty() && inputText2.isNotEmpty() && inputText3.isNotEmpty()) {
                // Cambiar la imagen de la ImageView
                imageView.setImageResource(R.drawable.correct) // Reemplaza "mi_imagen" con el nombre de tu imagen en la carpeta drawable
                // Hacer visible la ImageView
                imageView.visibility = ImageView.VISIBLE

            } else {
                // Cambiar la imagen de la ImageView
                imageView.setImageResource(R.drawable.incorrect) // Reemplaza "mi_imagen" con el nombre de tu imagen en la carpeta drawable
                // Hacer visible la ImageView
                imageView.visibility = ImageView.VISIBLE
            }
        }
    }
}
