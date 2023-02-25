
fun main() {
    likesChecking(11)
}

fun likesChecking(likes: Int) {
    if ((likes % 10 == 1 && likes % 100 != 11) || likes == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}