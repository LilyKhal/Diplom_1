import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Test
    public void runTestBurgerGetPrice()  throws Exception {


//        Burger burger = new Burger();
//        burger.setBuns(bun);
//
//        ingredient.name = "Test Ingredient Name";
//        ingredient.price = 1;
//        ingredient.type = IngredientType.SAUCE;
//        burger.addIngredient(ingredient);
//        Float bunPrice;
//        Mockito.when(bun.getPrice()).thenReturn(bunPrice);
//        Mockito.when(ingredient.getPrice()).thenReturn(ingMockPrice);
//
//        assertEquals("Неправильно рассчитана стоимость!", expectedPrice, burger.getPrice(), 0);
    }
}
