package DifferentClasses.Exercises

abstract class BenchPress(name:String = "Bench press",
                 difficulty:Int = 2,
                 requirement:String = "Barra, tortas de barra, rack, banca y brazos",
        //qué parte del cuerpo ejercita
                 type: String = "Pecho",
                 description: String = "Consiste en empujar la barra del pecho hasta que los brazos esten completamente extensos.",
                 quantity: String = "5 series de 8 con el 60 porciento de su peso maximo.")
    :BenchPress(name, difficulty, requirement, type, description, quantity) {
}