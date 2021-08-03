package com.rsk

class Person (var Name: String) {
    fun display() {
        println("Display: $Name")
    }
    //return void
    fun displayWithLambda(func: (s:String) -> Unit){
        func(Name)
    }

}


