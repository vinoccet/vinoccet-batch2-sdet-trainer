package edu.in.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    // Runtime and compile time exception
    public static void main(String[] args) {
        int a = 10 / 0;
        FileReader reader = null;
        int[] b = {1, 2, 3};

        try {
            reader = new FileReader("");
            reader.read();
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
//            reader.close();
        }

    }
}
