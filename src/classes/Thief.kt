package classes

class Thief (name: String, age: String, gender: String, val knifes: Int) : Player(name, age, gender) {
    fun steal(numberOfCoins: Int) {
        println("Im stealing $numberOfCoins coins!")
    }
}