# RECIPE APP

## Overview
The Recipe App is an Android application that provides users with a variety of recipes fetched dynamically from [TheMealDB API](https://www.themealdb.com/). The app offers easy navigation, clickable features, and a user-friendly interface to explore, search, and view detailed recipe information.

## Features
- **Browse Recipes**: View a list of recipes categorized by meal types, ingredients, or cuisines.
- **Search Functionality**: Search for recipes by name or ingredient.
- **Detailed Recipe View**: Click on any recipe to view its detailed instructions, ingredients, and preparation steps.
- **Navigation**: Smooth and intuitive navigation using Jetpack Compose's Navigation Component.
- **Bookmark Recipes**: Save your favorite recipes for quick access later.
- **App Logo**: It contains amazing App Logo to make it look good.
  
## Tech Stack
- **Programming Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Navigation**: Jetpack Navigation Component
- **API Integration**: Retrofit
- **Dependency Injection**: Hilt
- **Asynchronous Programming**: Kotlin Coroutines and Flow
- **Data Storage**: Room Database (for saving bookmarks)

## Usage
1. **Home Screen**: Displays categories or a featured list of recipes.
2. **Search Bar**: Use the search bar to find specific recipes.
3. **Recipe Details**: Click on any recipe to see detailed instructions and a list of ingredients.
4. **Navigation Drawer or Tabs**: Use these to switch between different sections like "Categories," "Bookmarks," and "Settings."

## API Integration
This app uses TheMealDB API to fetch recipes. You will need an API key:
1. Sign up at [TheMealDB](https://www.themealdb.com/) to get your free API key.
2. Add your API key to the `local.properties` file:
   ```properties
   MEALDB_API_KEY=www.themealdb.com/api/json/v1/1/categories.php
   ```


## Contributions
Contributions are welcome! Feel free to open issues or submit pull requests for bug fixes, improvements, or new features.


