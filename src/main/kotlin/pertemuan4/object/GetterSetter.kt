package pertemuan4.`object`

import pertemuan4.Class.Car

fun main() {
    val pluginCar = Car()
    println("Nama Mobil = ${pluginCar.name}")
    pluginCar.name = "Avanza"
    println("Nama Mobil = ${pluginCar.name}")
}