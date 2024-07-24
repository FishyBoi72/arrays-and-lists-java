package org.example.Last_Item;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (enter nothing to stop the code) ");
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("The last item in the list is... " + list.get(list.size() - 1));
                break;
            }
            list.add(input);
        }
        scanner.close();
    }
}
