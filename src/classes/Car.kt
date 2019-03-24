package classes

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {


    fun details() {
        println("This is a $color $make $model")
    }

    override fun accelerate() {
        println("We are going ludicrous model!");
    }
}