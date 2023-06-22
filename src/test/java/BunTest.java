import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    private final Bun bun = new Bun("Test", 10);

    @Test
    public void getNameReturnThisName() { // получить имя. Вернуть это имя
        Assert.assertEquals(bun.name, bun.getName());
    }

    @Test
    public void getPriceReturnThisPrice() { // получить цену. Вернуть эту цену
        Assert.assertEquals(bun.price, bun.getPrice(), 0);
    }

}
