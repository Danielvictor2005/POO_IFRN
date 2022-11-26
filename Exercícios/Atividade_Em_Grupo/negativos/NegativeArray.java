package java_exercise.group_work.negative;

import java.util.Scanner;

public class NegativeArray {
  public static void main(String[] args) {

    // ** Array numbers size 10
    int[] numbers = new int[10];

    // ** Make Object of type Scanner
    Scanner leitorX = new Scanner(System.in);

    // ! First FOR adding values ​​to the array of numbers
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter a number: ");
      numbers[i] = leitorX.nextInt();
    }

    // ! Other FOR to show negatives values
    System.out.println("Negative numbers: ");

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < 1) {
        System.out.printf("%d\n", numbers[i]);
      }
    }
    leitorX.close(); // ! Close leitorX Scanner
  }
}
