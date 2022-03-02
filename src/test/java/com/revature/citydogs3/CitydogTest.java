package com.revature.citydogs3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CitydogTest {

    @Test
    public void constructorTest() {
        String name = "Bulldog";
        Dogs dog = new Dogs(name);
    }

    @Test
    public void nameTest() {
        Dogs dog = new Dogs("Poodle");
        Assertions.assertEquals(dog.getName(), "Poodle");
        dog = new Dogs("Golden");
        Assertions.assertEquals("Golden", dog.getName());
    }
}
