import java.util.ArrayList;
import java.util.Scanner;

public class Soma_Vetor {
  public static void main(String[] args) {

    ArrayList<Double> numeros = new ArrayList<Double>();
    Scanner leitorX = new Scanner(System.in);
    double soma = 0.0;
    double media = 0.0;

    System.out.println("Quantos números você vai digitar: ");
    double quantidade = leitorX.nextInt();

    // Entrada de dados para o array
    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite um número: ");
      numeros.add(leitorX.nextDouble());
      soma += numeros.get(i);
    }

    media = soma / numeros.size(); // Saber a media

    // Mostrar os números
    System.out.print("Valores: ");
    for (Double numero : numeros) {
      System.out.printf("%.2f ", numero);
    }
    System.out.println(); // Pular uam linha

    // Mostrar a soma e a média
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);

  }
}
