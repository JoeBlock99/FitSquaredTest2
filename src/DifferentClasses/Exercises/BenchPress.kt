package DifferentClasses.Exercises

abstract class BenchPress(name:String = "Bench press",
                 difficulty:Int = 2,
                 requirement:String = "Barra, tortas de barra, rack y brazos",
        //qué parte del cuerpo ejercita
                 type: String = "Pecho",
                 description: String = "Consiste en empujar la barra del pecho hasta que los brazos esten completamente extensosos.")
    :BenchPress(name, difficulty, requirement, type, description) {
}