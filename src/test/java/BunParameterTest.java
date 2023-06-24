import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import praktikum.Bun;

@RunWith(Parameterized.class) // Аннотация. Перед тестовым классом нужно указать раннер Parameterized — класс, который помогает запускать тесты с параметризацией
public class BunParameterTest {

    private final String name; // создали поля тестового класса
    private final float price;


    @Mock
    private Bun bun;


    // Объявить конструктор класса. Он принимает в качестве параметров значения всех полей класса
    public BunParameterTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    // добавили аннотацию
    @Parameterized.Parameters(name = "Проверка возвращаемого значения в зависимости от переданного")
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Флюоресцентная булка", -1f},
                {"Краторная булка", 0f},
                {"Метеорная булка", 10f},
                {"Солнечная булка",100f},
        };
    }

    @Test
    public void getActualNameAndPrice() { // получить актуальное имя и цену
        bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
        Assert.assertEquals(price, bun.getPrice(), 0);
    }

}
