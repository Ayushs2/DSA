package com.company;

import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        int posCount = 0;
        int negCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;
        int[] array = new int[z];
        for (int i = 0; i < z; i++) {
            array[i] = sc.nextInt();
            if (array[i] > 0) {
                posCount++;
            }
            if (array[i] < 0) {
                negCount++;
            }
            if (array[i] % 2 == 0) {
                evenCount++;
            }
            if (array[i] % 2 != 0) {
                oddCount++;
            }
            if (array[i] == 0) {
                zeroCount++;
            }
        }
            System.out.println("No of positives are: " + posCount);
            System.out.println("No of Negatives are: " + negCount);
            System.out.println("No of Even no are: " + evenCount);
            System.out.println("No of odd no are: " + oddCount);
            System.out.println("No of zeros  are: " + zeroCount);

    }
}
