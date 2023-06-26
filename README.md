# Foodmora
Foodmora - Recipe Manager
# About
Foodmora is a small Swedish startup company with roots in the Swedish town of
Mora. As they failed to get traction and outcompete leksandknäcke with their moraknäcke
they have now pivot into the food-tech market. Essentially, they want to create
an app that helps you generate a schedule for what to eat each day. They are in the
process of designing an app but need a prototype. They have settled for using a
terminal app.
# Foodmora backlog and Stories		

# 1-Create a Recipe

"As a dietician, I want to create new recipes and  add them to the common recipe pool so that users can access a variety of recipes."


The dietician should be able to enter a recipe name, list of ingredients, and step-by-step instructions for completing the recipe. Each ingredient should have fields for the ingredient name, measurement type, and amount. Valid measurement types are Quantity (pc), Liters (l), and Kilogram (kg). The input validation should not allow spaces before other characters.

Task 1: Create a recipe form interface with fields for recipe name, ingredients, and steps.

Task 2: Implement validation for the recipe form to ensure no spaces before characters and validate ingredient measurements.

Task 3: Implement a function to add the created recipe to the common recipe pool.

# 2-Generate Recipes for a Week

"As a user, I want to automatically generate recipes for a week so that I have a meal plan."

The system should allow the user to generate recipes for a week and store the generated week-object. The system should prevent the same recipe from appearing twice in the same week. Each time a recipe is used, it should be assigned a weight to occur less frequently in future weeks. The user should also be able to retrieve past generated recipe-weeks.	"

Task 1: Design a user interface to input the desired number of recipes for the week.

Task 2: Implement a function to generate random recipes for the week while preventing duplicates.

Task 3: Store the generated recipe-week object for future retrieval.

Task 4: Implement a feature to assign weights to recipes based on their usage to influence future generation."


# 3-View Recipe

As a user, I want to view recipes from the generated recipe-week so that I know the ingredients and steps for preparing the meals.

The user should be able to view recipes from the current recipe-week, including both the ingredients and the steps. Additionally, the dietician should be able to view recipes in the common recipe pool.

Task 1: Display the list of recipes for the current recipe-week.

Task 2: Implement a function to retrieve and display the ingredients and steps for a selected recipe.

Task 3: Design a user interface for viewing recipes from the generated recipe-week.

Task 4: Enable the dietician to view recipes in the common recipe pool."



# 4-Update a Recipe

As a dietician, I want to be able to edit recipes by adding or removing ingredients and steps.

The dietician should have the option to edit a recipe by deleting ingredients and steps, as well as adding new ingredients and steps to a recipe.

Task 1: Implement an edit feature to modify the name, ingredients, and steps of a recipe.

Task 2: Enable ingredient editing within a recipe.

Task 3: Validate and handle errors during recipe editing."


# 5-Switching between User and Dietician

As a user or dietician, I want to switch between user and dietician modes without losing any changes or data.

The system should provide a way to switch between the user and dietician modes while preserving any changes made during runtime. For example, generating a new recipe-week, switching to dietician mode, updating a recipe, switching back to user mode, and still being able to view the generated recipe-week.

Task 1: Design a mode-switching mechanism in the user interface.

Task 2: Implement data persistence to preserve changes made during runtime.

Task 3: Test and verify that changes made in one mode are preserved when switching to the other mode."


# 6-Handle Invalid User Input

As a user, I want the program to handle invalid input.

The program should handle invalid user input, such as out-of-range options or improperly formatted input. It should provide informative error messages to guide the user in providing correct input.

Task 1: Identify potential areas where user input validation is required.

Task 2: Implement input validation for each user input field, checking for out-of-range options and improper formatting.

Task 3: Display informative error messages when invalid input is detected.

Task 4: Test the input validation and error handling to ensure it functions correctly.
