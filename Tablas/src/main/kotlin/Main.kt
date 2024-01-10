import kotlin.math.max
import kotlin.math.min

/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun pedirNum(min: Int, max: Int): Int {

    print("Introduzca un número para generar su tabla de multiplicación: ")
    var num = readln().toInt()

    while (num < min || num > max){
        print("Número no válido.")
        print("Introduzca un número para generar su tabla de multiplicación: ")
        num = readln().toInt()
    }

    return num
}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta(text: String){

    print(text)
    var respuesta = readln()


k

}

fun main() {
    //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
    //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"

    val num = pedirNum(min = 1, max = 100)

    val tablas = Array<String>(11){i -> "$i x $num = ${num * i}"}
    for (linea in tablas){
        println(linea)
    }

    val respuesta = pregunta(text = "¿Desea generar otra tabla de multiplicación? (s/n)" )


}