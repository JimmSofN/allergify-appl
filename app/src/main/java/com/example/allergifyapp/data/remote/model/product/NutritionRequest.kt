package com.example.allergifyapp.data.remote.model.product

data class NutritionRequest(
    val calories: Int,
    val fat: Int,
    val carbohydrates: Int,
    val protein: Int,
    val sugar: Int,
    val salt: Int
)