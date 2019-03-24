package classes

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("taking the horses to the rodeo")
    }

    fun details() {
        println("This is a $towingCapacity $make $model")
    }
}