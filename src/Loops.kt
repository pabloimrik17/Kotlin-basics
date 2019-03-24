fun main(args: Array<String>) {
    val rebels = arrayListOf<String>("Leiah", "Luke", "Han Solo", "Mon Mothma")
    val rebelVehicles = hashMapOf<String, String>("Solo" to "Millenium", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    rebels.forEach {
        println(it)
    }

    rebelVehicles.forEach {
        println("Key: ${it.key}, Value: ${it.value}")
    }

    var x = 10

    while (x > 0) {
        println(x)
        x--
    }

    var y = 0
    while (y < 10) {
        println(y)
        y++
    }
}