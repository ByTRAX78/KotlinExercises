fun main() {
    identificarTipo(10)
    identificarTipo(3.14)
    identificarTipo("Holaaaaaaa")
    identificarTipo(true)
    identificarTipo(null)
}
fun identificarTipo(dato: Any?) {
    when (dato) {
        is String -> println("El dato es una cadena de texto: $dato")
        is Int -> println("El dato es un entero: $dato")
        is Double -> println("El dato es un número de tipo Double: $dato")
        is Boolean -> println("El dato es un valor booleano: $dato")
        else -> println("El dato es de otro tipo: $dato")
    }
}


