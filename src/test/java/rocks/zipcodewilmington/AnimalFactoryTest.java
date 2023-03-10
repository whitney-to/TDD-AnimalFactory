package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        // Given
        String name = "doggo";
        Date date = new Date();

        // When
        Dog dog = AnimalFactory.createDog(name, date);

        // Then
        Assert.assertEquals(name,dog.getName());
        Assert.assertEquals(date,dog.getBirthDate());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat(){
        // Given
        String name = "Muffin";
        Date date = new Date();

        // When
        Cat cat = AnimalFactory.createCat(name, date);

        // Then
        Assert.assertEquals(name,cat.getName());
        Assert.assertEquals(date,cat.getBirthDate());
    }
}
