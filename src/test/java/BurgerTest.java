import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;

    Burger burger;
    @Before
    public void init() {
        burger = new Burger();
    }
    @Test
    public void setBunsTest(){
        Mockito.when(bun.getName()).thenReturn("Test bun");
        burger.setBuns(bun);
        assertEquals(burger.bun.getName(), "Test bun");
        // System.out.println(burger.getReceipt());
        // assertTrue(burger.getReceipt().contains("Test bun"));
    }
    @Test
    public void addIngredientTest(){
        burger.addIngredient(ingredient);
        assertFalse(burger.ingredients.isEmpty());
    }
    @Test
    public void removeIngredientTest(){
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        assertTrue(burger.ingredients.isEmpty());
    }
    @Test
    public void moveIngredientTest(){
        Ingredient ingredient1 = Mockito.mock(Ingredient.class);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient1);
        burger.moveIngredient(1, 0);
        assertEquals(burger.ingredients.get(0), ingredient1);
        assertEquals(burger.ingredients.get(1), ingredient);
    }
    @Test
    public void burgerGetPriceTest() {
      Mockito.when(bun.getPrice()).thenReturn(200F);
      burger.setBuns(bun);
      Mockito.when(ingredient.getPrice()).thenReturn(350F);
      burger.addIngredient(ingredient);
      assertEquals(burger.getPrice(), 750, 0.0001);
    }
}
