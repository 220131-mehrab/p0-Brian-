package com.revature.citydogs;

public class DogClass {
    private String name;
    private String breed;
    private int zip;
    private int birthyear;

    public DogClass() {}

    public DogClass(String name) {
        this("", "", 11111, 1999);
    }

    public DogClass(String name, String breed, int zip, int birthyear) {
        this.name = name;
        this.breed = breed;
        this.zip = zip;
        this.birthyear = birthyear;
    }

    public static DogClass of() {
        return new DogClass();
    }

    public DogClass name() {
        return this;
    }

    public DogClass breed() {
        return this;
    }

    public DogClass zip() {
        return this;
    }

    public DogClass birthyear() {
        return this;
    }

    public String getName() {return this.name; }

    @Override
    public String toString() {return this.name; }
}
