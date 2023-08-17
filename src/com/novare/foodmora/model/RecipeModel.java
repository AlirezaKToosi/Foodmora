package com.novare.foodmora.model;

import com.novare.foodmora.data.PoolRecipe;
import com.novare.foodmora.utill.Recipe;
import com.novare.foodmora.utill.RecipeWeek;

import java.util.ArrayList;
import java.util.List;

public class RecipeModel implements RecipeModelInterface{
    private List<Recipe> commonRecipes;
    private final List<RecipeWeek> recipeWeeks;

    public RecipeModel() {
        commonRecipes = PoolRecipe.getRecipes();
        recipeWeeks = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        PoolRecipe.addRecipe(recipe);
        commonRecipes = PoolRecipe.getRecipes();
    }

    public List<Recipe> getCommonRecipes() {
        return commonRecipes;
    }

    public void addRecipeWeek(RecipeWeek recipeWeek) {
        recipeWeeks.add(recipeWeek);
    }

    public List<RecipeWeek> getRecipeWeeks() {
        return recipeWeeks;
    }
}
