package Foodmora.data;

import Foodmora.Ingredient;
import Foodmora.Recipe;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class PoolRecipe {
    private static List<Ingredient> recipe1Ingredients = Arrays.asList(
            new Ingredient("all-purpose flour", "cups", 1.5),
            new Ingredient("blueberries", "cup", 1),
            new Ingredient("sugar", "cup", 0.25),
            new Ingredient("egg", "", 1),
            new Ingredient("baking powder", "tbsp", 1),
            new Ingredient("milk", "cup", 1),
            new Ingredient("salt", "tsp", 0.25),
            new Ingredient("melted butter", "cup", 0.25)
    );
    private static List<String> recipe1Steps = Arrays.asList(
            "Step 1:Mix the dry ingredients and add the blueberries.",
            "Step 2:Combine the egg, milk, and melted butter and stir into the flour mixture. Do not overmix.",
            "Step 3:Cook pancakes on a greased griddle or skillet over medium heat until golden brown on both sides."
    );
    private static List<Ingredient> recipe2Ingredients = Arrays.asList(
            new Ingredient("broccoli florets", "cups", 2),
            new Ingredient("carrots, sliced", "cups", 1),
            new Ingredient("red bell pepper, sliced", "cup", 1),
            new Ingredient("snow peas", "cups", 1),
            new Ingredient("garlic cloves, minced", "tbsp", 2),
            new Ingredient("soy sauce", "tbsp", 3),
            new Ingredient("sesame oil", "tbsp", 1),
            new Ingredient("vegetable oil", "tbsp", 2)
    );

    private static List<String> recipe2Steps = Arrays.asList(
            "Step 1: Heat vegetable oil and sesame oil in a wok or large skillet over high heat.",
            "Step 2: Add minced garlic and stir-fry for 30 seconds until fragrant.",
            "Step 3: Add broccoli, carrots, and red bell pepper. Stir-fry for 3-4 minutes until vegetables are crisp-tender.",
            "Step 4: Add snow peas and soy sauce. Stir-fry for an additional 2 minutes.",
            "Step 5: Remove from heat and serve the vegetable stir-fry hot."
    );
    private static List<Ingredient> recipe3Ingredients = Arrays.asList(
            new Ingredient("spaghetti", "ounces", 8),
            new Ingredient("bacon, chopped", "ounces", 4),
            new Ingredient("garlic cloves, minced", "tsp", 2),
            new Ingredient("eggs", "", 2),
            new Ingredient("Parmesan cheese, grated", "cup", 0.5),
            new Ingredient("black pepper, freshly ground", "tsp", 0.5),
            new Ingredient("salt", "tsp", 0.25)
    );

    private static List<String> recipe3Steps = Arrays.asList(
            "Step 1: Cook spaghetti according to package instructions. Drain and set aside.",
            "Step 2: In a large skillet, cook chopped bacon until crispy. Remove bacon from the skillet and set aside, leaving the bacon grease in the skillet.",
            "Step 3: In the same skillet, add minced garlic to the bacon grease and cook for 1 minute until fragrant.",
            "Step 4: In a bowl, whisk together eggs, grated Parmesan cheese, black pepper, and salt.",
            "Step 5: Add cooked spaghetti to the skillet with the garlic and bacon grease. Remove the skillet from heat.",
            "Step 6: Pour the egg mixture over the spaghetti and quickly toss until the pasta is evenly coated and the sauce thickens slightly.",
            "Step 7: Add the crispy bacon back into the skillet and toss to combine.",
            "Step 8: Serve the spaghetti carbonara hot, garnished with additional grated Parmesan cheese and black pepper if desired."
    );
    private static List<Ingredient> recipe4Ingredients = Arrays.asList(
            new Ingredient("boneless, skinless chicken breasts, sliced", "lbs", 1),
            new Ingredient("bell peppers, sliced", "cup", 1),
            new Ingredient("onion, sliced", "cup", 1),
            new Ingredient("broccoli florets", "cups", 2),
            new Ingredient("garlic cloves, minced", "tsp", 2),
            new Ingredient("soy sauce", "tbsp", 3),
            new Ingredient("hoisin sauce", "tbsp", 2),
            new Ingredient("sesame oil", "tbsp", 1),
            new Ingredient("vegetable oil", "tbsp", 2)
    );

    private static List<String> recipe4Steps = Arrays.asList(
            "Step 1: In a large skillet or wok, heat vegetable oil and sesame oil over medium-high heat.",
            "Step 2: Add minced garlic and stir-fry for 30 seconds until fragrant.",
            "Step 3: Add sliced chicken breasts and cook until browned and cooked through, about 5-6 minutes.",
            "Step 4: Add sliced bell peppers, sliced onion, and broccoli florets. Stir-fry for 3-4 minutes until vegetables are crisp-tender.",
            "Step 5: In a small bowl, whisk together soy sauce and hoisin sauce. Pour the sauce over the chicken and vegetables in the skillet.",
            "Step 6: Stir-fry for an additional 2 minutes, ensuring everything is coated in the sauce and heated through.",
            "Step 7: Remove from heat and serve the chicken stir-fry hot. It can be enjoyed on its own or served over steamed rice."
    );
    private static List<Ingredient> recipe5Ingredients = Arrays.asList(
            new Ingredient("ripe tomatoes, sliced", "", 4),
            new Ingredient("fresh mozzarella cheese, sliced", "ounces", 8),
            new Ingredient("fresh basil leaves", "", 1 / 2),
            new Ingredient("extra-virgin olive oil", "tbsp", 2),
            new Ingredient("balsamic glaze", "tbsp", 2),
            new Ingredient("salt", "pinch", 1),
            new Ingredient("black pepper, freshly ground", "pinch", 1)
    );

    private static List<String> recipe5Steps = Arrays.asList(
            "Step 1: Arrange tomato slices and mozzarella slices on a serving platter, alternating them.",
            "Step 2: Place fresh basil leaves on top of the tomato and mozzarella slices.",
            "Step 3: Drizzle extra-virgin olive oil and balsamic glaze over the salad.",
            "Step 4: Season with a pinch of salt and freshly ground black pepper.",
            "Step 5: Serve the Caprese salad immediately as a refreshing appetizer or side dish."
    );
    private static List<Ingredient> recipe6Ingredients = Arrays.asList(
            new Ingredient("ripe avocados", "", 3),
            new Ingredient("lime, juiced", "", 1),
            new Ingredient("red onion, finely chopped", "cup", 1 / 4),
            new Ingredient("tomato, diced", "", 1),
            new Ingredient("fresh cilantro leaves, chopped", "tbsp", 2),
            new Ingredient("jalapeno pepper, seeded and minced", "", 1),
            new Ingredient("garlic clove, minced", "", 1),
            new Ingredient("salt", "tsp", 1 / 2),
            new Ingredient("black pepper, freshly ground", "tsp", 1 / 4)
    );

    private static List<String> recipe6Steps = Arrays.asList(
            "Step 1: Cut the avocados in half, remove the pits, and scoop the flesh into a bowl.",
            "Step 2: Mash the avocados with a fork or potato masher until desired consistency is reached.",
            "Step 3: Add lime juice to the mashed avocados and stir well to prevent browning.",
            "Step 4: Add finely chopped red onion, diced tomato, chopped cilantro, minced jalapeno pepper, and minced garlic to the bowl.",
            "Step 5: Season with salt and freshly ground black pepper.",
            "Step 6: Stir all the ingredients together until well combined.",
            "Step 7: Taste and adjust the seasoning if needed.",
            "Step 8: Serve the guacamole immediately with tortilla chips or as a topping for tacos, nachos, or salads."
    );
    private static List<Ingredient> recipe7Ingredients = Arrays.asList(
            new Ingredient("mixed vegetables (e.g., bell peppers, broccoli, carrots)", "cups", 4),
            new Ingredient("tofu, cubed", "ounces", 8),
            new Ingredient("soy sauce", "tbsp", 2),
            new Ingredient("sesame oil", "tbsp", 1),
            new Ingredient("garlic cloves, minced", "tsp", 2),
            new Ingredient("ginger, grated", "tsp", 1),
            new Ingredient("cornstarch", "tbsp", 1),
            new Ingredient("vegetable broth", "cup", 1 / 4),
            new Ingredient("vegetable oil", "tbsp", 2),
            new Ingredient("salt", "tsp", 1 / 2),
            new Ingredient("black pepper, freshly ground", "tsp", 1 / 4)
    );

    private static List<String> recipe7Steps = Arrays.asList(
            "Step 1: In a small bowl, whisk together soy sauce, sesame oil, minced garlic, grated ginger, cornstarch, vegetable broth, salt, and black pepper.",
            "Step 2: In a large skillet or wok, heat vegetable oil over medium-high heat.",
            "Step 3: Add the cubed tofu to the skillet and cook until lightly browned and crispy on all sides. Remove the tofu from the skillet and set aside.",
            "Step 4: In the same skillet, add the mixed vegetables and stir-fry for 3-4 minutes until they are crisp-tender.",
            "Step 5: Return the tofu to the skillet and pour the sauce mixture over the vegetables and tofu.",
            "Step 6: Stir-fry for an additional 2 minutes until the sauce thickens and coats the vegetables and tofu.",
            "Step 7: Remove from heat and serve the vegetable stir-fry hot, over steamed rice or noodles."
    );
    private static List<Ingredient> recipe8Ingredients = Arrays.asList(
            new Ingredient("boneless, skinless chicken breasts", "", 2),
            new Ingredient("bell peppers (assorted colors), sliced", "", 2),
            new Ingredient("onion, sliced", "", 1),
            new Ingredient("olive oil", "tbsp", 2),
            new Ingredient("lime, juiced", "", 1),
            new Ingredient("ground cumin", "tsp", 1),
            new Ingredient("chili powder", "tsp", 1),
            new Ingredient("garlic powder", "tsp", 1 / 2),
            new Ingredient("salt", "tsp", 1 / 2),
            new Ingredient("black pepper, freshly ground", "tsp", 1 / 4),
            new Ingredient("flour tortillas", "", 8),
            new Ingredient("sour cream", "", 1 / 2),
            new Ingredient("guacamole", "", 1 / 2),
            new Ingredient("salsa", "", 1 / 2),
            new Ingredient("fresh cilantro, chopped", "tbsp", 2)
    );

    private static List<String> recipe8Steps = Arrays.asList(
            "Step 1: Preheat a grill or skillet over medium-high heat.",
            "Step 2: In a bowl, combine olive oil, lime juice, ground cumin, chili powder, garlic powder, salt, and black pepper to make a marinade.",
            "Step 3: Place the chicken breasts in the marinade and let them marinate for at least 30 minutes.",
            "Step 4: Grill or cook the chicken breasts on the preheated grill or skillet for about 6-8 minutes per side, or until cooked through. Remove from heat and let them rest for a few minutes before slicing.",
            "Step 5: In the same skillet, cook the sliced bell peppers and onion over medium heat until they are tender-crisp.",
            "Step 6: Warm the flour tortillas on the grill or in a separate skillet.",
            "Step 7: Slice the grilled chicken breasts into thin strips.",
            "Step 8: Fill each warmed tortilla with sliced chicken, cooked bell peppers, and onion.",
            "Step 9: Serve the chicken fajitas with sour cream, guacamole, salsa, and chopped fresh cilantro.",
            "Step 10: Roll up the tortillas and enjoy!"
    );
    private static List<Ingredient> recipe9Ingredients = Arrays.asList(
            new Ingredient("ripe tomatoes, diced", "", 4),
            new Ingredient("cucumber, diced", "", 1),
            new Ingredient("red onion, thinly sliced", "", 1 / 2),
            new Ingredient("kalamata olives, pitted", "", 1 / 2),
            new Ingredient("feta cheese, crumbled", "", 1 / 2),
            new Ingredient("fresh parsley, chopped", "tbsp", 2),
            new Ingredient("extra-virgin olive oil", "tbsp", 2),
            new Ingredient("lemon juice", "tbsp", 2),
            new Ingredient("dried oregano", "tsp", 1),
            new Ingredient("salt", "tsp", 1 / 2),
            new Ingredient("black pepper, freshly ground", "tsp", 1 / 4)
    );

    private static List<String> recipe9Steps = Arrays.asList(
            "Step 1: In a large salad bowl, combine the diced tomatoes, diced cucumber, thinly sliced red onion, pitted kalamata olives, crumbled feta cheese, and chopped fresh parsley.",
            "Step 2: In a small bowl, whisk together the extra-virgin olive oil, lemon juice, dried oregano, salt, and black pepper to make the dressing.",
            "Step 3: Pour the dressing over the salad ingredients and toss gently to combine.",
            "Step 4: Let the Greek salad sit for about 10-15 minutes to allow the flavors to meld together.",
            "Step 5: Serve the Greek salad as a refreshing and healthy appetizer or side dish.",
            "Step 6: Enjoy!"
    );
    private static List<Ingredient> recipe10Ingredients = Arrays.asList(
            new Ingredient("fettuccine pasta", "ounces", 12),
            new Ingredient("boneless, skinless chicken breasts", "", 2),
            new Ingredient("salt", "tsp", 1 / 2),
            new Ingredient("black pepper, freshly ground", "tsp", 1 / 4),
            new Ingredient("garlic powder", "tsp", 1 / 2),
            new Ingredient("olive oil", "tbsp", 2),
            new Ingredient("unsalted butter", "tbsp", 4),
            new Ingredient("heavy cream", "cups", 1),
            new Ingredient("parmesan cheese, grated", "cups", 1),
            new Ingredient("fresh parsley, chopped", "tbsp", 2)
    );

    private static List<String> recipe10Steps = Arrays.asList(
            "Step 1: Cook the fettuccine pasta according to the package instructions. Drain and set aside.",
            "Step 2: Season the chicken breasts with salt, black pepper, and garlic powder.",
            "Step 3: Heat olive oil in a large skillet over medium-high heat. Add the seasoned chicken breasts and cook for about 6-8 minutes per side, or until cooked through. Remove the chicken from the skillet and let it rest for a few minutes. Slice the chicken into thin strips.",
            "Step 4: In the same skillet, melt the unsalted butter over medium heat. Stir in the heavy cream and bring it to a simmer.",
            "Step 5: Gradually whisk in the grated parmesan cheese until it is melted and the sauce is smooth and creamy.",
            "Step 6: Add the cooked fettuccine pasta and sliced chicken to the skillet with the sauce. Toss gently to coat everything in the Alfredo sauce.",
            "Step 7: Cook for an additional 2-3 minutes, or until the pasta and chicken are heated through.",
            "Step 8: Remove from heat and garnish with chopped fresh parsley.",
            "Step 9: Serve the Chicken Alfredo Pasta as a delicious and satisfying main course.",
            "Step 10: Enjoy!"
    );
    private static List<Recipe> RECIPES = List.of(
            new Recipe(1, "Blueberry Pancakes", recipe1Ingredients, recipe1Steps),
            new Recipe(2, "Vegetable Stir-Fry", recipe2Ingredients, recipe2Steps),
            new Recipe(3, "Spaghetti Carbonara", recipe3Ingredients, recipe3Steps),
            new Recipe(4, "Chicken Stir-Fry", recipe4Ingredients, recipe4Steps),
            new Recipe(5, "Caprese Salad", recipe5Ingredients, recipe5Steps),
            new Recipe(6, "Guacamole", recipe6Ingredients, recipe6Steps),
            new Recipe(7, "Vegetable dish", recipe7Ingredients, recipe7Steps),
            new Recipe(8, "Chicken Fajitas", recipe8Ingredients, recipe8Steps),
            new Recipe(9, "Greek Salad", recipe9Ingredients, recipe9Steps),
            new Recipe(10, "Chicken Alfredo Pasta", recipe10Ingredients, recipe10Steps)
    );

    public static List<Recipe> getRecipes() {
        return RECIPES;
    }

    public static Recipe getRecipeById(int requestedId) throws NoSuchElementException {
        Recipe result = null;

        for (Recipe recipe : RECIPES) {
            int id = recipe.getId();

            if (id == requestedId) {
                result = recipe;
            }
        }
        if (result == null) {
            throw new NoSuchElementException();
        }
        return result;
    }

    public static int getNextId() {
        return RECIPES.size() + 1;
    }
    public static void addRecipe(Recipe recipe){
        RECIPES.add(recipe);
    }
}
