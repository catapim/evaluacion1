package evaluacion1.evaluacion1

class Cliente {
    var nombre: String = ""
    var apellido: String = ""
    var rut: String = ""
    var comuna: String = ""
    var direccion: String = ""

    constructor(){}

    constructor(nombre: String,apellido: String, rut: String,comuna:String, direccion:String) : this() {
        this.nombre = nombre
        this.apellido = apellido
        this.rut = rut
        this.comuna = comuna
        this.direccion = direccion

    }
}