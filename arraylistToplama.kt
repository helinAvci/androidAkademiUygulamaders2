package com.helinavci.kotlinacademy
import java.util.*
fun arraySum( arr : ArrayList<Int>) : Int{
    var sum = 0
    for(i in 0..4){
        sum += arr[i]
    }
    return sum
}
fun main(){
    val arr = ArrayList<Int>()
    val input = Scanner(System.`in`)
    println("please enter 5 integer")
    for(i in 1..5){
        var num = input.nextInt()
        arr.add(num)
    }
    val sum = arraySum(arr)
  
    println("the sum of this 5 number is $sum")
}
