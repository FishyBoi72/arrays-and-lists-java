package org.example.Sum_Of_List;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter an integer (enter 0 to stop the code) ");
        int input = scanner.nextInt();

        while (input != 0) {
            list.add(input);
            input = scanner.nextInt();
        }
       int sum = 0;
        for(int number : list) {

            sum += number;
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print("and " + list.get(i));
            } else {
                System.out.print(list.get(i));
                if (i != list.size() -2) {
                    System.out.print(", ");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.print(" are your numbers. The sum is: " + sum);
    }
}

