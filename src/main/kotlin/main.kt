fun main(){
    var fullName = "Dmitriy Malayev"
    val lastName: String = "Malayev"   //explicitly providing data type to a variable
    val emptyName = ""
    println("Hello World")
    println(fullName)
    print(emptyName.isEmpty())
    fullName = "okie"
    println(fullName)
    println(fullName::class)
    println(lastName)

    val myByte: Byte = 8  //8-bit signed integer
    val myShort: Short = 16 //16-bit signed integer
    val myInt : Int = 32  // 32-bit signed integer   (most common)
    val myLong : Long = 64 //64-bit signed integer

    //Decimals
    val myFloat: Float = 32.00F //32-bit floating point number
    val myDouble: Double = 64.00 //64-bit floating point number

//    println(myByte.toDouble())




/*
val is read only
var can be reassigned
*/
}