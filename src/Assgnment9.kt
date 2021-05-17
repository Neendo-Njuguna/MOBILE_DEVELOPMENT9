fun main() {
    var holder= mutableListOf<String>("Cow","Cat","Pig","Sheep","Goat","Carmel","Rabbit","Koala","Calf","Lamb")
      println(evenNames(holder))

    var Height= listOf(4.89,5.76,5.53,6.90,4.56)
    var HeighT= height(Height)
    println(HeighT.average)
    println(HeighT.sum)

    human()

    plusHuman()

    var details = listOf(
        Objects("KAZ123K",120),
        Objects("KCD129O",80),
        Objects("KPQ876H",37)
    )
    println(carObject(details))

}


fun evenNames(names:List<String>):List<String>{
    var even= mutableListOf<String>()
        for(name in names){
            if (names.indexOf(name)%2==0){
                even.add(name)
            }
        }
        return(even)
    }

data class Measurement(var average:Double, var sum:Double)
fun height(Height:List<Double>):Measurement{
    var avg= Height.average()
    var sum= Height.sum()
    var avgsum= Measurement(avg,sum)
    return avgsum

}

data class Human(var name:String, var age:Int, var height:Double, var weight:Double)
fun human(){
    var Human= mutableListOf(
        Human("Kamau",72,6.45,78.79),
        Human("Kimani",24,5.83,45.34),
        Human("Kasuku",56,4.78,59.67),
    )
    var sortAge= Human.sortedByDescending{human -> human.age}
    println(sortAge)
}

data class HumanBeing(var name:String, var age:Int, var height :Double, var weight: Double)
fun plusHuman(){
    var Human= mutableListOf(
        Human("Kamau",72,6.45,78.79),
        Human("Kimani",24,5.83,45.34),
        Human("Kasuku",56,4.78,59.67),
    )
    Human.addAll(listOf(
        Human("Kinuthia",45,6.56,42.13),
        Human("Kasamani",34,8.61,90.13),
    ))
    println(Human)

}

data class Objects(var registration:String, var mileage:Int)
fun carObject(details:List<Objects>):Int{
    var sum = 0
  details.forEach{ detail -> sum+= detail.mileage}
    var average = sum / details.size
   return average
}
