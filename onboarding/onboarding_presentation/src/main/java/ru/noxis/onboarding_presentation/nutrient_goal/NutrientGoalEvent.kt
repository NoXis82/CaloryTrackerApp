package ru.noxis.onboarding_presentation.nutrient_goal

sealed interface NutrientGoalEvent {
    data class OnCarbRatioEnter(val ratio: String) : NutrientGoalEvent
    data class OnProteinRatioEnter(val ratio: String) : NutrientGoalEvent
    data class OnFatRatioEnter(val ratio: String) : NutrientGoalEvent
    data object OnNextClick : NutrientGoalEvent
}