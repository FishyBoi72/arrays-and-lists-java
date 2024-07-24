package org.example.Fifth_Item;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (enter nothing to stop the code) ");
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("The fifth item is " + list.get(4));
            }
            list.add(input);
        }
        scanner.close();
        }
    }