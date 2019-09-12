package kotlin_basics

/*
 class Car constructor(val make: String, val model: String, var color: String) {
     fun accelerate(){
         println("vroom vroom")
     }

     fun details(){
         println("This is a $color $make $model")
     }
 }

class Truck(val make: String, val model: String, val towingCapacity: Int){
    fun  tow(){
        println("taking the horses to the rodeo")
    }

    fun details(){
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }
}

*/
/*class Car constructor(make: String, model: String) {
    val  make = make
    val model = model
}*//*


fun main() {
    val car = Car("Toyoto", "Camry", "red")
    println(car.make)
    println(car.model)
    car.accelerate() //vroom vroom
    car.details() // This is a red Toyoto Camry

    val truck = Truck("Ford","F-150", 10000)
    truck.tow()
    truck.details()
}*/

open class Vehicle(val make:String, val model:String){

    open fun accelarate(){  // open fun accelarate() allows to override the method
        println("vroom vroom")
    }

    fun park(){
        println("parking the vechile")
    }

    fun brake(){
        println("STOP")
    }



}

class Car(make: String, model: String, var color: String) : Vehicle(make, model){  //Car class extends Vechile class and get its constructor
    override fun accelarate() {  //override methods from parent class
        super.accelarate()  //prints parent class method
        println("My boy is going to teach me how to drive a car") //prints child class method
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model){

    fun tow(){   //child class can have its own methods
        println("riding to the mountains")
    }

}

fun main() {

    val tesla = Car("Tesla", "ModelS", "red")
    tesla.accelarate()

    val truck = Truck("Ford", "F150", 70000)
    truck.tow()

}