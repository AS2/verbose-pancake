class Player(var name : String, var hp : Int = 100, var xp : Int = 0, var lvl : Int = 1) {
    private val maxHP = 100
    private val maxInventory = 20

    private var backpack = Array<String>(20, {"<empty>"})
    private var items_count = 0

    fun deathPenalty() {
        xp /= 2
        if (hp > 5)
            hp = 5
    }

    fun dropThing(item: String) {
        var drop = 0;
        for (i in 0..19)
            if (item == backpack[i] && drop == 0) {
                backpack[i] = "<empty>"
                drop = 1
                items_count -= 1
            }
    }

    fun storeThing(item: String) {
        var buy = 0;
        for (i in 0..19)
            if (item == backpack[i] && buy == 0) {
                backpack[i] = "<empty>"
                buy = 1
            }
    }
}

fun main (args: Array<String>) {
    var Vasya = Player("Vasya")


}
