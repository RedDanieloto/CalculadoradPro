package com.example.calculadora

class Resta : Operacion() {
    override fun parse(valor1: String, valor2: String): Double {
        return valor1.toDouble() - valor2.toDouble()
    }

    override fun parse(valor1: Double, valor2: Double): Double {
        return valor1 - valor2
    }
}
