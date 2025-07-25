package com.example.kotlinintermedio

class Programmer(name: String, age: Int, val language: String): Person(name, age), Vehicle {

    override fun work() {
        println("Esta persona esta programando")
        super.work()
    }

    fun sayLanguage() {
        println("Este programador usa el lenguaje $language")
    }

    override fun goToWork() {
        println("Esta persona va a Google")
    }

    override fun drive() {
        println("Esta persona esta conduciendo")
    }
}