package com.helinavci.kotlinacademy
import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val arr = arrayListOf<String>()
    arr.add("ahmet")
    arr.add("mehmet")
    arr.add("ayşe")
    arr.add("feyza")
    arr.add("emir")
    println("please enter an index and a new name")
    val input = Scanner(System.`in`)
    val index = input.nextInt()
    val name = input.next()
    changePerson(index , name , arr)

}
fun changePerson( index : Int , name : String , arr : ArrayList<String>){
    arr.set(index , name)

}