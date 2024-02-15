package pertemuan4.Class

class Smartphone (var name : String, var brand: String, var year: Int, var isAndroid: Boolean)

val Smartphone.getSmartphoneInfo: String
    get() = "Nama = ${this.name}, Brand = ${this.name}, Tahun Rilis ${this.year}, SO = ${this.isAndroid}"