package com.example.kotlinintermedio

class Designer(name: String, age: Int): Person(name, age) {

    override fun work() {
        println("Esta persona esta diseñando")
        super.work()
    }
}