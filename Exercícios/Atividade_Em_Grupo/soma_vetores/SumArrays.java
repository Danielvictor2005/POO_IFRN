import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner leitorX = new Scanner(System.in);

        System.out.println("How many values will each array have? ");
        int numValues = leitorX.nextInt();

        // ** Objects of array type
        int arrayA[] = new int[numValues];
        int arrayB[] = new int[numValues];
        int arrayC[] = new int[numValues];

        // ** ARRAY A
        System.out.println("\nEnter values of array A: ");
        for (int element = 0; element < numValues; element++) {
            arrayA[element] = leitorX.nextInt();
        }

        // ** ARRAY B
        System.out.println("\nEnter values of array B: ");
        for (int element = 0; element < numValues; element++) {
            arrayB[element] = leitorX.nextInt();
        }

        // ** Sum of values
        for (int element = 0; element < numValues; element++) {
            arrayC[element] = arrayA[element] + arrayB[element];
        }

        // ** Resulting of sum array
        System.out.println("\nResulting array: ");
        for (int element : arrayC) {
            System.out.printf("%d\n", element);
        }
        leitorX.close(); // ! Object Scanner EXIT
    }
}
