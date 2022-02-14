package com.revature.droughtwatch;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DexRepository {
    private final List<String> dataset1;
    private final InputStream file;

    public DexRepository(String filename) {
        this.dataset1 = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            this.dataset1.add(scanner.next());
        }
    }

    public List<String> getDataset1() {
        return dataset1;
    }
}
