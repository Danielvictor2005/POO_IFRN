import java.util.Scanner;

public class HigherPosition {

    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        int higherNumber = Integer.MIN_VALUE;
        System.out.println(higherNumber);
        int higherIndex = 0;

        System.out.println("How many numbers will you type: ");
        int x = leitorX.nextInt();

        int arrayNumbers[] = new int[x];

        // ** Check
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Enter a number: ");
            arrayNumbers[i] = leitorX.nextInt();
        }

        // ! Bug
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] >= higherNumber) {
                higherNumber = arrayNumbers[i];
                higherIndex = i;
            }
        }

        // ? Bug fix
        System.out.printf("Higher value: %d\n", higherNumber);
        System.out.printf("Position of higher value: %d\n", higherIndex);

        leitorX.close();
    }
}