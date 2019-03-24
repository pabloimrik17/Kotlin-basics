package classes

open class Player constructor(val name: String, val age: String, val gender: String) {
    fun attack () {
        println("Attack!");
    }

    fun defend () {
        println("Defend!");
    }

    fun walk () {
        println("Walk!");
    }
}