package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var display: EditText
    private var operacion: String? = null
    private var valor1: Double = 0.0
    private var valor2: Double = 0.0
    private var esNuevoNumero: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display)
    }

    fun numeroPulsado(view: View) {
        val boton = view as Button
        val numero = boton.text.toString()

        if (esNuevoNumero) {
            display.setText(numero)
            esNuevoNumero = false
        } else {
            display.append(numero)
        }
    }

    fun operacionPulsada(view: View) {
        val boton = view as Button
        operacion = boton.text.toString()
        valor1 = display.text.toString().toDoubleOrNull() ?: 0.0
        esNuevoNumero = true
    }

    fun calcular(view: View) {
        valor2 = display.text.toString().toDoubleOrNull() ?: 0.0
        var resultado = 0.0

        when (operacion) {
            "+" -> resultado = valor1 + valor2
            "-" -> resultado = valor1 - valor2
            "×" -> resultado = valor1 * valor2
            "÷" -> {
                if (valor2 != 0.0) {
                    resultado = valor1 / valor2
                } else {
                    display.setText("Error")
                    return
                }
            }
        }

        display.setText(resultado.toString())
        esNuevoNumero = true
    }

    fun resetear(view: View) {
        display.setText("0")
        valor1 = 0.0
        valor2 = 0.0
        esNuevoNumero = true
    }
}
