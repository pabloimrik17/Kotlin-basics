import classes.Car
import classes.Truck

fun main (args: Array<String>) {
    val printMessage = { message: String -> println(message)}

    printMessage("Hello World!")

    val sumA = { x: Int, y: Int -> x + y}
    println(sumA(5, 3))

    val sumB : (Int, Int) -> Int = {x, y -> x + y}

    println(sumB(5, 3))

    fun downloadData(url: String, completion: () -> Unit) {
        // sent download request
        // we got back data
        // there were no network errors
        completion()
    }

    downloadData("fakeurl.com", {
        println("the code in this block, will only run after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // sent download request
        // we got back data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
        // there were no network errors
    }

    downloadCarData("fakeurl.com") {car ->
        println(car.color)
        println(car.make)
    }

    downloadCarData("fakeurl.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        // sent download request
        // we got back data
        val webRequestSuccess: Boolean = true

        if (webRequestSuccess) {
            val truck = Truck("Ford", "F-150", 1000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeurl.com") { truck, success ->
        if (success) {
            truck?.tow()
        } else {
            println("Something went wrong!")
        }
    }
}