import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FelineTest {

    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals("Должен быть список для хищников!", expectedFood, actualFood);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Семейство должно быть кошачьи!", expectedFamily, actualFamily);
    }

    @Test
    public void felineGetKittens() {
        Feline feline = new Feline();
        int expectedCountKittens = 1;
        int actualCountKittens = feline.getKittens();
        Assert.assertEquals("Должен быть 1 котенок!", expectedCountKittens, actualCountKittens);
    }
}
