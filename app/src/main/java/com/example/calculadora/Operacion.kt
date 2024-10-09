package com.example.calculadora

open class Operacion {
    open fun parse(valor1: String, valor2: String): Double {
        return 0.0
    }

    open fun parse(valor1: Double, valor2: Double): Double {
        return 0.0
    }
}
