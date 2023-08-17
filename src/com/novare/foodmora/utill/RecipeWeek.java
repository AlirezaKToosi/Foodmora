package com.novare.foodmora.utill;
import java.util.ArrayList;
import java.util.List;

public class RecipeWeek {
    private final List<Recipe> recipes;

    public RecipeWeek() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

}
