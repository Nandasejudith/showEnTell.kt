import java.util.*

fun main() {
var allCities = carpitalCities("Nairobi","Kigali","Kampala","Dodoma")
    println(allCities.bestCity())

    allCities.arrays()

    println(allCities.favFood("Matooke","Tomatoes","Irish"))

    comfirm()

    listWords()
}

class carpitalCities (var city1:String, var city2:String, var city3:String, country4:String){
    fun bestCity ():String{
        var myFeel="I like visiting $city1 and $city3"    //OOPs
        return myFeel

}

fun arrays (){
    var count = arrayOf(1,2,3,4,8,9,12)          //expecting the size of the numbers in the arrays
    println(count.size)
}

fun favFood(first:String, second:String, Third:String):String {
    return "i love "+first+","+second+" and "+Third  //function expecting a string return
}
}

fun comfirm (){
    var name ="Judith"
    if (name =="Judith"){
        println("That's me")    //Condition statement will either execute the condition while true or otherway
    }
    else{
        println("That's not me")
    }
}

fun listWords (){
    var a =arrayOf("Lovelacelab","Lisalab","AnitaB")
    for (x in a ){   //looping through an array
        println(x)
            }
    println(a[2])      //string indexing,expecting one item from the array"the one with the chosen index number"
    println(Arrays.toString(a)) //expecting the result in an array with all the items
}




