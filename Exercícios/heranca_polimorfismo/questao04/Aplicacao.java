import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
  public static void main(String[] args) {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    Scanner leitorX = new Scanner(System.in);

    System.out.println("Quantas pessoas: ");
    int quantidade = leitorX.nextInt();
    leitorX.nextLine();

    for (int i = 0; i < quantidade; i++) {
      System.out.printf("Dados da pessoa %d\n", i + 1);
      System.out.println("Pessoa física ou jurídica: ");
      char tipo = leitorX.next().charAt(0);

      System.out.println("Nome: ");
      String nome = leitorX.nextLine();

      System.out.println("Renda anual: ");
      double rendaAnual = leitorX.nextDouble();

      if (tipo == 'f') {
        System.out.println("Quanto de gastos na saúde: ");
        double gastosSaude = leitorX.nextDouble();
        pessoas.add(newPessoaFisica(nome, rendaAnual, gastosSaude))
      }
      else{
        System.out.println("Número de empregados: ");
        int funcionarios = leitorX.nnextInt();
        pessoas.add(new PessoaJuridica(nome, rendaAnual, funcionarios))
      }
    }

    System.out.println("Taxas: ");
    for (Pessoa pessoa : pessoas) {
      System.out.printf("%s: R$ %.2f", pessoa.calcularImposto());
    }
  }
}
