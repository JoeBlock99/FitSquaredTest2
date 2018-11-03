package DifferentClasses

import DifferentClasses.Achievements.Achievement
import DifferentClasses.Exercises.Exercise

data class History(
        var listOfWeightEntries: ArrayList<Float> = ArrayList(),
        var listOfAchievements: ArrayList<Achievement> = ArrayList(),
        var listOfExercisesDone: ArrayList<Exercise> = ArrayList()
) {
}