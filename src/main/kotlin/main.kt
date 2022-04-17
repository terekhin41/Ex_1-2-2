fun main() {
    while (true) {
        print("Введите количество лайков: ")
        val likes = readLine()?.toIntOrNull() ?: continue
        val ending =
            if (likes % 10 == 1 && likes % 100 != 11)
                "человеку"
            else "людям"
        println("Понравилось $likes $ending")
    }
}