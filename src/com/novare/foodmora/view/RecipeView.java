package com.novare.foodmora.view;

import com.novare.foodmora.utill.Ingredient;
import com.novare.foodmora.utill.Recipe;
import com.novare.foodmora.utill.RecipeWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeView implements RecipeViewInterface {
    private final Scanner scanner;

    public RecipeView() {
        scanner = new Scanner(System.in);
    }

    public void printMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. User Menu");
        System.out.println("2. Dietician Menu");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
    }

    public void printUserMenu() {
        System.out.println("User Menu:");
        System.out.println("1. Generate Recipes for a Week");
        System.out.println("2. Retrieve Past Generated Recipe-Weeks");
        System.out.println("3. View Recipes for Current Week");
        System.out.println("4. View Recipe for a day in Current Week");
        System.out.println("5. Back to Main Menu");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }

    public void printDieticianMenu() {
        System.out.println("Dietician Menu:");
        System.out.println("1. Create a Recipe");
        System.out.println("2. Update a Recipe");
        System.out.println("3. View Recipes in Common Recipe Pool");
        System.out.println("4. View Recipes for Current Week");
        System.out.println("5. View Recipe for a day in Current Week");
        System.out.println("6. Back to Main Menu ");
        System.out.println("7. Exit");
        System.out.println("Enter your choice: ");
    }

    public void updateRecipe(Recipe recipe) {
        System.out.println("----- Edit Recipe -----");
        editRecipeName(recipe);
        editRecipeIngredients(recipe);
        editRecipeSteps(recipe);
        addNewIngredient(recipe);
        addNewStep(recipe);
        System.out.println("Recipe updated successfully.");
        System.out.println();
    }

    private void editRecipeName(Recipe recipe) {
        System.out.println("Current recipe name: " + recipe.getName());
        String newName = getUserInput("Enter new recipe name (leave empty to keep the current name): ");
        if (!newName.isEmpty()) {
            recipe.setName(newName);
        }
    }

    private void editRecipeIngredients(Recipe recipe) {
        List<Ingredient> ingredients = recipe.getIngredients();
        System.out.println("Current Ingredients:");
        printIngredientList(ingredients);
        System.out.println();

        boolean editMoreIngredients = true;
        while (editMoreIngredients) {
            int ingredientNumber = getIntNumericUserInput("Enter the ingredient number to edit/delete (or 0 to skip): ");
            if (ingredientNumber > 0 && ingredientNumber <= ingredients.size()) {
                Ingredient ingredient = ingredients.get(ingredientNumber - 1);
                System.out.println("Editing Ingredient: " + ingredient.getName());
                String deleteChoice = getUserInput("Do you want to delete this ingredient? (Y/N): ");
                if (deleteChoice.equalsIgnoreCase("Y")) {
                    ingredients.remove(ingredientNumber - 1);
                    System.out.println("Ingredient deleted successfully.");
                    System.out.println();
                } else {
                    editSpecificIngredient(ingredient);
                    ingredients.set(ingredientNumber - 1, ingredient);
                    System.out.println("Ingredient updated successfully.");
                    System.out.println();
                }
            }
            editMoreIngredients = getYesNoUserInput("Do you want to edit more ingredients? (Y/N): ");
        }
        recipe.setIngredients(ingredients);
    }

    private void editSpecificIngredient(Ingredient ingredient) {
        String newIngredientName = getUserInput("Enter new ingredient name (leave empty to keep the current name): ");
        if (!newIngredientName.isEmpty()) {
            ingredient.setName(newIngredientName);
        }
        String newMeasureType = getUserInput("Enter new measure type (leave empty to keep the current measure type): ");
        if (!newMeasureType.isEmpty()) {
            ingredient.setMeasureType(newMeasureType);
        }
        String newAmountStr = getUserInput("Enter new amount (leave empty to keep the current amount): ");
        if (!newAmountStr.isEmpty()) {
            try {
                double newAmount = Double.parseDouble(newAmountStr);
                ingredient.setAmount(newAmount);
            } catch (NumberFormatException e) {
                // Invalid input, do nothing
            }
        }
    }

    private void editRecipeSteps(Recipe recipe) {
        List<String> steps = recipe.getSteps();
        System.out.println("Current Steps:");
        printStepList(steps);
        System.out.println();

        boolean editMoreSteps = true;
        while (editMoreSteps) {
            int stepNumber = getIntNumericUserInput("Enter the step number to edit (or 0 to skip): ");
            if (stepNumber > 0 && stepNumber <= steps.size()) {
                String step = steps.get(stepNumber - 1);
                System.out.println("Editing Step: " + step);
                String deleteChoice = getUserInput("Do you want to delete this step? (Y/N): ");
                if (deleteChoice.equalsIgnoreCase("Y")) {
                    steps.remove(stepNumber - 1);
                    System.out.println("Step deleted successfully.");
                    System.out.println();
                } else {
                    String newStep = getUserInput("Enter new step (leave empty to keep the current step): ");
                    if (!newStep.isEmpty()) {
                        steps.set(stepNumber - 1, newStep);
                    }
                    System.out.println("Step updated successfully.");
                    System.out.println();
                }
            }
            editMoreSteps = getYesNoUserInput("Do you want to edit more steps? (Y/N): ");
        }
        recipe.setSteps(steps);
    }

    private void addNewIngredient(Recipe recipe) {
        if (getYesNoUserInput("Do you want to add a new ingredient? (Y/N): ")) {
            String ingredientName = getUserInput("Enter ingredient name: ");
            String measureType = getUserInput("Enter measure type (Quantity, Liters, Kilogram): ");
            double amount = Double.parseDouble(getUserInput("Enter amount: "));
            recipe.getIngredients().add(new Ingredient(ingredientName, measureType, amount));
            System.out.println("Ingredient added successfully.");
            System.out.println();
        }
    }

    private void addNewStep(Recipe recipe) {
        if (getYesNoUserInput("Do you want to add a new step? (Y/N): ")) {
            String newStep = getUserInput("Enter step: ");
            recipe.getSteps().add(newStep);
            System.out.println("Step added successfully.");
            System.out.println();
        }
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private int getIntNumericUserInput(String prompt) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private double getDoubleNumericUserInput(String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private boolean getYesNoUserInput(String prompt) {
        String choice = getUserInput(prompt);
        return choice.equalsIgnoreCase("Y");
    }

    private void printIngredientList(List<Ingredient> ingredients) {
        for (int i = 0; i < ingredients.size(); i++) {
            Ingredient ingredient = ingredients.get(i);
            System.out.println((i + 1) + ". " + ingredient.getName() + " (" + ingredient.getMeasureType() + "): " + ingredient.getAmount());
        }
    }

    private void printStepList(List<String> steps) {
        for (int i = 0; i < steps.size(); i++) {
            String step = steps.get(i);
            System.out.println((i + 1) + ". " + step);
        }
    }

    public Recipe createRecipe() {
        System.out.println("----- Create Recipe -----");
        String name = getUserInput("Enter recipe name: ");

        List<Ingredient> ingredients = new ArrayList<>();
        System.out.println("Enter recipe ingredients (one ingredient per line):");
        boolean addMoreIngredients = true;
        while (addMoreIngredients) {
            String ingredientName = getUserInput("Ingredient Name: ");
            String measureType = getUserInput("Measure type (Quantity, Liters, Kilogram): ");
            double amount = getDoubleNumericUserInput("Amount: ");
            ingredients.add(new Ingredient(ingredientName, measureType, amount));
            addMoreIngredients = getYesNoUserInput("Do you want to add more ingredients? (Y/N): ");
        }

        List<String> steps = new ArrayList<>();
        System.out.println("Enter recipe steps (one step per line):");
        boolean addMoreSteps = true;
        while (addMoreSteps) {
            String step = getUserInput("Step: ");
            steps.add(step);
            addMoreSteps = getYesNoUserInput("Do you want to add more steps? (Y/N): ");
            System.out.println("New Recipe has been created.");
        }
        return new Recipe(name, ingredients, steps);
    }

    public void displaySelectedRecipe(List<Recipe> recipes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the recipe id for displaying: ");
        int recipeNumber = scanner.nextInt() - 1;
        Recipe recipe = recipes.get(recipeNumber);
        viewRecipes(recipe);
    }

    public Recipe displayRecipeForEdit(List<Recipe> recipes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the recipe id for editing: ");
        int recipeNumber = scanner.nextInt() - 1;
        return (recipes.get(recipeNumber));
    }

    public void viewRecipes(Recipe recipe) {
        System.out.println("----- Recipe Details -----");
        System.out.println("Name: " + recipe.getName());
        System.out.println("Ingredients:");
        for (Ingredient ingredient : recipe.getIngredients()) {
            System.out.println("- " + ingredient.getName() + " (" + ingredient.getMeasureType() + "): " + ingredient.getAmount());
        }
        System.out.println("Steps:");
        int stepNumber = 1;
        for (String step : recipe.getSteps()) {
            System.out.println(stepNumber++ + ". " + step);
        }
        System.out.println();
    }

    public void viewWeeksRecipes(List<RecipeWeek> recipeWeeks, RecipeWeek recipeWeek, int weekNumber) {
        if (recipeWeeks.isEmpty()) {
            System.out.println("No recipe week available.");
        } else {
            System.out.println("----- Recipe Week Details -----");
            System.out.println("Week " + weekNumber);
            for (int i = 0; i < recipeWeek.getRecipes().size(); i++) {
                Recipe recipe = recipeWeek.getRecipes().get(i);
                System.out.println("Day " + (i + 1) + ": " + recipe.getName());
            }
            System.out.println();
        }
    }

    public void displayAllRecipeWeek(List<RecipeWeek> recipeWeeks) {
            System.out.println("----- Past Recipe Weeks -----");
            for (int i = 0; i < recipeWeeks.size(); i++) {
                RecipeWeek recipeWeek = recipeWeeks.get(i);
                System.out.println("Week " + (i + 1));
                for (int j = 0; j < recipeWeek.getRecipes().size(); j++) {
                    Recipe recipe = recipeWeek.getRecipes().get(j);
                    System.out.println("Day " + (j + 1) + ": " + recipe.getName());
                }
                System.out.println();
            }

    }

    public void printRecipes(List<Recipe> recipes) {
        System.out.println("----- Common Recipes -----");
        for (int i = 0; i < recipes.size(); i++) {
            Recipe recipe = recipes.get(i);
            System.out.println((i + 1) + ". " + recipe.getName());
        }
        System.out.println();
    }

    public void displayInvalidInputMessage() {
        System.out.println("⚠️ Invalid input. Please try again.\n");
    }
    public void displayErrorMessage(String input) {
        System.out.println("⚠️" + input);
    }
    public void displayExitMessage() {
        System.out.println("Exiting the program. Goodbye!\n");
    }

    public void displayBackMainMessage() {
        System.out.println("Back to the Main Menu.\n");
    }
}
