package com.novare.foodmora.view;

import com.novare.foodmora.utill.Recipe;

public interface RecipeViewInterface {
    Recipe createRecipe();
    void updateRecipe(Recipe recipe);
    void viewRecipes(Recipe recipe);
}
