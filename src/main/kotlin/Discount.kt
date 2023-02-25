fun main() {
    finalSumOfPurchase(11000, true)
}

fun finalSumOfPurchase(sumOfPurchase: Int, permanentUser: Boolean ) {
    var temporarySumOfPurchase = 0
    if (sumOfPurchase > 10000) {
        temporarySumOfPurchase = sumOfPurchase - ((sumOfPurchase / 100) * 5)
    } else if (sumOfPurchase in 1002..9999){
        temporarySumOfPurchase = sumOfPurchase - 100
    } else {
        temporarySumOfPurchase = sumOfPurchase
    }
    isPermanentUser(permanentUser, temporarySumOfPurchase)
}

fun isPermanentUser(permanentUser: Boolean, temporarySumOfPurchase: Int) {
    val finalSumOfPurchase: Int
    if (permanentUser) {
        finalSumOfPurchase = temporarySumOfPurchase - ((temporarySumOfPurchase / 100) * 1)
    } else {
        finalSumOfPurchase = temporarySumOfPurchase
    }
    println("Сумма покупки $finalSumOfPurchase")
}