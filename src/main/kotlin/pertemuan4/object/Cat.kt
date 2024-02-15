package pertemuan4.`object`

import pertemuan4.Class.Animal

//val namaObject = namaClass([propertinya])

fun main() {
    val pluginCat = Animal ("mili",2.2,2,true)
    println("Nama = ${pluginCat.name}, Berat = ${pluginCat.weigt}, Usia = ${pluginCat.age} Tahun, Mamalia = ${pluginCat.isMamal}")
    pluginCat.eat()
    pluginCat.sleep()

}

