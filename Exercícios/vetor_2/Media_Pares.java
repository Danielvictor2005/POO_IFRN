import java.util.Scanner;

public class Media_Pares {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        int number = 0;
        double numbers[];
        double average_Pairs = 0.0;

        System.out.println("Amount elements you will have in the array: ");
        number = leitorX.nextInt();
        numbers = new double[number];

        for (int index = 0; index < number; index++) {

            System.out.println("Enter a number: ");
            numbers[index] = leitorX.nextDouble();

            if (numbers[index] % 2 == 0) {
                average_Pairs += numbers[index];
            }
        }

        if (average_Pairs == 0) {
            System.out.println("NO PAIR NUMBER");
        } else {
            System.out.printf("Pairs average: %.1f\n", average_Pairs / number);
        }

    }
}
