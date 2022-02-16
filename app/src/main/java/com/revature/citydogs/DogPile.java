package com.revature.citydogs;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogPile {
    private List<String> cityDogs;
    private InputStream file;

    public DogPile(String filename) {
        this.cityDogs = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            this.cityDogs.add(scanner.next());
        }
    }

    public List<String> getDogs() {
        return cityDogs;
    }

    public String getDog(String name) {
        String result = "";
        for (String dog : this.cityDogs) {
            if (dog.contains(name)) {
                result = dog;
            }
        }
        return result;
    }
}
