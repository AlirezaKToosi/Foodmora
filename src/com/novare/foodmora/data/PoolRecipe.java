package com.novare.foodmora.data;

import com.novare.foodmora.utill.Ingredient;
import com.novare.foodmora.utill.MeasureType;
import com.novare.foodmora.utill.Recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class PoolRecipe {
    private static final List<Ingredient> recipe1Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("all-purpose flour", MeasureType.KILOGRAM, 0.2),
            new Ingredient("blueberries", MeasureType.KILOGRAM, 0.1),
            new Ingredient("sugar", MeasureType.KILOGRAM, 0.025),
            new Ingredient("egg", MeasureType.QUANTITY, 1),
            new Ingredient("baking powder", MeasureType.KILOGRAM, 0.01),
            new Ingredient("milk", MeasureType.LITERS, 1),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.025),
            new Ingredient("melted butter", MeasureType.LITERS, 0.025)
    ));
    private static final List<String> recipe1Steps = new ArrayList<>(Arrays.asList(
            "Step 1:Mix the dry ingredients and add the blueberries.",
            "Step 2:Combine the egg, milk, and melted butter and stir into the flour mixture. Do not over mix.",
            "Step 3:Cook pancakes on a greased griddle or skillet over medium heat until golden brown on both sides."
    ));
    private static final List<Ingredient> recipe2Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("broccoli florets", MeasureType.KILOGRAM, 0.2),
            new Ingredient("carrots, sliced", MeasureType.KILOGRAM, 0.1),
            new Ingredient("red bell pepper, sliced", MeasureType.KILOGRAM, 0.1),
            new Ingredient("snow peas", MeasureType.KILOGRAM, 0.1),
            new Ingredient("garlic cloves, minced", MeasureType.KILOGRAM, 0.02),
            new Ingredient("soy sauce", MeasureType.LITERS, 0.03),
            new Ingredient("sesame oil", MeasureType.LITERS, 0.01),
            new Ingredient("vegetable oil", MeasureType.LITERS, 0.02)
    ));

    private static final List<String> recipe2Steps = new ArrayList<>(Arrays.asList(
            "Step 1: Heat vegetable oil and sesame oil in a wok or large skillet over high heat.",
            "Step 2: Add minced garlic and stir-fry for 30 seconds until fragrant.",
            "Step 3: Add broccoli, carrots, and red bell pepper. Stir-fry for 3-4 minutes until vegetables are crisp-tender.",
            "Step 4: Add snow peas and soy sauce. Stir-fry for an additional 2 minutes.",
            "Step 5: Remove from heat and serve the vegetable stir-fry hot."
    ));
    private static final List<Ingredient> recipe3Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("spaghetti", MeasureType.KILOGRAM, 0.5),
            new Ingredient("bacon, chopped", MeasureType.KILOGRAM, 0.4),
            new Ingredient("garlic cloves, minced", MeasureType.KILOGRAM, 0.02),
            new Ingredient("eggs", MeasureType.QUANTITY, 2),
            new Ingredient("Parmesan cheese, grated", MeasureType.KILOGRAM, 0.25),
            new Ingredient("black pepper, freshly ground", MeasureType.KILOGRAM, 0.02),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.01)
    ));

    private static final List<String> recipe3Steps = new ArrayList<>(Arrays.asList(
            "Step 1: Cook spaghetti according to package instructions. Drain and set aside.",
            "Step 2: In a large skillet, cook chopped bacon until crispy. Remove bacon from the skillet and set aside, leaving the bacon grease in the skillet.",
            "Step 3: In the same skillet, add minced garlic to the bacon grease and cook for 1 minute until fragrant.",
            "Step 4: In a bowl, whisk together eggs, grated Parmesan cheese, black pepper, and salt.",
            "Step 5: Add cooked spaghetti to the skillet with the garlic and bacon grease. Remove the skillet from heat.",
            "Step 6: Pour the egg mixture over the spaghetti and quickly toss until the pasta is evenly coated and the sauce thickens slightly.",
            "Step 7: Add the crispy bacon back into the skillet and toss to combine.",
            "Step 8: Serve the spaghetti carbonara hot, garnished with additional grated Parmesan cheese and black pepper if desired."
    ));
    private static final List<Ingredient> recipe4Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("boneless, skinless chicken breasts, sliced", MeasureType.KILOGRAM, 0.8),
            new Ingredient("bell peppers, sliced", MeasureType.KILOGRAM, 0.01),
            new Ingredient("onion, sliced", MeasureType.KILOGRAM, 0.1),
            new Ingredient("broccoli florets", MeasureType.KILOGRAM, 0.2),
            new Ingredient("garlic cloves, minced", MeasureType.KILOGRAM, 0.02),
            new Ingredient("soy sauce", MeasureType.LITERS,0.03),
            new Ingredient("hoisin sauce", MeasureType.LITERS,0.02),
            new Ingredient("sesame oil", MeasureType.LITERS,0.01),
            new Ingredient("vegetable oil", MeasureType.LITERS,0.02)
    ));

    private static final List<String> recipe4Steps = new ArrayList<>(Arrays.asList(
            "Step 1: In a large skillet or wok, heat vegetable oil and sesame oil over medium-high heat.",
            "Step 2: Add minced garlic and stir-fry for 30 seconds until fragrant.",
            "Step 3: Add sliced chicken breasts and cook until browned and cooked through, about 5-6 minutes.",
            "Step 4: Add sliced bell peppers, sliced onion, and broccoli florets. Stir-fry for 3-4 minutes until vegetables are crisp-tender.",
            "Step 5: In a small bowl, whisk together soy sauce and hoisin sauce. Pour the sauce over the chicken and vegetables in the skillet.",
            "Step 6: Stir-fry for an additional 2 minutes, ensuring everything is coated in the sauce and heated through.",
            "Step 7: Remove from heat and serve the chicken stir-fry hot. It can be enjoyed on its own or served over steamed rice."
    ));
    private static final List<Ingredient> recipe5Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("ripe tomatoes, sliced", MeasureType.QUANTITY, 4),
            new Ingredient("fresh mozzarella cheese, sliced", MeasureType.KILOGRAM, 0.4),
            new Ingredient("fresh basil leaves", MeasureType.KILOGRAM, 0.1),
            new Ingredient("extra-virgin olive oil", MeasureType.LITERS,0.02),
            new Ingredient("balsamic glaze", MeasureType.LITERS,0.02),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.02),
            new Ingredient("black pepper, freshly ground", MeasureType.KILOGRAM, 0.01)
    ));

    private static final List<String> recipe5Steps = new ArrayList<>(Arrays.asList(
            "Step 1: Arrange tomato slices and mozzarella slices on a serving platter, alternating them.",
            "Step 2: Place fresh basil leaves on top of the tomato and mozzarella slices.",
            "Step 3: Drizzle extra-virgin olive oil and balsamic glaze over the salad.",
            "Step 4: Season with a pinch of salt and freshly ground black pepper.",
            "Step 5: Serve the Caprese salad immediately as a refreshing appetizer or side dish."
    ));
    private static final List<Ingredient> recipe6Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("ripe avocados", MeasureType.QUANTITY, 3),
            new Ingredient("lime, juiced", MeasureType.QUANTITY, 1),
            new Ingredient("red onion, finely chopped", MeasureType.QUANTITY, 1 / 4),
            new Ingredient("tomato, diced", MeasureType.QUANTITY, 1),
            new Ingredient("fresh cilantro leaves, chopped", MeasureType.KILOGRAM, 0.1),
            new Ingredient("jalapeno pepper, seeded and minced", MeasureType.KILOGRAM, 0.01),
            new Ingredient("garlic clove, minced", MeasureType.KILOGRAM, 0.01),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.01),
            new Ingredient("black pepper, freshly ground", MeasureType.KILOGRAM, 0.01)
    ));

    private static final List<String> recipe6Steps = new ArrayList<>(Arrays.asList(
            "Step 1: Cut the avocados in half, remove the pits, and scoop the flesh into a bowl.",
            "Step 2: Mash the avocados with a fork or potato masher until desired consistency is reached.",
            "Step 3: Add lime juice to the mashed avocados and stir well to prevent browning.",
            "Step 4: Add finely chopped red onion, diced tomato, chopped cilantro, minced jalapeno pepper, and minced garlic to the bowl.",
            "Step 5: Season with salt and freshly ground black pepper.",
            "Step 6: Stir all the ingredients together until well combined.",
            "Step 7: Taste and adjust the seasoning if needed.",
            "Step 8: Serve the guacamole immediately with tortilla chips or as a topping for tacos, nachos, or salads."
    ));
    private static final List<Ingredient> recipe7Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("mixed vegetables (e.g., bell peppers, broccoli, carrots)", MeasureType.KILOGRAM, 0.5),
            new Ingredient("tofu, cubed", MeasureType.KILOGRAM, 0.1),
            new Ingredient("soy sauce", MeasureType.LITERS, 0.02),
            new Ingredient("sesame oil", MeasureType.LITERS,0.01),
            new Ingredient("garlic cloves, minced", MeasureType.KILOGRAM, 0.02),
            new Ingredient("ginger, grated", MeasureType.KILOGRAM, 0.01),
            new Ingredient("cornstarch", MeasureType.LITERS,0.01),
            new Ingredient("vegetable broth", MeasureType.KILOGRAM, 0.1),
            new Ingredient("vegetable oil", MeasureType.LITERS, 0.02),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.01),
            new Ingredient("black pepper, freshly ground", MeasureType.KILOGRAM, 0.01)
    ));

    private static final List<String> recipe7Steps = new ArrayList<>(Arrays.asList(
            "Step 1: In a small bowl, whisk together soy sauce, sesame oil, minced garlic, grated ginger, cornstarch, vegetable broth, salt, and black pepper.",
            "Step 2: In a large skillet or wok, heat vegetable oil over medium-high heat.",
            "Step 3: Add the cubed tofu to the skillet and cook until lightly browned and crispy on all sides. Remove the tofu from the skillet and set aside.",
            "Step 4: In the same skillet, add the mixed vegetables and stir-fry for 3-4 minutes until they are crisp-tender.",
            "Step 5: Return the tofu to the skillet and pour the sauce mixture over the vegetables and tofu.",
            "Step 6: Stir-fry for an additional 2 minutes until the sauce thickens and coats the vegetables and tofu.",
            "Step 7: Remove from heat and serve the vegetable stir-fry hot, over steamed rice or noodles."
    ));
    private static final List<Ingredient> recipe8Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("boneless, skinless chicken breasts", MeasureType.KILOGRAM, 1),
            new Ingredient("bell peppers (assorted colors), sliced", MeasureType.KILOGRAM, 0.5),
            new Ingredient("onion, sliced", MeasureType.QUANTITY, 1),
            new Ingredient("olive oil", MeasureType.LITERS, 0.02),
            new Ingredient("lime, juiced", MeasureType.QUANTITY, 1),
            new Ingredient("ground cumin", MeasureType.KILOGRAM, 0.01),
            new Ingredient("chili powder", MeasureType.KILOGRAM, 0.01),
            new Ingredient("garlic powder", MeasureType.KILOGRAM, 0.01),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.01),
            new Ingredient("black pepper, freshly ground", MeasureType.KILOGRAM, 0.01),
            new Ingredient("flour tortillas", MeasureType.KILOGRAM, 0.1),
            new Ingredient("sour cream", MeasureType.LITERS, 0.1),
            new Ingredient("guacamole", MeasureType.KILOGRAM, 0.05),
            new Ingredient("salsa", MeasureType.KILOGRAM, 0.01),
            new Ingredient("fresh cilantro, chopped", MeasureType.KILOGRAM, 0.02)
    ));

    private static final List<String> recipe8Steps = new ArrayList<>(Arrays.asList(
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
    ));
    private static final List<Ingredient> recipe9Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("ripe tomatoes, diced", MeasureType.QUANTITY, 4),
            new Ingredient("cucumber, diced", MeasureType.QUANTITY, 1),
            new Ingredient("red onion, thinly sliced", MeasureType.QUANTITY, 1 / 2),
            new Ingredient("kalamata olives, pitted", MeasureType.QUANTITY, 1 / 2),
            new Ingredient("feta cheese, crumbled", MeasureType.KILOGRAM, 0.1),
            new Ingredient("fresh parsley, chopped", MeasureType.KILOGRAM, 0.02),
            new Ingredient("extra-virgin olive oil", MeasureType.LITERS, 0.02),
            new Ingredient("lemon juice", MeasureType.LITERS, 0.02),
            new Ingredient("dried oregano", MeasureType.KILOGRAM, 0.01),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.01),
            new Ingredient("black pepper, freshly ground", MeasureType.KILOGRAM, 0.01)
    ));

    private static final List<String> recipe9Steps = new ArrayList<>(Arrays.asList(
            "Step 1: In a large salad bowl, combine the diced tomatoes, diced cucumber, thinly sliced red onion, pitted kalamata olives, crumbled feta cheese, and chopped fresh parsley.",
            "Step 2: In a small bowl, whisk together the extra-virgin olive oil, lemon juice, dried oregano, salt, and black pepper to make the dressing.",
            "Step 3: Pour the dressing over the salad ingredients and toss gently to combine.",
            "Step 4: Let the Greek salad sit for about 10-15 minutes to allow the flavors to meld together.",
            "Step 5: Serve the Greek salad as a refreshing and healthy appetizer or side dish.",
            "Step 6: Enjoy!"
    ));
    private static final List<Ingredient> recipe10Ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient("fettuccine pasta", MeasureType.KILOGRAM, 0.5),
            new Ingredient("boneless, skinless chicken breasts", MeasureType.KILOGRAM, 0.5),
            new Ingredient("salt", MeasureType.KILOGRAM, 0.01),
            new Ingredient("black pepper, freshly ground", MeasureType.KILOGRAM, 0.01),
            new Ingredient("garlic powder", MeasureType.KILOGRAM, 0.01),
            new Ingredient("olive oil", MeasureType.LITERS, 0.01),
            new Ingredient("unsalted butter", MeasureType.LITERS, 0.08),
            new Ingredient("heavy cream", MeasureType.KILOGRAM, 0.05),
            new Ingredient("parmesan cheese, grated", MeasureType.KILOGRAM, 0.05),
            new Ingredient("fresh parsley, chopped", MeasureType.KILOGRAM, 0.05)
    ));

    private static final List<String> recipe10Steps = new ArrayList<>(Arrays.asList(
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
    ));
    private static final List<Recipe> RECIPES = new ArrayList<>(List.of(
            new Recipe("Blueberry Pancakes", recipe1Ingredients, recipe1Steps),
            new Recipe("Vegetable Stir-Fry", recipe2Ingredients, recipe2Steps),
            new Recipe("Spaghetti Carbonara", recipe3Ingredients, recipe3Steps),
            new Recipe("Chicken Stir-Fry", recipe4Ingredients, recipe4Steps),
            new Recipe("Caprese Salad", recipe5Ingredients, recipe5Steps),
            new Recipe("Guacamole", recipe6Ingredients, recipe6Steps),
            new Recipe("Vegetable dish", recipe7Ingredients, recipe7Steps),
            new Recipe("Chicken Fajitas", recipe8Ingredients, recipe8Steps),
            new Recipe("Greek Salad", recipe9Ingredients, recipe9Steps),
            new Recipe("Chicken Alfredo Pasta", recipe10Ingredients, recipe10Steps)
    ));

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

    public static void addRecipe(Recipe recipe){
        RECIPES.add(recipe);
    }
}
