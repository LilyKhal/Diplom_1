import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private final String expectedName = "Test bun";
    private final float expectedPrice = 200;
    Bun bun = new Bun(expectedName, expectedPrice);
    @Test
    public void getNameTest(){
        assertEquals(bun.getName(), expectedName);
    }
    @Test
    public void getPriceTest(){
        assertEquals(bun.getPrice(), expectedPrice, 0.001);
    }
}
