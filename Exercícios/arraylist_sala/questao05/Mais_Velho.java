import java.util.ArrayList;
import java.util.Scanner;

public class Mais_Velho {
  public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<String>();
    ArrayList<Integer> idades = new ArrayList<Integer>();
    Scanner leitorX = new Scanner(System.in);

    int idadeMaisVelha = Integer.MIN_VALUE;
    String pessoaMaisVelha = null;

    System.out.println("Quantas pessoas: ");
    int quantidade = leitorX.nextInt();
    leitorX.nextLine();

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite o nome e a idade: ");
      nomes.add(leitorX.nextLine());
      idades.add(leitorX.nextInt());
      leitorX.nextLine();

      if (idadeMaisVelha < idades.get(i)) {
        idadeMaisVelha = idades.get(i);
        pessoaMaisVelha = nomes.get(i);
      }
    }

    System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
  }
}
