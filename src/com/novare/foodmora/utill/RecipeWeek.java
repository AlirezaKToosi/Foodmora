package com.novare.foodmora.utill;
import java.util.ArrayList;
import java.util.List;

public class RecipeWeek {
    private List<Recipe> recipes;

    public RecipeWeek() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public Recipe getRecipeByName(String recipeName) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equals(recipeName)) {
                return recipe;
            }
        }
        return null;
    }
}
