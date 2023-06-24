import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.*;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


@RunWith(MockitoJUnitRunner.class) // запустили этот класс с Mockito
public class BurgerTest {

    private final String TEST_NAME_BUN = "Метеорная булка";
    private final float TEST_PRICE_BUN = 10.5f;
    private final String TEST_NAME_INGREDIENT = "Лунный 1000-островов";
    private final float TEST_PRICE_INGREDIENT = 10f;

    Burger burger;

    //Чтобы создать мок, используй аннотацию @Mock — перед Bun bun, Ingredient firstIngredient и Ingredient secondIngredient
    @Mock
    Bun bun;
    Ingredient firstIngredient = mock(Ingredient.class);
    Ingredient secondIngredient = mock(Ingredient.class);


    @Before
    public void setDefaultBun() { // установить булочку по умолчанию
        burger = new Burger();
    }


    @Test
    public void checkSetBuns() { // проверить набор булок
        burger.setBuns(bun);
        Mockito.when(bun.getName()).thenReturn(TEST_NAME_BUN);
        String actual = bun.getName();
        assertEquals("Возвращается неверное название булки", TEST_NAME_BUN, actual);
    }

    @Test
    public void getPriceBunTest() { // получить цену булочки
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(20f);
        float actual = bun.getPrice();
        assertEquals("Цена булочки некорректна", 20f, actual, 0);
    }

    @Test
    public void getReceipt() { // получить чек
        burger.setBuns(bun);
        Mockito.when(bun.getName()).thenReturn(TEST_NAME_BUN);
        Mockito.when(bun.getPrice()).thenReturn(TEST_PRICE_BUN);

        Mockito.when(firstIngredient.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(firstIngredient.getName()).thenReturn(TEST_NAME_INGREDIENT);
        Mockito.when(firstIngredient.getPrice()).thenReturn(TEST_PRICE_INGREDIENT);

        burger.addIngredient(firstIngredient);

        String expected =
                String.format("(==== %s ====)%n", TEST_NAME_BUN) +
                        String.format("= %s %s =%n", firstIngredient.getType().toString().toLowerCase(), TEST_NAME_INGREDIENT) +
                        String.format("(==== %s ====)%n", TEST_NAME_BUN) +
                        String.format("%nPrice: %f%n", (TEST_PRICE_BUN * 2 + TEST_PRICE_INGREDIENT));

        assertEquals("Неккоректный чек", expected, burger.getReceipt());
    }

}


