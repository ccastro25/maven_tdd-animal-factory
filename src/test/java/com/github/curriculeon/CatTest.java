package com.github.curriculeon;

import com.github.curriculeon.animals.Animal;
import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public void setNameTest(){

        String date ="04-25-1986";
        Cat cat;
        try {
            cat  = new Cat("meme",
                    new SimpleDateFormat("MM-dd-yyyy").parse(date),1);
        } catch (ParseException e){
            throw new Error(e);
        }
        cat.setName("pops");
        Assert.assertEquals("pops",cat.getName());

    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Cat cat = new Cat("tess",new Date(),2);
        Assert.assertEquals(cat.speak(), "meow!");
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Cat cat;
        Date date;
        try {
             date = new SimpleDateFormat("MM-dd-yyyy").parse("02-26-2011");
            cat = new Cat("bobo",date,2);


        }
        catch (ParseException e)
        {throw new Error(e);}
        Assert.assertEquals(cat.getBirthDate(),date);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Cat cat = new Cat("pearl", new Date() , 3);
        Food food = new Food();
        cat.eat(food);
        cat.eat(food);
        Assert.assertEquals(2, cat.getNumberOfMealsEaten().intValue());
    }
    // TODO - Create tests for `Integer getId()
    @Test
    public void getIdTest(){
        Cat cat = new Cat("carl", new Date(), 3);
        Assert.assertEquals(3, cat.getId().intValue());
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalInheritance(){
        Cat cat = new Cat("kim",new Date(),5);
        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void check(){
        Cat cat = new Cat("keal",new Date(),6);
        Assert.assertTrue(cat instanceof Mammal);
    }


}
