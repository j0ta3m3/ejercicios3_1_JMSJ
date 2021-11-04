fun main() {

    var manolo = Persona("777777d")
    var cuentaManolo = Cuenta("1112345", 0)
    var cuenta2 = Cuenta("4444478", 700)
    manolo.Añadircuenta(cuentaManolo)
    manolo.Añadircuenta(cuenta2)
    cuentaManolo.recibirAbonos(1100)
    cuenta2.realizarPagos(750)
    cuenta2.Morosidad()
    cuentaManolo.realizarPagos(1000)
    cuenta2.recibirAbonos(1000)
    println(cuenta2)
    println(cuentaManolo)
    cuenta2.Morosidad()


}

var cuenta1 = Cuenta("12345", 125)

class Cuenta(var numCuenta: String, var saldoDisp: Int) {


    fun recibirAbonos(dinero: Int) {
        this.saldoDisp = dinero + this.saldoDisp

    }

    fun realizarPagos(pago: Int) {
        this.saldoDisp = this.saldoDisp - pago

    }

    fun Morosidad() {
        if (saldoDisp < 0) {
            println("Cuenta morosa")
        } else {
            println("No existe morosidad en la cuenta ${this.numCuenta}")
        }
    }

    fun Transferencia(cuentaOrigen:Cuenta, cuentaDestino:Cuenta, dinero:Double){
        cuentaOrigen.saldoDisp = cuentaOrigen.saldoDisp
    }
    override fun toString(): String {
        return "$numCuenta , $saldoDisp $ "
    }


}

class Persona(var dni: String) {

    var cuentasBancarias = arrayOfNulls<Cuenta>(3)
    fun Añadircuenta(valor: Cuenta) {
        if (cuentasBancarias[0] == null) {
            cuentasBancarias[0] = valor
        } else {
            if (cuentasBancarias[1] == null) {
                cuentasBancarias[1] = valor
            } else {
                if (cuentasBancarias[2] == null) {
                    cuentasBancarias[2] = valor
                }
            }
        }
    }


}