package pertemuan3a

fun main () {
    val tugas = 30
    val uas = 10
    val uts = 60
    val average = 3
    val i = (tugas + uas + uts) / average
    println(i)

    if (i in 75 ..100) {
        println("LULUS dengan nilai A")
    } else if (i in 65..75) {
        println("LULUS dengan nilai B")
    } else if (i in 55.. 65) {
        println("TIDAK LULUS dengan nilai C")
    } else if (i in 45..55) {
        println("TIDAK LULUS dengan nilai D")
    } else if (i in 0..45) {
        println("TIDAK LULUS dengan nilai E")
    }

}
