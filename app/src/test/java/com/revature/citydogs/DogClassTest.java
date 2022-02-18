package com.revature.citydogs;

import org.junit.jupiter.api.Test;

public class DogClassTest {
    @Test
    public void constructorTest() {
        String breed = "French Bulldog";
        DogClass dogClass = new DogClass(breed);
    }
}

//    @Test
//    public void builderTest() {
//        Dog actual = Dog.of().name().breed().zip().birthyear();
//    }
//}
