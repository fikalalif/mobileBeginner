package Pertemuan5.`class`

import Pertemuan5.`class`.Exception.ValidationException

fun validateAndSayHello(name : String) {
    if(name.isBlank()){
        throw ValidationException("name is blank")
    }else{
        println("hello $name")
    }
}

fun main(){


    try{
        validateAndSayHello("plugin")
        validateAndSayHello("")
    }catch (error : ValidationException){
        println("terjadi error ${error.message}")
    } finally {
        println("program berjalan")
    }
//    jika eror dan ada blok ketiga nanti blok keetiga tidak akan dieksekusi
    validateAndSayHello("plugin")
    validateAndSayHello("") //  jika nama diisi nanti program akan berjalan

}