
fun main() {
calculateCommission(10000)
}

fun calculateCommission(amount: Int) {
    val minLimit = 35 // Это значение неизменное, поэтому будет val
    val commission: Double = amount / 100 * 0.75
    if (commission <= minLimit) {
        println("Комиссия 35 рублей")
    } else {
        println("Комиссия $commission рублей")
    }
}
/*
создаю  стат функцию посчить комиссию
в этом методе у меня будет один параметр (амоунт amount: Int)
comission нужно проинициализировать либо вал либо вар
comission = 5*0.75

if comission > условия { здесь выполняется код который удовл это условия - Println} else { условие кот не удовлетворяет тому которое прописано в ифебез условия
сначала высчитать комиссию из амоунта который передала, потом проверка через иф элсе что комиссия составляет 35 р
если меньше то через принтлп выводить в консоль сообщение
если больше то выводить в консоль ваш размер комиссии  такой то такой то
этот метод должен возвращать комиссию если она больше 35 меньше
 */
