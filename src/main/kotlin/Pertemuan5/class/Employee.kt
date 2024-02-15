package Pertemuan5.`class`
//inheritance
open class Employee (val name: String) {
    fun sayHello(name: String){
        println("hello $name my name is ${this.name}")
    }
}

class Manager (name: String) : Employee(name)