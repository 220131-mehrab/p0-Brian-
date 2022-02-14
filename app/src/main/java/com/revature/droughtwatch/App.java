package com.revature.droughtwatch;

public class App {
    public static void main(String[] args) {
        DexRepository dexRepository = new DexRepository("waterlevels.csv");
        DexService dexService = new DexService(dexRepository);
        DexServer dexserver = new DexServer(dexService);
    }
}
