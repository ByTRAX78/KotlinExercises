fun main() {

    println(areaRectangulo(5.0,10.0))
    println(volumenPrismaRectangular(5.0,5.0,10.0))
    println(promedio(calThree = 10f))
    println(tipoTriangulo(5,5,5))

}
fun areaRectangulo(base : Double, altura : Double) : Double{
    return base * altura;
}

fun volumenPrismaRectangular(largo : Double, ancho : Double, altura : Double) : Double{
    return largo * areaRectangulo(ancho,altura)
}

fun promedio (calOne : Float = 8.0f, calTwo : Float = 8.0f, calThree : Float ): Float{
    return (calOne + calTwo + calThree) / 3
}
fun tipoTriangulo(sideOne : Int,sideTwo: Int, sideThree: Int ): String{
    val palabra : String
   if (sideOne == sideTwo && sideOne == sideThree ){
       palabra = "Equilatero"
   } else if (sideOne == sideTwo || sideOne == sideThree){
       palabra = "Isoceles"
   }else if (sideOne != sideTwo && sideOne != sideThree){
       palabra = "Escaleno"
   }else{
       palabra = "No se"
   }
    return "El triangulo es : $palabra"
}

