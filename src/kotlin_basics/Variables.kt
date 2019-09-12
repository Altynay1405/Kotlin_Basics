package kotlin_basics

fun main() {
    var name: String = "Altynay"  //var - mutable
    val isAwesome = true  //val - unmutable
    //isAwesome = false

    println("Is " + name + " awesome? The answer is: " + isAwesome)

    var a: Int = 2
    var b = 7
    println(a +b)

    val doubleNum: Double = 123.45  //64 bit
    val floatNum: Float = 123.45f  //32 bit

    val longNum =123456789010L //64 bit

    val aDouble = a.toString()

    var hero: String
    hero = "batman"
    hero = "Onizuka"
    println(hero)
}