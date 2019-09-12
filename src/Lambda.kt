import kotlin_basics.Car
import kotlin_basics.Truck

fun main() {
    val printMessage = {message: String -> println(message)} //message: String - parameters println(message) - body func

    /*fun printMessage(message: String){
        println(message)
    }*/

    printMessage("Hello World!")


  //Different way to use lambda expression:
    val sumA = {x: Int, y: Int -> x + y}  //1
    println(sumA(5,3))

    val sumB: (Int, Int) -> Int = {x,y -> x + y} //2
    println(sumB(15,31))

    fun downloadData(url: String, completion: ()-> Unit){
        //sent a download request
        // we got back data
        //there were no network errors
        completion()
    }

    //call downloadData() function
    downloadData("fakeUrl.com",{
        println("The code in this block, will only run  after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit){
        //send a download request
        //we got back car data
        val car = Car("Tesla","ModelX", "blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)
    }

 /*   downloadCarData("fakeUrl.com"){ //if it`s only one parameter you can skip that parameter and use it
        println(it.color)
        println(it.make)
        println(it.model)
    }*/

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit){
        //make the web request
        //we get the results back
        val webRequestSuccess = true
        if (webRequestSuccess){
            //received truck data
            val truck = Truck("Ford", "F150", 100000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){truck, success ->
        if (success == true){
            //do something with our truck
            truck?.tow()
        } else {
            //handle the web request failure
            println("Something went wrong")
        }
    }
}