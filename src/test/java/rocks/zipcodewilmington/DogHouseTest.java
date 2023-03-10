package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog(){
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 99;

        // When (a cat is constructed)
        Dog expected = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(99);

        // Then
        Assert.assertEquals(expected,actual);
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 100;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(100);
        Dog actual = DogHouse.getDogById(100);

        // Then
        Assert.assertEquals(null,actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveByRef(){
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 101;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(101);

        // Then
        Assert.assertEquals(null,actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogByID(){
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 102;

        // When (a cat is constructed)
        Dog expected = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(102);

        // Then
        Assert.assertEquals(expected,actual);
    }



}
