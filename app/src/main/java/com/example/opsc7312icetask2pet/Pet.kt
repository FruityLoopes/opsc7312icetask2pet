package com.example.opsc7312icetask2pet

import android.widget.TextView

data class Pet (
    //Create a simple Pet class with properties like name, hunger, happiness, and cleanliness.
    var name:String
){
    var hunger:Int = 1
    var happiness:Int = 1
    var cleanliness:Int =1

    fun feed(){
        pet.hunger++
    }

    fun happy(){
        pet.happiness++
    }
    fun clean(){
        pet.cleanliness++
    }
}
    //Define methods within the class for interactions like feeding, playing, and cleaning.



