package com.example.proyecto_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.proyecto_1.databinding.ActivityMainBinding
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fresa = Fruit(10.5, "Fresa")
        val sandia = Fruit(30.0, "sandia")
        val durazno = Fruit(8.5, "durazno")
        val melon = Fruit(20.2, "melon")
        val uva = Fruit(8.2, "uva")
        val kiwi = Fruit(15.8, "kiwi")
        val naranja = Fruit(26.4, "naranja")

        fresa.id = "1"
        fresa.addStock(10)
        fresa.calidad = "Buena"
        fresa.unidadMedida = "Kg"
        fresa.estacion = "Marzo-Mayo"
        fresa.precioOferta = 9.99
        binding.tvNombre.text = fresa.nombre
        binding.tvPrecio.text = fresa.precio.toString()
        binding.tvStock.text = fresa.stock.toString()
        binding.tvCalidad.text = fresa.calidad
        binding.tvMedida.text = fresa.unidadMedida
        binding.tvEstacion.text = fresa.estacion
        binding.tvPrecioOferta.text = fresa.precioOferta.toString()

        //functions
        binding.btnVender.setOnClickListener {
            var cantidad = binding.tiVender.editableText.toString()
            fresa.vender(isInt(cantidad))
            binding.tvStock.text = fresa.stock.toString()
        }
        binding.btnAddStock.setOnClickListener {
            var cantidad = binding.tiAdd.editableText.toString()
            fresa.addStock(isInt(cantidad))
            binding.tvStock.text = fresa.stock.toString()
        }
        //second fruit
        sandia.id = "2"
        sandia.addStock(10)
        sandia.calidad = "Excelente"
        sandia.unidadMedida = "Kg"
        sandia.estacion = "Junio-Julio"
        sandia.precioOferta = 20.00
        binding.tvNombre2.text = sandia.nombre
        binding.tvPrecio2.text = sandia.precio.toString()
        binding.tvStock2.text = sandia.stock.toString()
        binding.tvCalidad2.text = sandia.calidad
        binding.tvMedida2.text = sandia.unidadMedida
        binding.tvEstacion2.text = sandia.estacion
        binding.tvPrecioOferta2.text = sandia.precioOferta.toString()

        //functions
        binding.btnVender2.setOnClickListener {
            sandia.vender(1)
            binding.tvStock2.text = sandia.stock.toString()
        }
        binding.btnAddStock2.setOnClickListener {
            sandia.addStock(1)
            binding.tvStock2.text = sandia.stock.toString()
        }
    }

    fun isInt(s: String): Int {
        try {
            return s.toInt()
        } catch (e: NumberFormatException) {
            return 0
        }
    }

}