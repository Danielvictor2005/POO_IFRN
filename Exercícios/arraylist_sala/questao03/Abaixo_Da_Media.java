import java.util.ArrayList;
import java.util.Scanner;

public class Abaixo_Da_Media {
  public static void main(String[] args) {
    ArrayList<Double> numeros = new ArrayList<Double>();
    Scanner leitorX = new Scanner(System.in);
    double media = 0.0;
    double soma = 0.0;

    System.out.println("Digite a quantidade de números: ");
    int quantidade = leitorX.nextInt();
    leitorX.nextLine();

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite um número: ");
      numeros.add(leitorX.nextDouble());
      soma += numeros.get(i); // Somar todos os numeros da lista
    }
    media = soma / numeros.size();

    System.out.printf("Media %.2f\n", media);

    System.out.println("Elementos abaixo da média: ");
    for (Double numero : numeros) {
      if (numero < media) {
        System.out.printf("%.2f", numero);
      }
    }
  }
}
