import DifferentClasses.History
import DifferentClasses.Singleton
import DifferentClasses.User

fun main(args: Array<String>) {
    println("Ingrese su edad")
    var age = readLine()!!
    println("Ingrese su nivel de ejercicio")
    var levelOfExercise = readLine()!!
    println("Ingrese su peso")
    var weight = readLine()!!

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