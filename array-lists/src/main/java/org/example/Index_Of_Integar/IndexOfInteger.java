package org.example.Index_Of_Integar;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter an integer (enter 0 to stop the code) ");
        int input = scanner.nextInt();


        while (input != 0) {
            list.add(input);
            input = scanner.nextInt();
            }


        System.out.println("Enter the integer you would like to find: ");
        int target = scanner.nextInt();

        for(Integer fish : list) {
            if (fish == target) {
                int index = list.indexOf(target);
                System.out.println("The index of " + target + " is " + index);
                list.set(index, 0);
            }
        }
        scanner.close();
    }
}

