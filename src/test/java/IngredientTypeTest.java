import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {
    @Test
    public void sauceTypeTest(){
        assertEquals(IngredientType.SAUCE.name(), "SAUCE");
    }
    @Test
    public void fillingTypeTest(){
        assertEquals(IngredientType.FILLING.name(), "FILLING");
    }
}
