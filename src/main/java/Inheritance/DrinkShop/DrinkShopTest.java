package Inheritance.DrinkShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkShopTest {

    @Test
    // positive (+)
    public void shouldBeCoffeeAddedToCart() {
        Coffee Audun = new Coffee(6, 50, 1, "Comment is here", "dark",
                "aeropress");
        {
            boolean actualStatus = Audun.isAddedToCart();
            assertEquals(false, actualStatus);
        }

    }

    @Test
    // positive (+)
    public void shouldBeCoffeeGet20Quantity() {
        Coffee Audun = new Coffee(6, 50, 1, "Comment is here", "dark",
                "aeropress");
        {
            Audun.setQuantity(20);
            int actualQuantity = Audun.getQuantity();
            assertEquals(20, actualQuantity);
        }

    }

    @Test
    // negative (-)
    public void shouldBeCoffeeGetOver20QuantityAndDisplayErrorMessage() {

        try {
            Coffee Audun = new Coffee(6, 50, 1, "Comment is here", "dark",
                    "aeropress");
        } catch (IllegalArgumentException exception) {
            assertEquals("Oooops! Wrong value!", exception.getMessage());
        }

    }

    @Test
    // negative (-)
    public void shouldBeCoffeeGetNegativeQuantityAndDisplayErrorMessage() {

        try {
            Coffee Audun = new Coffee(6, 50, 1, "Comment is here", "dark",
                    "aeropress");
        } catch (IllegalArgumentException exception) {
            assertEquals("Oooops! Wrong value!", exception.getMessage());
        }

    }

    @Test
    // positive (+)
    public void shouldCoffeeSetLightTypeOfRoast() {
        Coffee Audun = new Coffee(6, 50, 1, "Comment is here", "dark",
                "aeropress");
        {
            Audun.setTypeOfRoast("light");
            String actualTypeOfRoast = Audun.getTypeOfRoast();
            assertEquals("light", actualTypeOfRoast);
        }

    }

    @Test
    // negative (-)
    public void shouldCoffeeSetIncorrectTypeOfRoast() {
        Coffee Audun = new Coffee(6, 50, 1, "Comment is here", "dark",
                "aeropress");
        {
            Audun.setTypeOfRoast("medium-light");
            String actualTypeOfRoast = Audun.getTypeOfRoast();
            assertNotEquals("medium-light", actualTypeOfRoast);
        }

    }

    @Test
    // positive (+)
    public void shouldCoffeeSetDripAsATypeOfBrewing() {
        Coffee Audun = new Coffee(6, 50, 1, "Comment is here", "dark",
                "aeropress");
        {
            Audun.setTypeOfBrewing("Drip");
            String actualTypeOfBrewing = Audun.getTypeOfBrewing();
            assertEquals("Drip", actualTypeOfBrewing);
        }

    }
}
