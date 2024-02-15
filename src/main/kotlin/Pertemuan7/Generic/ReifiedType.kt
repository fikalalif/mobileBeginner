package Pertemuan7.Generic

inline  fun < reified T> printType(value: T){
    val type = T::class.simpleName
    println("Type data dari $value = $type")
}

fun main() {
    printType('k')
    printType("hai")
}