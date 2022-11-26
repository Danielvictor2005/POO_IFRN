package java_exercise.group_work.sum;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        Scanner leitorX = new Scanner(System.in);

        double averageOfArray = 0;
        System.out.println("How many numbers will you type");
        double[] numbersArray = new double[leitorX.nextInt()];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Enter a number: ");
            numbersArray[i] = leitorX.nextDouble();
        }

        for (int i = 0; i < numbersArray.length; i++) {
            averageOfArray += numbersArray[i];
        }

        // ! Armazenar a media na variável antes de continuar
        // * Vou terminar o código

        System.out.println("Average = " + averageOfArray / numbersArray.length);

        System.out.println("Elements below the media: ");
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] < (averageOfArray / numbersArray.length)) {
                System.out.printf("%.2f \n", numbersArray[i]);
            }
        }

        leitorX.close();
    }
}
