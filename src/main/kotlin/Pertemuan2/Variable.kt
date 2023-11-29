package Pertemuan2

fun main() {

    var namadepan= "pineapple"
    namadepan = "rifyal"
    val namabelakang = "trauma perang"
    println("$namadepan $namabelakang")

    val tete = arrayOf("makan","asu","gamaw",1,2,3,4,6,7,78,8,9)
    val a = tete.contains("jaja")
    val b = tete.indexOf("gamaw")
    val c = tete.get (9)
    println("$a $b $c")

    val text : String? = "samsung"
    val textLength = text?.length
    println(textLength)

    var rifyal = 'A' // A = 0041 A = 0042
    println ("rifyal =" + rifyal++)
    println ("rifyal =" + rifyal++)
    println ("rifyal =" + rifyal++)
    println ("rifyal =" + rifyal++)
    println ("rifyal =" + rifyal++)
    println ("rifyal =" + rifyal++)

    val integerList = listOf(4,2,1,5,1,2)
    val integerSet = setOf(4,2,1,5,1,2)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
        "Slawi" to "Tegal"
    )

        println(integerList)
        println(integerList[3])
        println(integerSet)

        println(capital["Slawi"])

    val anylist = mutableListOf('c',"mamank",9,0.5,true,User())

    anylist.add('a')
    anylist.add(0,"halooooo")
    anylist[5]=false
//    anylist.removeAt(5)

    println("MutableList=$anylist")

    println("01/02")


}
fun User(){

}