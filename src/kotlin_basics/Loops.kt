package kotlin_basics

fun main() {
    val pokemons = arrayListOf("pikachu" , "raichu" , "pichu")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falson", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for (pokemon in pokemons){
        println("Name: $pokemon")
    }

    for ((key, value) in rebelVehicles){
        println("$key gets around in their $value")  //Solo gets around in their Millenium Falson
                                                        // Luke gets around in their Landspeeder

    }

    var x = 10

    while (x > 0){
        println(x)
        x--
    }
}