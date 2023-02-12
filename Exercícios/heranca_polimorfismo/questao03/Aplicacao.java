import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
  public static void main(String[] args) {
    ArrayList<Forma> formas = new ArrayList<Forma>();
    Scanner leitorX = new Scanner(System.in);

    System.out.println("Digite a quantidade de formas: ");
    int quantidade = leitorX.nextInt();
    leitorX.nextLine();

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Retângulo ou Círculo: (1 ou 0)");
      int numeroForma = leitorX.nextInt();
      leitorX.nextLine();

      System.out.println("Cor da forma: ");
      String nomeCor = leitorX.nextLine();

      if (numeroForma == 1) {
        System.out.println("Comprimento: ");
        double comprimento = leitorX.nextDouble();

        System.out.println("Largura: ");
        double altura = leitorX.nextDouble();

        formas.add(new Retangulo(altura, comprimento, nomeCor));

      } else {
        System.out.println("Raio: ");
        double raio = leitorX.nextDouble();

        formas.add(new Circulo(raio, nomeCor));
      }
    }

    System.out.println("Áreas das formas: ");

    for (Forma forma : formas) {
      System.out.println(forma.area());
    }

  }
}
