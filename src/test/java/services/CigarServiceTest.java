package services;

import models.Cigar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class CigarServiceTest {
    @Test

    public void createTest(){

        int expectedId = 123;
        String expectedName = "Bob's";
        String expectedBrand = "Tito";
        String expectedShape = "Corona";
        float expectedSize = 6.5f;
        int expectedQuantity = 10;
        float expectedPrice = 9.99f;


        CigarService cigarService = new CigarService();
        Cigar testCigar = CigarService.create(expectedId,expectedName, expectedBrand, expectedShape,
                expectedSize, expectedQuantity, expectedPrice);

        testCigar.setId(expectedId);
        testCigar.setName(expectedName);
        testCigar.setBrand(expectedBrand);
        testCigar.setShape(expectedShape);
        testCigar.setSize(expectedSize);
        testCigar.setQuantity(expectedQuantity);
        testCigar.setPrice(expectedPrice);

        int actualId = testCigar.getId();
        String actualName = testCigar.getName();
        String actualBrand = testCigar.getBrand();
        String actualShape = testCigar.getShape();
        float actualSize = testCigar.getSize();
        int actualQuantity = testCigar.getQuantity();
        float actualPrice = testCigar.getPrice();


        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand );
        Assertions.assertEquals(expectedShape, actualShape);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);


        }

        @Test

    public void testFindCigar(){

        CigarService cigarInventory = new CigarService();
        Cigar testCigar1= cigarInventory.create(123, "Bob's", "Tito", "Corona",
                6.5f, 10, 9.99f);
        Cigar testCigar2 = cigarInventory.create(913, "Hazard", "Yokohoma", "Oval",
                6.99f, 110, 5.99f);
          // ArrayList<Cigar>testInventory = cigarInventory.findCigar();

    }

    @Test

    public void testfindAll(){
        Cigar [] cArr = new Cigar[10];
        CigarService CS = new CigarService();
        Cigar [] testCigar = CS.findAll();
        Assertions.assertEquals(10, 10);



    }


}
