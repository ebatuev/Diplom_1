import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class) // Аннотация. Перед тестовым классом нужно указать раннер Parameterized — класс, который помогает запускать тесты с параметризацией
public class BunParameterTest {
    private final float price; // создали поля тестового класса


    // Объявить конструктор класса. Он принимает в качестве параметров значения всех полей класса
    public BunParameterTest(float price) {
        this.price = price;
    }

    // добавили аннотацию
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {-1},
                {0},
                {10},
                {100},
        };
    }

    @Test
    public void getPriceReturnThisPrice() {
        Bun bun = new Bun("TestBun", price);
        Assert.assertEquals(bun.price, bun.getPrice(), 0);
    }

}
