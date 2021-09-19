package hw2;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTasks {
    public static void main(String[] args) {

        //Task1: Sorting array in descending order
        System.out.println("\n---------------- Task1 --------------");
        //Variant1
        Integer[] arrayNums1 = {2, 3, 1, 7, 11};
        Arrays.sort(arrayNums1, Collections.reverseOrder());
        System.out.println("Var1. Sorting array in descending order: " + Arrays.toString(arrayNums1));

        //Variant2
        int[] arrayNums2 = {2, 3, 1, 7, 11};
        int buf;
        for (int i = 0; i < arrayNums2.length; i++) {
            for (int j = i + 1; j < arrayNums2.length; j++) {
                if (arrayNums2[i] < arrayNums2[j]) {
                    buf = arrayNums2[i];
                    arrayNums2[i] = arrayNums2[j];
                    arrayNums2[j] = buf;
                }
            }
        }
        System.out.println("Var2. Sorting array in descending order var2: ");
        for (int i : arrayNums2) {
            System.out.print(i + ", ");
        }

        //Task2: Sum of positive numbers
        System.out.println("\n\n---------------- Task2 --------------");
        int[] arrayTask2 = {-5, 6, 1, 3, -1};
        int sumPositive = 0;
        for (int i : arrayTask2) {
            if (i > 0) {
                sumPositive = sumPositive + i;
            }
        }
        System.out.println("Sum of positive numbers in the array: " + sumPositive);

        //Task3: An average number in the array
        System.out.println("\n---------------- Task3 --------------");
        //Var1
        int[] arrayTask3 = {4, 3, 1, 7, 6};
        double average = Arrays.stream(arrayTask3).average().getAsDouble();
        System.out.println("Var1. An average number in the array: " + average);

        //Var2
        int sumAvg = 0;
        for (int i : arrayTask3) {
            sumAvg = sumAvg + i;
        }
        double avg = (double) sumAvg / arrayTask3.length;
        System.out.println("Var2. An average number in the array: " + avg);

        //Task4: Replace duplicated values with 0
        System.out.println("\n---------------- Task4 --------------");
        int[] arrayDuplicates = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < arrayDuplicates.length; i++) {
            for (int j = i + 1; j < arrayDuplicates.length; j++) {
                if (arrayDuplicates[i] == arrayDuplicates[j]) {
                    arrayDuplicates[j] = 0;
                }
            }
        }
        System.out.println("Replace duplicated values with 0 in array: " + Arrays.toString(arrayDuplicates));

    }
}
