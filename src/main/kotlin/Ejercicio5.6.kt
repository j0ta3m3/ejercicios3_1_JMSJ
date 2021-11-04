fun main(){

  var rectangulo = Rectangulo(4,2)
    var rectangulo1 = Rectangulo(7,3)
    var rectangulo2 = Rectangulo(8,5)

    println("el area es ${rectangulo.area()}")
    println("el area es ${rectangulo.perimetro()}")

    println("el area es ${rectangulo1.area()}")
    println("el area es ${rectangulo1.perimetro()}")

    println("el area es ${rectangulo2.area()}")
    println("el area es ${rectangulo2.perimetro()}")
}

class Rectangulo(var base: Int,var altura:Int)
{

    fun area():Int {
        return base * altura

    }




    fun perimetro():Int { return (base * 2) + (altura * 2)
    }
}