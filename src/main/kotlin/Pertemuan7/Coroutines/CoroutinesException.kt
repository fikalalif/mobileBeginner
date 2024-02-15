package Pertemuan7.Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.Exception

fun main() = runBlocking {
    val job = launch {
        try {
            delay(2000)
            throw  Exception(" An error accured")
        }catch (e : Exception){
            println("Exception : $e")
        }
    }
    job.join()
}