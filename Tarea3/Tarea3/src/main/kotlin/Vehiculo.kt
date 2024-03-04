class Vehiculo {
    lateinit var color: String
    lateinit var marca: String
    lateinit var modelo: String
    lateinit var placas: String
     var encendido = false
     var gasolina = 0.0


    constructor(color: String, marca: String, modelo: String, placas: String) {
        this.color = color
        this.marca = marca
        this.modelo = modelo
        this.placas = placas
    }

    fun encendido() {
        encendido = true
        println("Coche encendido")
    }

    fun apagado() {
        encendido = false
        println("Coche apagado")
    }

    fun statusCoche() {
        if (encendido == false) {
            println("El coche esta apagado")
        } else {
            println("El coche esta encendido")
        }
    }

    fun recargar(gasolina: Double): Double {
        this.gasolina = gasolina
        return this.gasolina
    }

    fun statusGasolina(): Double {
        return gasolina
    }
}
