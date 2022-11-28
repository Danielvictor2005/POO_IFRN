import java.util.Scanner;

public class Abaixo_Da_Media {
    public static void main(String[] args) {
        Scanner leitorX = new Scanner(System.in);
        double numbers[];
        double average = 0.0;
        int number = 0;

        System.out.println("Enter number amount for array: ");
        number = leitorX.nextInt();
        numbers = new double[number];

        for (int index = 0; index < number; index++) {
            System.out.println("Enter a number for array: ");
            numbers[index] = leitorX.nextDouble();
            average += numbers[index];
        }
        System.out.printf("\nAverage of array: %.3f", average / number);

        System.out.println("\nElements below of average: ");
        for (double element : numbers) {
            if (element < average / number) {
                System.out.printf("%.2f\n", element);
            }
        }
    }
}
