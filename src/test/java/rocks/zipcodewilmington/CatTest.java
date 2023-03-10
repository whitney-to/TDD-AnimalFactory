package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {



    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertEquals(cat.getName(),givenName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expected = "meow!";

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertEquals(cat.speak(),expected);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBD(){
        // Given (cat data)
        Date expectedDate = new Date("12/12/12");
        String givenName = "";
        Date givenBirthDate = new Date("12/12/12");
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertEquals(cat.getBirthDate(),expectedDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEatFood(){
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 2;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.eat(new Food());
        cat.eat(new Food());
        Integer actual = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testIntegerId(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 123;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertEquals(cat.getId(),givenId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 123;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 123;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Mammal);
    }

}
