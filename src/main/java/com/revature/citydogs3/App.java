package com.revature.citydogs3;

public class App {
    public static void main(String[] args) {
        DogRepo dogRepo = new DogRepo("nycdogs.csv");
        DogService dogService = new DogService(dogRepo);
        DogServer dogServer = new DogServer(dogService);
    }
}
