package com.example.proyecto_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.proyecto_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fresa = Fruit(10.5, "Fresa")
        val sandia = Fruit(30.0,"sandia")
        val durazno = Fruit(8.5,"durazno")
        val melon = Fruit(20.2,"melon")
        val uva = Fruit(8.2,"uva")
        val kiwi = Fruit(15.8,"kiwi")
        val naranja = Fruit(26.4,"naranja")
        
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
            fresa.vender(cantidad.toInt())
            binding.tvStock.text = fresa.stock.toString()
        }
        binding.btnAddStock.setOnClickListener{
            var cantidad = binding.tiAdd.editableText.toString()
            fresa.addStock(cantidad.toInt())
            binding.tvStock.text = fresa.stock.toString()
        }
    }

}