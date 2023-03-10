package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testConstructor(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expected = "bark!";

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertEquals(dog.speak(),expected);
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
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertEquals(dog.getBirthDate(),expectedDate);
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
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        dog.eat(new Food());
        dog.eat(new Food());
        Integer actual = dog.getNumberOfMealsEaten();

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
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertEquals(dog.getId(),givenId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 123;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        // Given (cat data)
        String givenName = "Bella";
        Date givenBirthDate = new Date();
        Integer givenId = 123;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
