package com.novare.foodmora.model;

import com.novare.foodmora.utill.Recipe;
import com.novare.foodmora.utill.RecipeWeek;

import java.util.List;

public interface RecipeModelInterface {
    void addRecipe(Recipe recipe);
    List<Recipe> getCommonRecipes();
    void addRecipeWeek(RecipeWeek recipeWeek);
    List<RecipeWeek> getRecipeWeeks();
}
