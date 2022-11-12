package java_exercise.group_work;

import java.util.Scanner;
import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("How many numbers will you type");
        System.out.println("Enter a number: ");

        int sumNumbersArrays = 0;
        int number = leitor.nextInt();
        int[] numbersArray = new int[number];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Enter a number: ");
            numbersArray[i] = leitor.nextInt();
        }

        System.out.println("Valors of array:" + Arrays.toString(numbersArray));

        for (int i = 0; i < numbersArray.length; i++) {
            sumNumbersArrays += numbersArray[i];
            System.out.println("Soma = " + sumNumbersArrays);
            System.out.println("Average = " + sumNumbersArrays / numbersArray.length);
        }

        leitor.close();
    }
}