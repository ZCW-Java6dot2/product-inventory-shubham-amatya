package services;

import models.Cigar;
import models.Hat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HatServiceTest {

    @Test

    public void createTest(){
        int expectedId = 123;
        String expectedName = "Chelsea";
        String expectedBrand = "ChelseaFC";
        String expectedColor = "Blue";
        float expectedSize = 6.5f;
        int expectedQuantity = 10;
        float expectedPrice = 9.99f;



        CigarService cigarService = new CigarService();
        Cigar testCigar = CigarService.create(expectedId,expectedName, expectedBrand, expectedColor,
                expectedSize, expectedQuantity, expectedPrice);

        testCigar.setId(expectedId);
        testCigar.setName(expectedName);
        testCigar.setBrand(expectedBrand);
        testCigar.setShape(expectedColor);
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
        Assertions.assertEquals(expectedColor, actualShape);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);


    }

    @Test

    public void testFindHat(){

        HatService hatInventory = new HatService();
        Hat testHat= hatInventory.create(123, "Chelsea", "ChelseaFC", "Blue",
                6.5f, 10, 9.99f);
        Hat testCigar2 = hatInventory.create(913, "Hazard", "Yokohoma", "Oval",
                6.5f, 10, 9.99f);
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
