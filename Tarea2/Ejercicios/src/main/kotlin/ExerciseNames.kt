

fun main() {
    val nombres = listOf("Pedro", "Luis", "Juan", "Manuel", "Juan", "Luis", "María", "Inés", "Romeo", "Ernesto", "Juan", "Pedro", "Ariadna", "Mireya", "María", "Ana", "Sofía", "José", "Juan")
        numVecesRepetidas("Juan", nombres)
    }

    fun numVecesRepetidas(name: String, nombres: List<String>) {


            var contador = 0
            for (names in nombres) {
                if (name == names) {
                    contador++
                }

            }
            println("El nombre de $name se repite $contador ${if (contador == 1) "vez" else "veces"}")

    }

