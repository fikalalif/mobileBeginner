package pertemuan4.`object`

import pertemuan4.Class.Smartphone
import pertemuan4.Class.getSmartphoneInfo

fun main() {
    val pluginSmartphone = Smartphone("Redmi", "Xiaomi", 2021, true)
    println(pluginSmartphone.getSmartphoneInfo)
}