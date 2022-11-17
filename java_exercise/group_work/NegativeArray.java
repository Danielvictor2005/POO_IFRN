package java_exercise.group_work;

import java.util.Scanner;

public class NegativeArray {
  public static void main(String[] args) {

    int[] numbers = new int[10];

    Scanner leitorX = new Scanner(System.in);

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter a number: ");
      numbers[i] = leitorX.nextInt();
    }

    System.out.println("Negative numbers: ");
    
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < 1) {
        System.out.printf("%d\n", numbers[i]);
      }
    }
    leitorX.close();
  }
}
