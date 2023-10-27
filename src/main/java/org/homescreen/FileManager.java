package org.homescreen;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileManager {
    static String fileName = "transactions.csv";

    public static void readTransactionsFile() {
        try {
            new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    };
}
