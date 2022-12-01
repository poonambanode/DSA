package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandleClass {

    public static void  main (String args[]) throws UserDefineException, IOException {

        int[] arr = new int[4];

        try {
            int i = arr[3];
            System.out.println("I want to execute: " + i);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            UserDefineException ue = new UserDefineException("Exception details");
            throw ue;
        }
        catch (UserDefineException e) {
            System.out.println(e);
        }

        try (BufferedReader br =
                     new BufferedReader(new FileReader(""))) {
        }
    }
}
