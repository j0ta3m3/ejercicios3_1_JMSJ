import java.awt.Color

fun main() {
    var coche1 = Coche("blanco", "Ford", "Mustang", 290, 4, "14025CA")
    var coche2 = Coche("negro", "Seat", "Ibiza", 180, 4, "12335CA")
    var coche3 = Coche("azul" ,"Honda", "Civic", 195, 2, "22025MAD")
    var coche4 = Coche("amarillo", "Citroen", "C4", 190, 4, "22005GRN")
    println(coche1.toString())
    println(coche2.toString())
    println(coche3.toString())
    println(coche4.toString())

}

class Coche(
    var color: String,
    var marca: String,
    var modelo: String,
    var numCaballos: Int,
    var numPuertas: Int,
    var matricula: String
) {
    override fun toString(): String {
        return " color = $color, marca = $marca, modelo = $modelo, numero de caballos = $numCaballos,numero de puertas = $numPuertas, matricula = $matricula k"
    }
}