package com.helinavci.kotlinacademy

class dikdortgen(uzunluk : Int , genislik : Int){
    val uzunluk = uzunluk
    val genislik = genislik
    fun alan() : Int{
        return uzunluk * genislik
    }
    fun cevre() : Int{
        return 2 *( uzunluk + genislik)
    }

}
fun main(){
    val dikdortgen1 = dikdortgen(15 , 20)
    println("alan = ${dikdortgen1.alan()} ")
    println( "çevre = ${dikdortgen1.cevre()}")
}