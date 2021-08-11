package com.rsk

class Question {
    //? means the value can be null
    var Answer:String? = null
    var CorrectAnswer = "42"
    var  Question: String = "What makes eveybody happy?"

    fun display(){
        println("You said the answer is ${Answer}")
    }
}