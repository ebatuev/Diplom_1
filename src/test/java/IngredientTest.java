import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Test", 10);

    @Test
    public void getPriceReturnActualPrice() { // получить цену. Вернуть актуальную цену
        Assert.assertEquals(10, ingredient.getPrice(), 0);
    }

    @Test
    public void getNameReturnActualName() { // получить имя. Вернуть актуальную имя
        Assert.assertEquals("Test", ingredient.getName());
    }

    @Test
    public void getTypeReturnActualType() { // получить тип. Вернуть актуальный тип
        Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }

}
