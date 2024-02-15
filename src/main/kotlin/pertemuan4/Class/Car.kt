package pertemuan4.Class

class Car {
    var name: String = "inova"
        get(){
            println("Fungsi getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi setter terpanggil")
            field = value

        }



}