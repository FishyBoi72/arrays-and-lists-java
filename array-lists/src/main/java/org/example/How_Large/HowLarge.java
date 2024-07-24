package org.example.How_Large;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (enter nothing to stop the code) ");
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("The list has " + list.size() + " items");
                break;
            }
            list.add(input);
        }
        scanner.close();
    }
}
