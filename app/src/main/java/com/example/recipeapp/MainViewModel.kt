package com.example.recipeapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import java.util.Locale

class MainViewModel:ViewModel() {

    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState

    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Locale.Category> = emptyList(),
        val error: String? = null
    )
}