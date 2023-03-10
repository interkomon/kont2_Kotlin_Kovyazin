import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    try {
        println("Введите номер")
        var number = readLine()!!.toLong()
        if (number.toString().length !== 11) { //проверка на количество цифр
            println("Ошибка. Введите 11 цифр")
        }
        println("Ведите месяц ")
        var date = readLine()!!.toString()
        println("Введите продолжительность разговора")
        var time = readLine()!!.toDouble()
        if (time <= 0) {
            println("Ошибка. Продолжительность разговора не может быть равна нулю или быть меньше нуля")
        }
        println("Ведите код города")
        var code = readLine()!!.toInt()
        if (code <= 0) {
            println("Ошибка. Код не может быть равен нулю или быть меньше нуля")
        }
        println("Введите количество функций")
        var n = readLine()!!.toInt()
        if (n <= 0) {
            println("Ошибка. Количество функций не может быть равна нулю или быть меньше нуля")
        }
        var ph = Phonenasl(number, date, time, code)
        ph.information()
        ph.timephone()
        launch {
            for (i in 1..n) {
                ph.talk()
            }
        }
        Unit
    }catch (e:Exception){
        println("Ошибка. Проверьте ввод данных")
    }

}
