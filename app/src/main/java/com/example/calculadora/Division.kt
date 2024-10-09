package com.example.calculadora

class Division : Operacion() {
    override fun parse(valor1: String, valor2: String): Double {
        return if (valor2.toDouble() != 0.0) {
            valor1.toDouble() / valor2.toDouble()
        } else {
            Double.NaN
        }
    }

    override fun parse(valor1: Double, valor2: Double): Double {
        return if (valor2 != 0.0) {
            valor1 / valor2
        } else {
            Double.NaN
        }
    }
}
