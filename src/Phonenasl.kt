
class Phonenasl(override var number:Long,override var date: String,override var time:Double,override var code:Int):AbstractPhone(number,date,time,code){
    override fun talk(){
        println("Номер абонента $number : все еще разговаривает")
    }
}