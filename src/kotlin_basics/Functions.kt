package kotlin_basics

fun main() {

    fun forceChoke(){
        println("tea and food")  //func just printing string
    }

    fun makeAnEntrance(line: String){ //func which takes str argument
        println(line)
    }

    makeAnEntrance("What I want is") //calling functions
    forceChoke()

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int):Int {  //:Int - returnig value is type of Integer
        val goodGuys = rebels + ewoks
        return  goodGuys
    }

    val rebels = calculateNumberGoodGuys(5,  7)
    println("There are $rebels months in a calendar year")
    println("There are ${calculateNumberGoodGuys(6,6)} months in a calendar year")

    fun vaderIsFeeling(mood: String = "angry"){
        println(mood)
    }

    vaderIsFeeling("so high->")
}