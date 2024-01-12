import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class BurgerReceiptTest {
    private final Bun bun;
    private final List<Ingredient> ingredients;

    public String getExpectedReceipt(float burgerPrice) {
        StringBuilder receipt = new StringBuilder(String.format("(==== %s ====)%n", bun.getName()));

        for (Ingredient ingredient : ingredients) {
            receipt.append(String.format("= %s %s =%n", ingredient.getType().toString().toLowerCase(),
                    ingredient.getName()));
        }

        receipt.append(String.format("(==== %s ====)%n", bun.getName()));
        receipt.append(String.format("%nPrice: %f%n", burgerPrice));

        return receipt.toString();
    }

    public BurgerReceiptTest(Bun bun,
                             List<Ingredient> ingredients) {
        this.bun = bun;
        this.ingredients = ingredients;
    }
    @Parameterized.Parameters
    public static Object[][] data(){
        return new Object[][]{
                {new Bun("buckwheat", 150F), List.of()},
                {new Bun("buckwheat", 150F), List.of(new Ingredient(SAUCE, "cheese", 35F))},
                {new Bun("buckwheat", 150F), List.of(new Ingredient(FILLING, "meat", 55F))},
                {new Bun("buckwheat", 150F), List.of(new Ingredient(FILLING, "meat", 55F), new Ingredient(SAUCE, "cheese", 35F))},
        };
    }
  @Test
    public void burgerReceiptTest(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        for (Ingredient ingredient : ingredients) {
           burger.addIngredient(ingredient);
        }
        assertEquals(burger.getReceipt(), getExpectedReceipt(burger.getPrice()));
    }
}
