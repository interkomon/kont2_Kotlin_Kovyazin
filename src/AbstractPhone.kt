import kotlinx.coroutines.*


abstract class AbstractPhone(override var number:Long,override var date: String,override var time:Double,override var code:Int):PhoneC {

    override fun information(){
        println("Номер телефона - $number \n Месяц в котором был осуществлен звонок -  $date \n Продолжительность разговора - $time \n Код города - $code ")
    }
    suspend fun timephone() = coroutineScope{
        delay(1000L)
        println("Введите цену за одну минуту")
        var price = readLine()!!.toInt()
        if(price <= 0) println("Ошибка, цена не может быть равна нулю или быть меньше нуля")
        var priceminute = price * time
        println("Цена за все продолжительность разговора составит: $priceminute")
    }



}