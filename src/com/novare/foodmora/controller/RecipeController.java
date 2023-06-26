package com.novare.foodmora.controller;

import com.novare.foodmora.data.PoolRecipe;
import com.novare.foodmora.model.RecipeModel;
import com.novare.foodmora.utill.Recipe;
import com.novare.foodmora.utill.RecipeWeek;
import com.novare.foodmora.view.RecipeView;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RecipeController implements RecipeControllerInterface {
    private RecipeModel recipeModel;
    private RecipeView recipeView;
    private boolean isDieticianMode;

    public RecipeController(RecipeModel recipeModel, RecipeView recipeView) {
        this.recipeModel = recipeModel;
        this.recipeView = recipeView;
        this.isDieticianMode = false;
    }

    public void run(Scanner scanner) {
        int menuChoice;
        try {
            do {
                recipeView.printMainMenu();
                menuChoice = scanner.nextInt();

                switch (menuChoice) {
                    case 1:
                        handleUserMenu(scanner);
                        break;
                    case 2:
                        handleDieticianMenu(scanner);
                        break;
                    case 3:
                        recipeView.displayExitMessage();
                        System.exit(0);
                    default:
                        recipeView.displayInvalidInputMessage();
                }
            } while (menuChoice != 3);
        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
            this.run(new Scanner(System.in));
        }

    }

    public void handleUserMenu(Scanner scanner) {
        int userMenuChoice;
        try {
            do {
                recipeView.printUserMenu();
                userMenuChoice = scanner.nextInt();

                switch (userMenuChoice) {
                    case 1:
                        generateRecipeWeek();
                        break;
                    case 2:
                        viewPastRecipeWeeks();
                        break;
                    case 3:
                        viewCurrentWeekRecipe();
                        break;
                    case 4:
                        viewDayRecipeInCurrentWeek();
                        break;
                    case 5:
                        recipeView.displayBackMainMessage();
                        run(new Scanner(System.in));
                        break;
                    case 6:
                        recipeView.displayExitMessage();
                        System.exit(0);
                    default:
                        recipeView.displayInvalidInputMessage();
                }
            } while (userMenuChoice != 6);
        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
            this.handleUserMenu(new Scanner(System.in));
        }
    }

    public void handleDieticianMenu(Scanner scanner) {
        int dieticianMenuChoice;
        try {
            do {
                recipeView.printDieticianMenu();
                dieticianMenuChoice = scanner.nextInt();


                switch (dieticianMenuChoice) {
                    case 1:
                        addNewRecipeToRecipePool();
                        break;
                    case 2:
                        editRecipeInRecipePool();
                        break;
                    case 3:
                        viewCommonRecipePool();
                        break;
                    case 4:
                        viewCurrentWeekRecipe();
                        break;
                    case 5:
                        viewDayRecipeInCurrentWeek();
                        break;
                    case 6:
                        recipeView.displayBackMainMessage();
                        run(new Scanner(System.in));
                        break;
                    case 7:
                        recipeView.displayExitMessage();
                        System.exit(0);
                    default:
                        recipeView.displayInvalidInputMessage();
                }
            } while (dieticianMenuChoice != 7);
        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
            this.handleDieticianMenu(new Scanner(System.in));
        }
    }

    public void editRecipeInRecipePool() {
        try {
            List<Recipe> commonRecipes = recipeModel.getCommonRecipes();
            recipeView.printRecipes(commonRecipes);
            Recipe recipe = recipeView.displayRecipeForEdit(commonRecipes);
            recipeView.updateRecipe(recipe);
        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
        }
    }

    public void addNewRecipeToRecipePool() {
        try {
            List<Recipe> commonRecipes = recipeModel.getCommonRecipes();
            Recipe recipe = recipeView.createRecipe();
            if (!commonRecipes.contains(recipe))
                recipeModel.addRecipe(recipe);

        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
        }
    }

    public void viewCommonRecipePool() {
        try {
            List<Recipe> commonRecipes = recipeModel.getCommonRecipes();
            recipeView.printRecipes(commonRecipes);
            recipeView.displaySelectedRecipe(commonRecipes);
        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
        }
    }

    public void generateRecipeWeek() {
        try {
            RecipeWeek recipeWeek = new RecipeWeek();
            List<Recipe> commonRecipes = recipeModel.getCommonRecipes();
            // Generate recipes for a week (7 days)
            for (int i = 0; recipeWeek.getRecipes().size() < 7; i++) {
                Recipe recipe = generateRandomRecipe(commonRecipes);
                if (!recipeWeek.getRecipes().contains(recipe))
                    recipeWeek.addRecipe(recipe);
            }
            for (Recipe recipe : recipeWeek.getRecipes()) {
                PoolRecipe.getRecipeById(recipe.getId()).setWeight(recipe.getWeight() / 1.1);
            }
            recipeModel.addRecipeWeek(recipeWeek);
            List<RecipeWeek> recipeWeeks = recipeModel.getRecipeWeeks();
            int weekNumber = recipeWeeks.indexOf(recipeWeek) + 1;
            recipeView.viewWeeksRecipes(recipeWeeks, recipeWeek, weekNumber);
        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
        }
    }

    public Recipe generateRandomRecipe(List<Recipe> commonRecipes) {
        double totalWeight = commonRecipes.stream().mapToDouble(Recipe::getWeight).sum();
        Random random = new Random();
        double randomNumber = random.nextDouble() * totalWeight;
        double cumulativeWeight = 0;

        for (Recipe recipe : commonRecipes) {
            cumulativeWeight += recipe.getWeight();
            if (randomNumber < cumulativeWeight) {
                return recipe;
            }
        }
        return null;
    }

    public void viewCurrentWeekRecipe() {
        try {
            List<RecipeWeek> recipeWeeks = recipeModel.getRecipeWeeks();
            if (recipeWeeks.isEmpty()) {
                recipeView.displayErrorMessage("Generate at least one week Recipes to continue");
            } else {
                RecipeWeek currentWeek = recipeWeeks.get(recipeWeeks.size() - 1);
                int weekNumber = recipeWeeks.indexOf(currentWeek) + 1;
                recipeView.viewWeeksRecipes(recipeWeeks, currentWeek, weekNumber);
            }
        } catch (Exception exception) {
            if (recipeModel.getRecipeWeeks().isEmpty())
                recipeView.displayInvalidInputMessage();
        }
    }

    public void viewPastRecipeWeeks() {
        try {
            List<RecipeWeek> recipeWeeks = recipeModel.getRecipeWeeks();
            if (recipeWeeks.isEmpty()) {
                recipeView.displayErrorMessage("Generate at least one week Recipes to continue");
            } else {
                recipeView.displayAllRecipeWeek(recipeWeeks);
            }
        } catch (Exception exception) {
            recipeView.displayInvalidInputMessage();
        }
    }

    public void viewDayRecipeInCurrentWeek() {
        try {
            RecipeWeek currentWeek = recipeModel.getRecipeWeeks().get(recipeModel.getRecipeWeeks().size() - 1);
            List<Recipe> recipes = currentWeek.getRecipes();
            viewCurrentWeekRecipe();
            recipeView.displaySelectedRecipe(recipes);
        } catch (Exception exception) {
            if (recipeModel.getRecipeWeeks().isEmpty())
                recipeView.displayErrorMessage("Generate at least one week Recipes to continue");
            recipeView.displayInvalidInputMessage();
        }
    }

}
