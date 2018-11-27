package DifferentClasses.Exercises

abstract class Pushup (name:String = "Push up",
              difficulty:Int = 2,
              requirement:String = "brazos",
        //qué parte del cuerpo ejercita
              type: String = "Brazo",
              description: String = "Acostado boca abajo manteniendo el torso y piernas rectos, empujar con los brazos de manera de que queden solo las puntas de sus pies y sus manos tocando el piso.",
quantity: String = "5 series de 8 a 15.")
    :Pushup(name, difficulty, requirement, type, description, quantity){
}