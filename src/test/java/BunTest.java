import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;


public class BunTest {

    // Создаем локальные переменные для ожидаемого результата
    private final String TEST_NAME_BUN = "Метеорная булка";
    private final float TEST_PRICE_BUN = 10.5f;

    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun(TEST_NAME_BUN, TEST_PRICE_BUN);
    }

    @Test
    public void getNameReturnThisName() { // получить имя. Вернуть это имя
        String actual = bun.getName();
        assertEquals("В имени булки ошибка", TEST_NAME_BUN, actual);
    }

    @Test
    public void getPriceReturnThisPrice() { // получить цену. Вернуть эту цену
        float actual = bun.getPrice();
        assertEquals("В цене булки ошибка", TEST_PRICE_BUN, actual, 0);
    }

}
