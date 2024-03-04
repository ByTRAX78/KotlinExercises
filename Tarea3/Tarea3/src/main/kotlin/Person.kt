class Person{
    lateinit var nombre : String
    lateinit var apellidos : String
    lateinit var sexo : String
    var Altura = 0.0

    constructor(nombre: String, apellidos: String, sexo: String, Altura: Double) {
        this.nombre = nombre
        this.apellidos = apellidos
        this.sexo = sexo
        this.Altura = Altura
    }
}
