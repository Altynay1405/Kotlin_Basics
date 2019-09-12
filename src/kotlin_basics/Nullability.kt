package kotlin_basics

fun main() {
     var name : String = "Altynay"
    //name = null  //Error null can not be a value of a non-null type string

    var nullableName : String? = "? signs means var can be nullable"

    println(nullableName)
   // println(nullableName.length)  //Error only safe non null type can get the length

    nullableName = null
    //Null check
    var length = 0
    if (nullableName != null){
       // println(nullableName.length)  //33
        length = nullableName.length
    } else{
        length = -1
    }
    println(length)   //-1

   val l = if (nullableName != null) nullableName.length else -1

    //Safe Call Operator
    println(nullableName?.length)  //null

    //Elvis Operator
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me "

    println(noName.length)  //16

    // !!
    //println(nullableName!!.length)   //Error can not get the length of null element



}