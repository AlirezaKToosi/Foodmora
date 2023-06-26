package com.novare.foodmora.controller;

import java.util.Scanner;

public interface RecipeControllerInterface {
    void run(Scanner scanner);
    void handleUserMenu(Scanner scanner);
    void handleDieticianMenu(Scanner scanner);
    void editRecipeInRecipePool();
    void addNewRecipeToRecipePool();
    void viewCommonRecipePool();
    void generateRecipeWeek();
    void viewCurrentWeekRecipe();
    void viewPastRecipeWeeks();
    void viewDayRecipeInCurrentWeek();
}
