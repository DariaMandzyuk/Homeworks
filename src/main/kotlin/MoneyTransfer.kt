
fun main() {
calculateCommission(10000)
}

fun calculateCommission(amount: Int) {
    val minLimit = 35 
    val commission: Double = amount / 100 * 0.75
    if (commission <= minLimit) {
        println("Комиссия 35 рублей")
    } else {
        println("Комиссия $commission рублей")
    }
}


