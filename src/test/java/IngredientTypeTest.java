import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {
    @Test
    public void ingredientTypeHasTwoElements() { // тип ингредиента состоит из двух элементов
        Assert.assertEquals(2, IngredientType.values().length);
    }
}
