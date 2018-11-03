package DifferentClasses

data class History(
        var listOfWeightEntries: ArrayList<Float> = ArrayList(),
        var listOfAchievements: ArrayList<Achievement> = ArrayList(),
        var listOfExercisesDone: ArrayList<Exercise> = ArrayList()
) {
}