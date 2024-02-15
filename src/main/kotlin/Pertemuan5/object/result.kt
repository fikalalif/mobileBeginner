package Pertemuan5.`object`

import Pertemuan5.`class`.Calculator

fun main() {
    val calculator = Calculator()
    val hasilInt = calculator.tambah(5,3)

    val hasilDouble = calculator.tambah(2.5,3.5)

    println("hasil penjumlahan Int = $hasilInt")
    println("hasil penjumlahan Double = $hasilDouble")
}