package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CigarTest {



    @Test
    public void setNameTest() {
        String expected = "Uncle Bob";
       Cigar testCigar = new Cigar();
       testCigar.setName(expected);
       Assertions.assertEquals(expected, testCigar.getName());
    }


    @Test
    public void testId() {
        int expected = 12345;
        Cigar testCigar = new Cigar();
        testCigar.setId(expected);
        Assertions.assertEquals(expected, testCigar.getId());
    }


    @Test
    public void testBrand() {
        String expected = "Smoky D";
        Cigar testCigar = new Cigar();
        testCigar.setBrand(expected);
        Assertions.assertEquals(expected, testCigar.getBrand());

    }

    @Test
    public void testShape() {
        String expected = "corona";
        Cigar testCigar = new Cigar();
        testCigar.setShape(expected);
        Assertions.assertEquals(expected, testCigar.getShape());
    }


    @Test
    public void testSize(){
        float expected = 6.00f;
        Cigar testCigar = new Cigar();
        testCigar.setSize(expected);
        Assertions.assertEquals(expected, testCigar.getSize());

    }

    @Test
    public void testQuantity(){
        int expected = 100;
        Cigar testCigar = new Cigar();
        testCigar.setQuantity(expected);
        Assertions.assertEquals(expected, testCigar.getQuantity());
    }

    @Test

    public void testPrice(){
        float expected = 1000.99f;
        Cigar testCigar = new Cigar();
        testCigar.setPrice(expected);
        Assertions.assertEquals(expected, testCigar.getPrice());
    }

   @Test

    public void constructorTest(){
       int expectedId = 123;
       String expectedName = "Bob's";
       String expectedBrand = "Tito";
       String expectedShape = "Corona";
       float expectedSize = 6.5f;
       int expectedQuantity = 10;
       float expectedPrice = 9.99f;


        Cigar testCigar = new Cigar(expectedId,expectedName, expectedBrand, expectedShape,
                expectedSize, expectedQuantity, expectedPrice);

         testCigar.setId(expectedId);
         testCigar.setName(expectedName);
         testCigar.setBrand(expectedBrand);
         testCigar.setShape(expectedShape);
         testCigar.setSize(expectedSize);
         testCigar.setQuantity(expectedQuantity);
         testCigar.setPrice(expectedPrice);


        Assertions.assertEquals(expectedId, testCigar.getId());
        Assertions.assertEquals(expectedName, testCigar.getName());
        Assertions.assertEquals(expectedBrand, testCigar.getBrand());
        Assertions.assertEquals(expectedShape, testCigar.getShape());
        Assertions.assertEquals(expectedSize, testCigar.getSize());
        Assertions.assertEquals(expectedQuantity, testCigar.getQuantity());
        Assertions.assertEquals(expectedPrice, testCigar.getPrice());

}

}
