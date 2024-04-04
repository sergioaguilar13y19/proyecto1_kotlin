package com.example.proyecto_1

class Fruit(var precio: Double, var nombre: String) {
    var estacion = ""
    var precioOferta:Double? = null
    var stock = 0
    var id = ""
    var calidad = ""
    var unidadMedida = ""

    fun addStock(cantidad: Int) {
        stock += cantidad
    }

    fun vender(cantidad: Int) {
        if (stock == 0 || cantidad > stock) {
            println("Se ha excedido el stock Disponible")
            return
        }
        stock -= cantidad
    }
}