
import java.util.Scanner;

public class PairNumber {

    Scanner leitorX = new Scanner(System.in);
    private int amountPairs = 0;
    private int numbersArray[];

    private void setValuesArray() {

        System.out.println("How many numbers will you type: ");
        int x = leitorX.nextInt();
        numbersArray = new int[x];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Enter a number: ");
            numbersArray[i] = leitorX.nextInt();
        }
    }

    private void showNumbersPairs() {

        System.out.println("PAIRS NUMBERS: ");

        for (int i = 0; i < numbersArray.length; i++) {

            if (numbersArray[i] % 2 == 0) {
                amountPairs++;
                System.out.printf("%d  ", numbersArray[i]);
            }
        }
        System.out.printf("Amount of pair numbers: %d", amountPairs);
    }

    public void runAll_Methods() {
        setValuesArray();
        showNumbersPairs();
    }
}
