package kotlin_basics

fun main() {

    //List implementation
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")

    println(imperials) //just print array
    println(imperials.sorted()) //sorted() - sorts array in alphabetic order
    println(imperials[2])  //accessing by index to array element
    println(imperials.first())  //accesing to the first element in index [0]
    println(imperials.last())  //accesing to the last element
    println(imperials.contains("Emperor"))

//---------------------------------------------------------------------------------
    //Array Implementation
    val pokemons = arrayListOf("pikachu" , "raichu" , "pichu")
    println(pokemons)  //[pikachu, raichu, pichu]
    println(pokemons.size) //3

    pokemons.add("mew")
    println(pokemons)   // [pikachu, raichu, pichu, mew]

    pokemons.add(0,"SuperPikachu")  //[SuperPikachu, pikachu, raichu, pichu, mew]
    println(pokemons)

    println(pokemons.indexOf("pikachu"))  //index 1

    pokemons.remove("SuperPikachu")  //remove element
    println(pokemons)

    //------------------------------------------------------------------

    //Map Implementation  - Key/Value pair collections
                           //Solo -Key Millenium Falson - Value
    val rebelVechilesMap = mapOf("Solo" to "Millenium Falson", "Luke" to "Landspeeder")
    println(rebelVechilesMap["Solo"])  //print key Millenium Falson
    println(rebelVechilesMap.get("Solo")) //print key Millenium Falson
    println(rebelVechilesMap.getOrDefault("Leiah", "This ship doesn`t exist")) //give access to default key value pair
    println(rebelVechilesMap.values)


    val rebelVehicles = hashMapOf("Solo" to "Millenium Falson", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive 4")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett") //removes by key
    println(rebelVehicles)

    rebelVehicles.clear()
    println(rebelVehicles)  //clear map

    rebelVehicles.isEmpty()




}