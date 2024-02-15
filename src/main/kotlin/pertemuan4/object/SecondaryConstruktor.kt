package pertemuan4.`object`

import pertemuan4.Class.Laptop

fun main() {
    val pluginLaptop = Laptop("thinkpad", "lenovo", 2023, 10000000)
    println("nama = ${pluginLaptop.name}, brand = ${pluginLaptop.brand}, year = ${pluginLaptop.year}, harga = ${pluginLaptop.price}")
}