package DifferentClasses.Exercises

abstract class GoodMorning (name: String = "Good Morning",
                   difficulty:Int = 1,
                   requirement:String = "piernas",
//qué parte del cuerpo ejercita
                   type: String = "Espalda",
                   description: String = "Consiste en hacer un saludo japones mandeniendo la espalda recta, de manera que se forme un angulo de 90 grados entre el torso y las piernas. Si se hace el uso de peso es colocando la barra detras del cuello sobre los musculos de la espalda.",
quantity: String = "Sin peso, en caso de que quiera usar peso, cuide no exceder su capacidad.")
    :GoodMorning(name, difficulty, requirement, type, description, quantity) {
}