package com.helinavci.kotlinacademy
import java.util.*
fun main(){
    val input = Scanner(System.`in`)
    println("please a string")
    var str = input.next()
    var newStr = deleteVoiceLetter(str)
    println(newStr)

}
fun deleteVoiceLetter(str: String) : String{
    var newStr = ""
    for(i in 0..str.length - 1){
        if(str.get(i) == 'a' || str.get(i) == 'e' ||str.get(i) == 'ı' ||str.get(i) == 'i' ||str.get(i) == 'o' ||str.get(i) == 'ö' ||str.get(i) == 'u' ||str.get(i) == 'ü'){
                continue
        }
        else{
            newStr = newStr + str.get(i)
        }
    }
    return newStr
}