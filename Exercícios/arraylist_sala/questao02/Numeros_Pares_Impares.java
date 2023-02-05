import java.util.ArrayList;
import java.util.Scanner;

public class Numeros_Pares_Impares {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    Scanner leitorX = new Scanner(System.in);
    int pares = 0;
    int impares = 0;

    System.out.println("Quantos números para digitar: ");
    int quantidade = leitorX.nextInt();
    leitorX.nextLine();

    for (int i = 0; i < quantidade; i++) {
      System.out.printf("Digite o número %d \n", i + 1);
      numeros.add(leitorX.nextInt());
    }

    for (Integer numero : numeros) {
      if (numero % 2 == 0) {
        pares++;
      } else {
        impares++;
      }

    }

    // Mostrar resultados
    System.out.println("Numero pares: ");
    System.out.printf("%d\n", pares);

    System.out.println("Numero immpares: ");
    System.out.printf("%d\n", impares);
  }
}
