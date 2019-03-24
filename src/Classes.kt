import classes.*

fun main(args: Array<String>) {
    val tesla = Car("Tesla", "ModelS", "Red")

    val player = Player("a", "18", "Male");
    player.attack()
    player.defend()
    player.walk()

    val thief = Thief("b", "12", "Male", 3)
    thief.steal(4)

    val warrior = Warrior("c", "14", "Female", 23)
    warrior.taunt()
}