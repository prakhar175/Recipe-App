package com.example.recipeapp

import android.icu.util.ULocale.Category

data class Categories(val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
    )
data class CategoriesResponse(val categories: List<Category>)