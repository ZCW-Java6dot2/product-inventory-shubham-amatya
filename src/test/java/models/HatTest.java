package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HatTest {


    @Test

    public void testId(){
        int expected = 9851;
        Hat h1= new Hat();
        h1.setId(expected);
        Assertions.assertEquals(expected, h1.getId());
    }

    @Test

    public void testName(){
        String expected = "Sorting hat";
        Hat h1 = new Hat();
        h1.setName(expected);
        Assertions.assertEquals(expected, h1.getName());
    }

    @Test

    public void testBrand(){
        String expected = "Goldstar";
        Hat h1 = new Hat();
        h1.setBrand(expected);
        Assertions.assertEquals(expected, h1.getBrand());

    }

    @Test

    public void testColor(){
        String expected = "blue";
        Hat h1 = new Hat();
        h1.setColor(expected);
        Assertions.assertEquals(expected, h1.getColor());

    }

    @Test

    public void testSize(){
        float expected = 10.0f;
        Hat h1 = new Hat();
        h1.setSize(expected);
        Assertions.assertEquals(expected, h1.getSize());
    }

    @Test

    public void testQuantity(){
        int expected =55;
        Hat h1 = new Hat();
        h1.setQuantity(expected);
        Assertions.assertEquals(expected, h1.getQuantity());
    }

    @Test

    public void testPrice(){
        float expected = 99.99f;
        Hat h1 = new Hat();
        h1.setPrice(expected);
        Assertions.assertEquals(expected, h1.getPrice());
    }


}
