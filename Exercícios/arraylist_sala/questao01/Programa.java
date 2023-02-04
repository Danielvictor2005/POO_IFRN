import java.util.LinkedList;
import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {

    LinkedList<Aprovado> aprovados = new LinkedList<Aprovado>();
    Scanner leitorX = new Scanner(System.in);

    System.out.println("Digite a quantidade de pessoas: ");
    int numero = leitorX.nextInt();
    leitorX.nextLine();

    for (int i = 0; i < numero; i++) {
      System.out.printf("Digite o nome, nota1 e nota2 da %d pessoa\n", i+1);
      String nome = leitorX.nextLine();
      double nota1 = leitorX.nextDouble();
      double nota2 = leitorX.nextDouble();
      leitorX.nextLine();
      aprovados.add(new Aprovado(nome, nota1, nota2));
      
    }

    System.out.println("Alunos aprovados: ");
    for (Aprovado aprovado : aprovados) {
      if (aprovado.media() >= 6) {
        System.out.printf("%s\n",aprovado.getNome());
      }
    }
  }
}
