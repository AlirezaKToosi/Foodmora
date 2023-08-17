package com.novare.foodmora;

import java.util.Scanner;

import com.novare.foodmora.controller.RecipeController;
import com.novare.foodmora.model.RecipeModel;
import com.novare.foodmora.view.RecipeView;

public class Main {
    public static void main(String[] args) {
        // Create instances of models, views, and controllers
        RecipeModel recipeModel = new RecipeModel();
        RecipeView recipeView = new RecipeView();
        RecipeController recipeController = new RecipeController(recipeModel, recipeView);

        // Start the application
        recipeController.run(new Scanner(System.in));
    }
}