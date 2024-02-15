package Pertemuan5.`class`

open class Teacher(val name: String){
    fun teach(){
        println("teach")
    }

    fun test(){
        println("mobile")
    }
}

class SuperTeacher(name: String): Teacher(name){
    fun cek(){
        super.test()
    }
}