package kotlin_basics

fun main() {
    val str = "Great Teacher Onizuka"
    println(str)

    val str1 = "Mom said: \"do not be lazy\"  \n ok "
   println(str1)


    val rawCrawl = """ >A long time ago,
       > in a galaxy 
       > far away
       > bla bla...""".trimMargin(">")
    println(rawCrawl)

   /* for (char in str){  //advanced for loop
        println(char)
    }*/

    val contentEquals = str.contentEquals("Great Teacher Onizukas") //comparing value of 2 strings
    println(contentEquals)

    val contains = str.contains("onizuka", true) //comparing two str do they have any same str value
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4,10)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vechile = "landspeeder"

    println("$luke has a $lightSaberColor lightsaber and drives $vechile") //access a var value  //Luke Skywalker has a green lightsaber and drives landspeeder
    println("Lukes full name $luke has ${luke.length} characters ")  //Lukes full name Luke Skywalker has 14 characters
    println("Lukes full name $luke has ${luke.toUpperCase()} ")   //Lukes full name Luke Skywalker has LUKE SKYWALKER
}