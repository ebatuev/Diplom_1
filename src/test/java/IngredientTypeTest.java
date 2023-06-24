import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {

    @Test
    public void ingredientTypeHasTwoElements() { // тип ингредиента состоит из двух элементов
        Assert.assertEquals(2, IngredientType.values().length);
        // Метод valueOf(String name) принимает в качестве аргумента строку. Если вызвать valueOf(), вернётся константа перечисления. Внутри будет значение, которое равно этой строке
        IngredientType.valueOf("SAUCE");
        IngredientType.valueOf("FILLING");
    }

}
