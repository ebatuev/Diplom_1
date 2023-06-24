import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {

    private final String TEST_NAME_INGREDIENT = "Лунный 1000-островов";
    private final float TEST_PRICE_INGREDIENT = 10f;
    private Ingredient ingredient;


    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.SAUCE, TEST_NAME_INGREDIENT, TEST_PRICE_INGREDIENT);
    }


    @Test
    public void getPriceReturnActualPrice() { // получить цену. Вернуть актуальную цену
        Assert.assertEquals("Неверная цена ингредиента", TEST_PRICE_INGREDIENT, ingredient.getPrice(), 0);
    }

    @Test
    public void getNameReturnActualName() { // получить имя. Вернуть актуальную имя
        Assert.assertEquals("Неверное имя ингредиента", TEST_NAME_INGREDIENT, ingredient.getName());
    }

    @Test
    public void getTypeReturnActualType() { // получить тип. Вернуть актуальный тип
        Assert.assertEquals("Типы ингредиентов не совпадают", IngredientType.SAUCE, ingredient.getType());
    }

}
