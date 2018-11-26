import DifferentClasses.History
import DifferentClasses.Singleton
import DifferentClasses.User

fun main(args: Array<String>) {
    println("Ingrese su sexo.")
    var sex = readLine()!!
    println("Ingrese su edad.")
    var age = readLine()!!
    //Nivel de condicion fisica = de 4 a 6 es normal, que consite en esfuerzos de 1 a 3 de dificultad.
    // de nivel 7 en adelante puede hacer ejercicios de 2 a 5, pero nunca vamos a poner un ejercicio de grado de dificultad 5 de una...
    // de nivel 2 a 3 dificultad 1 y 2
    // nivel 1, solo dificultad 1
    println("Ingrese su nivel de condicion fisica.")
    var levelOfExercise = readLine()!!
    println("Ingrese su peso")
    var weight = readLine()!!
    println("Ingrese su altura")
    var height = readLine()!!
    println("Ingrese lo que tiene en casa para ejercitarse.")
    var materials = readLine()!!
    //con numeros que tengan obviamnente max 7
    println("Ingrese cuantos dias a la semana desea hacer ejercicio.")
    var daysPerWeek = readLine()!!
    println("Ingrese sus prioridades")
    var priority = readLine()!!


    Singleton.current = User(
            "",
            "",
            age,
            levelOfExercise,
            "",
            weight,
            History()
    )

}