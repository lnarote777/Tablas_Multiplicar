import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.security.KeyStore.TrustedCertificateEntry
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


    var num = min - 1


    do{
        print("Introduzca un número para generar su tabla de multiplicación: ")
        num = try {
            readln().toInt()
        } catch (e: Exception){
            min-1
        }
        if (num < min || num > max ){
            println("**Número no válido** (Pulse ENTER para continuar...)")
            readln()
        }

    }while (num < min || num > max )


    return num
}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta(text: String): Boolean {


    var respuesta :String

    do {
        print(text)
        respuesta = readln().lowercase()

        if (respuesta != "s" && respuesta != "n" && respuesta != "si" && respuesta != "no") {
            println("**Respuesta no válida** (Pulse ENTER para continuar...)")
            readln()
        }
    }while (respuesta != "s" && respuesta != "n" && respuesta != "si" && respuesta != "no" )

    val si_no = if (respuesta == "s" || respuesta == "si"){
        true
    }else{
        false
    }

    return si_no
}

fun main() {
    //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
    //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"


        do{
            val num = pedirNum(min = 1, max = 100)

            val tablas = Array<String>(11){"$it x $num = ${num * it}"}
            for (linea in tablas){
                println(linea)
            }

            val respuesta = pregunta(text = "¿Desea generar otra tabla de multiplicación? (s/n)" )

        }while (respuesta)



}