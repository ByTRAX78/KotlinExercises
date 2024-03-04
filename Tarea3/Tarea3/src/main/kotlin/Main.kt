
    fun main() {
        val vehiculo = Vehiculo("Rosita", "Porsche", "911 GT3 RS", "S60-ADA")
        vehiculo.statusCoche()
        vehiculo.encendido()
        vehiculo.statusCoche()
        println("El tanque de la gasolina esta en " + vehiculo.statusGasolina() + " Litros")
        vehiculo.recargar(50.0)
        println("El tanque de la gasolina esta en " + vehiculo.statusGasolina() + " Litros")
        val person = Person("Adrian", "Martinez", "Masculino", 1.80)
    }

