import java.util.*

fun main() {
    var likes: Int
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Введите число лайков")
        likes = scanner.nextInt()
        printLikes(likes)
    }
}

fun printLikes(likes: Int) {
    if ((likes % 100) == 11) {
        println("Понравилось $likes людям")
    } else if ((likes % 10) == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}