package org.example;

import java.util.Arrays;

public class VarargsExample {
    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static void findLargest(int... numbers){
        int largest = numbers[0];

        for (int i=1; i < numbers.length; i++){
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest in " + Arrays.toString(numbers) + " is " + largest);
    }
}
