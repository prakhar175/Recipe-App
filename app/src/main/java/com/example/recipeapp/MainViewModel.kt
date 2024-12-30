package com.example.recipeapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState

    init {
        fetchCategories()
    }
    private fun fetchCategories(){
        viewModelScope.launch {
                        try{
                            val response = recipeService?.getCategories()

                            if (response != null) {
                                _categoriesState.value = _categoriesState.value.copy(
                                    list = response.categories,
                                    loading = false,
                                    error=null
                                )
                            }


                        }catch (e:Exception){
                            _categoriesState.value = _categoriesState.value.copy(
                                error = "Error fetching categories ${e.message}",
                                loading = false
                            )
                        }
        }
    }


    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}