package com.revature.citydogs3;

import org.junit.jupiter.api.Test;

public class DogRepoTest {
    @Test
    public void getDogsTest(){
        DogRepo testRepo = new DogRepo("nycdogstest.csv");
        String dogs = testRepo.getDog("Bulldog");
//        Assertions.assertEquals(expectedDog, "86,COOPER,M,2011,French Bulldog,,10309,09/16/2014,09/16/2019,2016,");
    }
}
