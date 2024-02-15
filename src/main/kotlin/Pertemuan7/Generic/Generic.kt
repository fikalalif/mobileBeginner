package Pertemuan7.Generic

class Box<T>(val box: T)

fun main() {
    val stringBox = Box("hello,plugin")
    val valueString : String = stringBox.box

    val intBox = Box(10)
    val valueInt : Int = intBox.box

    println("$valueString \n$valueInt")
    printItem("hehe")
    printItem(99)
}

fun <B> printItem(item : B){
    println(item)
}