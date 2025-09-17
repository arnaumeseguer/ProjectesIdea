import java.util.Calendar

fun main(){
    var Persona1 = Persona("Walid", 18, "Marroc")
    Persona1.P13()
}



fun P1() {
    var a = 7
    var b = 5
    var c = a + b

    println(c)
}

fun P2 (){
    var base = 3
    var altura = 5
    var area = base * altura

    println(area)
}

fun P3(){
    var nombre1 = readln().toInt()
    var nombre2 = readln().toInt()
    var nombre3 = readln().toInt()

    var mitjana = (nombre1 + nombre2 + nombre3) / 3

    println(mitjana)
}

fun P4(){

    while (true) {
        var nombre = readln().toInt()
        if (nombre % 2 == 0) {
            println("Parell")

        } else println("Senar")
    }
}

fun P5 (){
    var nombre = readln().toInt()

    when (nombre) {
        1 -> print("Gener")
        2 -> print("Febrer")
        3 -> print("Març")
        4 -> print("Abril")
        5 -> print("Maig")
        6 -> print("Juny")
        7 -> print("Juliol")
        8 -> print("Agost")
        9 -> print("Setembre")
        10 -> print("Octubre")
        11 -> print("Novembre")
        12 -> print("Desembre")
    }
}

fun P6(){
    var nombre = 1
    while (nombre != 0){
        nombre = readln().toInt()
    }
    println("Fi del programa (nombre = 0)")
}

fun P7 (){
    val array =  arrayOf(readln().toInt(),readln().toInt(),readln().toInt(),readln().toInt(),readln().toInt())
    var suma = 0

//    for(i in array.indices){
//        suma += array[i]
//    }
//    println(suma) TOT AQUEST FOR, EQUIVAL A LA LINIA DE BAIX

    println(array.sum())
}

fun P8 (nombre:Int): Int{
    if(nombre == 0)
        return 1
    return nombre * P8(nombre - 1)

}

fun P9(){
    val array = Array(10) {0}
    for(i in 0 until 10 ) {
        array[i] = readln().toInt()
    }
    array.sort()
    for(x in array){
        print("$x ")
    }

}

fun P10(){
    val string = readln().toString()
    var suma = 0
    println(string)

    for(i in 0 until string.length){
        when(string[i]){
            'a' -> suma++
            'e' -> suma++
            'i' -> suma++
            'o' -> suma++
            'u' -> suma++
        }
    }
    print(suma)
}

fun P11() {

    val array = Array(5) {0}
    val arraySec = Array(5) {0}

    print("Introdueix els nombres: ")
    for(i in 0 until array.size){
        array[i] = readln().toInt()

        if (array[i] % 2 == 0)
            arraySec[i] = array[i]

    }

    for (i in arraySec){
        if (i != 0)
        print("$i ")
    }
}

fun P12(){

    val array = Array(5) {0}
    val arraySec = Array(5) {0}
    var positiu = 0
    var negatiu = 0
    var zero = 0

    print("Introdueix els nombres: ")
    for(i in 0 until array.size){
        array[i] = readln().toInt()

        if (array[i] > 0) positiu++
        if (array[i] < 0) negatiu++
        if (array[i] == 0) zero++

    }

    print("$positiu positius, $negatiu negatius i $zero zeros.")

}

class Persona(val nom: String, var edat: Int, val pais: String){

    fun P13 (){
        print("Soc $nom, tinc $edat anys i vinc de $pais")
    }
}

class Cotxe (val marca: String, val model: String, val any: Int){

    fun P14(){
        val edat = Calendar.getInstance().get(Calendar.YEAR) - any
        print("El cotxe eś de la marca $marca, model $model i té $edat anys")
    }
}
