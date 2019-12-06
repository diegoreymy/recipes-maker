fun main() {
    menu()
}

fun menu() {
    val options = listOf<String>("Hacer una receta", "Ver mis recetas", "Salir")
    val title = ":: Bienvenido a Recipe Maker ::\n"
    val subTitle = "Selecciona la opción deseada"

    println(title)
    println(subTitle)

    for ((index, option) in options.withIndex()) {
        println("${index.plus(1)} - $option")
    }

    do {
        val userResponse: String? = readLine()
        try {
            when (val response: Int = userResponse?.toInt() ?: 0) {
                in 1..3 -> println(options[response.minus(1)])
                else -> println("Opción Inválida")
            }
        } catch (e: NumberFormatException) {
            println("Opción Inválida")
        }
    }while (!(userResponse?.equals("3"))!!)
}






