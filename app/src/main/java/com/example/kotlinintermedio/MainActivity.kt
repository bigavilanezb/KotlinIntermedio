package com.example.kotlinintermedio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Enum classes
        // enumClasses()

        // Nested and Inner Classes
        // nestedAndInnerClasses()

        //
    }

    enum class Direction(val dir: Int) {
        NORTH(1),
        SOUTH(-1),
        EAST(1),
        WEST(-1);

        fun description(): String {

            return when(this) {
                NORTH -> "La dirección es NORTE"
                SOUTH -> "La dirección es SUR"
                EAST -> "La dirección es ESTE"
                WEST -> "La dirección es OESTE"
            }
        }
    }

    // Lección 1 Kotlin Intermedio: Enum Classes
    private fun enumClasses() {

        // Asignación de valores
        var userDirection: Direction? = null
        println("Direction: $userDirection")

        userDirection = Direction.WEST
        println("Direction: $userDirection")

        userDirection = Direction.NORTH
        println("Direction: $userDirection")

        // Propiedades por defecto
        println("Propiedad name: ${userDirection.name}")
        println("Propiedad ordinal: ${userDirection.ordinal}")

        // Funciones
        println(userDirection.description())

        // Inicialización
        println(userDirection.dir)
    }

    private fun nestedAndInnerClasses() {

        // Clase Anidada (Nested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum = myNestedClass.sum(10, 6)
        println("El resultado de la suma es: $sum")

        // Clase Interna (Inner)
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo = myInnerClass.sumTwo(10)
        println("El resultado de sumar dos es: $sumTwo")
    }
}