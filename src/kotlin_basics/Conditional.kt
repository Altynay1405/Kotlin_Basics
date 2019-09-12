package kotlin_basics

fun main() {
    val a = 2
    val b = 3

    if (a == b){
        println("A does equals B")
    }

    if (a != b){
        println("A does not equal B")
    }

    val accountBalance = 100
    val price = 500

    if (accountBalance >= price){
        println("You can buy")
    }else{
        println("Sorry you do not have enough money")
    }

    val degrees = 59
    if (degrees >= 70){
        println("Nice weather")
    } else if (degrees < 70 && degrees >= 50){
        println("Grab a sweater")
    } else {
        println("Freezing")
    }

    val isHungry = false
    val isBored = true

   /* if (isHungry == true || isBored == true){
        println("Let`s get borch")
    }*/


    if (isHungry || isBored ){  // same as isHungry == true || isBored == true
        println("Let`s get borch")   //!isHungry -> false
    }

    val x = 6
    when (x) {
        1-> println("X is equal to 1")
        2-> println("X is equal to 2")
        else -> println("X is another number ")
    }

    fun vaderIsFeeling(mood: String = "angry"){
        if (mood == "angry"){
            println("Vader needs to walk in the park and stop being $mood")
        } else {
            println("Vader, be happy!!!")
        }
    }

    vaderIsFeeling("sad");
}