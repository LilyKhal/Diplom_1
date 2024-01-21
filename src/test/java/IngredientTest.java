import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private final IngredientType expectedType = IngredientType.SAUCE;
    private final String expectedName = "cheese";
    private final float expectedPrice = 320;

    Ingredient ingredient = new Ingredient(expectedType, expectedName, expectedPrice);
    @Test
    public void getPriceTest(){
        assertEquals(ingredient.getPrice(), expectedPrice, 0.001);
    }
    @Test
    public void getNameTest(){
        assertEquals(ingredient.getName(), expectedName);
    }
    @Test
    public void getTypeTest(){
        assertEquals(ingredient.getType(), expectedType);
    }
}
