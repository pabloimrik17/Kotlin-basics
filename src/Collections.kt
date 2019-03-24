fun main(args: Array<String>) {
    // IMMUTABLE LIST
    val imperials = listOf<String>("Emperor", "Darth Vader", "Boba Fett", "Tarkin")

    println(imperials)
    println(imperials.sorted())
    println(imperials.sorted()[2])
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials.contains("Luke"))

    // MUTABLE LIST
    val rebels = arrayListOf<String>("Leiah", "Luke", "Han Solo", "Mon Mothma")

    println(rebels.size)

    rebels.add("Chewbacca")
    println(rebels)

    rebels.add(0, "Lando")
    println(rebels)

    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    // INMUTABLE MAP
    val rebelVehiclesMap = mapOf<String, String>("Solo" to "Millenium Falcon")
    println(rebelVehiclesMap)
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Solo", "This ship doesnt exist"))
    println(rebelVehiclesMap.values)

    // MUTABLE MAP

    val rebelVehicles = hashMapOf<String, String>("Solo" to "Millenium", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())
}