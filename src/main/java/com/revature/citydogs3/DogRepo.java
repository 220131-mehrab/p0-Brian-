package com.revature.citydogs3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogRepo {
    private List<String> dogs;
    private InputStream file;

    public DogRepo(String filename) {
        this.dogs = new ArrayList<>();
// standard industry way to load files
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {

        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter(",,");
        while (scanner.hasNext()) {
            this.dogs.add(scanner.next());
            String[] dogCols = scanner.next().split(",");
//            Dogs temp = new Dogs(dogCols[1]);
        }
    }

    public List<String> getAllDogs() {
        return dogs;
    }
    public String getDog(String name) {
        String result = "";
        for (String dogs : this.dogs) {
            //if this lines contains
            if (dogs.contains(name)) {
                result = dogs;
            }
        }
        return result;
    }
}
