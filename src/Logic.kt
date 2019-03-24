fun main(args: Array<String>) {
    val a = 2
    val b = 3

    if (a == b) {
        println("A does in fact equal B")
    } else {
        println("A doest not in fact equal B")
    }

    val accountBalance = 100
    val price = 150

    if (accountBalance >= price) {
        println("You can buy this")
    } else {
        println("Sorry, you broke!")
    }

    val degrees = 50

    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees in 50..69) { // equivalent to degrees < 70 && degrees > 50
        println("Grab a sweater")
    } else {
        println("Holy crap, its cold!")
    }

    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Lets get pizza!")
    }

    val x = 3

    when (x) {
        1 -> println("X == 1")
        2 -> println("X == 2")
        else -> println("X does not equal 1 or 2")
    }

    fun VaderIsFeelingAngry(mood: String = "angry") {
        if (mood === "angry") {
            println("Run for the hills, Vader is $mood")
        } else {
            println("whatever you do, dont make him angry")
        }
    }

    VaderIsFeelingAngry()
    VaderIsFeelingAngry("angry")
    VaderIsFeelingAngry("happy")
}