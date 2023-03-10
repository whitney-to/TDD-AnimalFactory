package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

//    public CatHouseTest(){
//        // Given (cat data)
//        CatHouse catHouse = new CatHouse();
//        String givenName = "";
//        Date givenBirthDate = new Date();
//        Integer givenId = 0;
//        Integer expected = 1;
//
//        // When (a cat is constructed)
//        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
//        CatHouse.add(cat1);
//    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat expected = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(0);

        // Then
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        // Given (cat data)
        String givenName = "1";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        // When (a cat is constructed)
        Cat expected = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(expected);
        CatHouse.remove(1);

        // Then
        Assert.assertEquals(null,CatHouse.getCatById(1));
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemove2(){
        // Given (cat data)
        String givenName = "2";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        // When (a cat is constructed)
        Cat cat2 = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat2);
        CatHouse.remove(cat2);

        // Then
        Assert.assertEquals(null,CatHouse.getCatById(2));
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        // Given (cat data)
        String givenName = "3";
        Date givenBirthDate = new Date();
        Integer givenId = 3;

        // When (a cat is constructed)
        Cat expected = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(3);

        // Then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        // Given (cat data)
        int expected = 1;

        // When (a cat is constructed)
        CatHouse.clear();
        Cat cat = new Cat("fluffy", new Date(), 4);
        CatHouse.add(cat);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected,actual);
    }
}
