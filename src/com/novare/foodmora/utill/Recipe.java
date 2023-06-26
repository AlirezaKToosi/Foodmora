package com.novare.foodmora.utill;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private List<String> steps;
    private double Weight;
    private int id;
    private static int lastAssignedID = 0;

    public void setWeight(double weight) {
        Weight = weight;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return Weight;
    }
    private int generateRecipeId() {
        lastAssignedID++;
        id = lastAssignedID;
        return id;
    }
    public Recipe(String name, List<Ingredient> ingredients, List<String> steps) {
        this.id=this.generateRecipeId();
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.Weight=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void updateIngredients(List<Ingredient> updatedIngredients) {
        ingredients = updatedIngredients;
    }

    public void updateSteps(List<String> updatedSteps) {
        steps = updatedSteps;
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}
