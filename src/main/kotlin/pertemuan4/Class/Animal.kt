package pertemuan4.Class

class Animal (
    val name : String,
    val weigt : Double,
    val age : Int,
    val isMamal : Boolean
) {
    fun eat(){
        println("hai $name waktunya makan !")
    }

    fun sleep(){
        println("hai $name waktunya tidur")
    }
}