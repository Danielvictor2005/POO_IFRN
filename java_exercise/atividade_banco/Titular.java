import java.util.Scanner;

public class Titular {
  Scanner leitorX = new Scanner(System.in);

  private String titularNome;
  private int numeroConta;

  public void cadastroPessoal() {
    inserirNome();
    inserirNumConta();
  }

  private void inserirNome() {
    System.out.println("Inserir o nome do titular da conta");
    titularNome = leitorX.next();
  }

  public String obterNome() {
    return titularNome;
  }

  private void inserirNumConta() {
    System.out.println("Inserir o número da conta");
    numeroConta = leitorX.nextInt();
  }

  public int obterNumConta() {
    return numeroConta;
  }

}
