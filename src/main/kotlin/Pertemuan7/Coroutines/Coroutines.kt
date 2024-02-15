package Pertemuan7.Coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    //contoh launch
    launch {
        delay(2000)
        println("coroutines is running")
    }
    delay(1000)
    println("heheh ini ak")

    //contoh async
    val deferred =
        async {
            delay(3_000)
            "hello from async"
        }
    println(deferred.await())
}