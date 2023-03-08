import java.awt.Color

fun main(){
    val cars = Car("LandRover","Discovery","black",8)
    cars.carry(10)
    cars.identity()
    cars.calculateParkingFees(2)
    cars.make
    cars.model
    cars.colour
    cars.capacity

    val bus = Bus("Mercedes-Benz","Tour-rider","White",55)
    bus.maxTripFare(40.50)
    bus.calculateParkingFees(2)
    bus.make
    bus.model
    bus.colour
    bus.capacity


}
 open class Car(var make:String, var model:String, var colour:String, var capacity:Int){
    fun carry(people:Int,) {
        if (people <= capacity) {
            println("Carrying $people passengers")

        } else {
            val x = people-capacity
            println("Over capacity by $x")
        }
    }
    fun identity(){
        println("I am a $colour $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        return hours*20
                                       }
                            }

class Bus(make:String, model:String, colour:String, capacity:Int):Car(make, model, colour, capacity){
    fun maxTripFare(fare:Double):Double{
        return capacity*fare
    }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        return capacity*hours
    }
}


