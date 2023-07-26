package com.helinavci.kotlinacademy

open class Arac(val hiz : Int , val yakitTuketim : Int){

}
class Otomobil(hiz : Int ,yakitTuketim : Int,val marka : String ,val  model : String ,val  beygir:Int ,val  bagajHacmi : Double) : Arac(hiz , yakitTuketim){
    var isbagajopen = false
    fun bagajac(){
        this.isbagajopen = true
    }
fun main(){
    val otomobil1 = Otomobil(10 , 15, "hudai" , "c3" , 1 , 100.0)
    otomobil1.bagajac()
    println(otomobil1.isbagajopen)
}
