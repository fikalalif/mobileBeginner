package pertemuan3

fun main(){
    operator()
    perbandingan()
    logika()
    kondisi()
    perulangan()

}

fun operator(){
    //    operator aritmatika
    val plus = 5+5
    val minus = 5-5
    val kali = 5*5
    val bagi = 5/5
    val mod = 5%5

    println("ini penjumlahan = $plus ")
    println("ini pengurangan = $minus")
    println("ini perkalian = $kali ")
    println("ini pembagian = $bagi ")
    println("ini modulus = $mod ")
}

fun perbandingan(){
    val a = 10
    val b = 5

    val lebihdari = a > b
    val kurangdari = a < b
    val lebihdarisamadengan = a >= b
    val kurangdarisamadengan = a <= b
    val samadengan = a == b
    val tidaksamadengan = a != b

    println("lebih dari = $lebihdari")
    println("kurang dari = $kurangdari")
    println("lebih dari sama dengan = $lebihdarisamadengan")
    println("kurang dari sama dengan = $kurangdarisamadengan")
    println("sama dengan = $samadengan")
    println("tidak sama dengan = $tidaksamadengan")
}

fun logika(){
    val and = 10 >= 10 && 12 > 11
    println(and)
    val or = 10 > 10 || 12 > 11
    println(or)
    val negasi = !true
    println("negasi dari true = $negasi")
}

fun kondisi(){

    val nilai = 70

    if (nilai > 50){
        println("lulus")
    }else{
        println("tidak lulus")
    }
    if (nilai >= 70){
        println("a")
    } else if (nilai < 60){
        println("b")
    } else{
        println("c")
    }
    println("soto")
    println("nasi padang")
    println("bakso")

    val number = "pilih makan"
    val hasil = when (number){
        "soto" -> "10000"
        "nasi padang" -> "12000"
        "bakso" -> "15000"
        else -> "kebuli"
    }
    println(hasil)
}

fun perulangan (){
    for( i in 5 downTo 1 ){
        println("nilai = $i")
    }

    val cars = arrayOf("volvo","bmw","merci")
    for (x in cars){
        println(x)
    }
    var nilai = 1
    while (nilai <= 5){
        println("nilai = $nilai")
        nilai++
    }
    var i = 1
    do {
        println("nilai = $i")
        i++
    }while (i <= 5)

}