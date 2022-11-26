import java.util.Scanner;

public class Conta extends Titular {

  private double valorDeposito = 0;
  private boolean contaAberta;

  Scanner leitor = new Scanner(System.in);

  public void abrirConta() {

    contaAberta = true;

    cadastroPessoal();

    System.out.println("Deseja inserir um depósito inicial? Digite 1 para aceitar");
    int resposta = leitor.nextInt();

    if (resposta == 1) {
      System.out.println("Valor inicial para depositar:");
      valorDeposito += leitor.nextDouble();
    }
    mostrarDados();
  }

  public void depositar() {
    if (contaAberta == true) {
      System.out.println("\nValor para depósito: ");
      valorDeposito += leitor.nextDouble();
      mostrarDados();
    } else {
      abrirConta();
    }
    repeticaoDeProcessos();
  }

  public void sacar() {
    if (contaAberta == true) {
      System.out.println("\nQuanto deseja retirar: ");
      double retirar = leitor.nextDouble();
      if (retirar <= valorDeposito) {
        valorDeposito -= retirar + 5;
        mostrarDados();
      } else {
        System.out.println("Sua conta tem pouco saldo!");
      }
    } else {
      System.out.println("Você ainda não tem uma conta...");
      abrirConta();
    }
    repeticaoDeProcessos();
  }

  private void repeticaoDeProcessos() {
    System.out.println("Deseja depositar ou sacar? (1-Depositar 2-Sacar ou 3-Encerrar)");
    int resposta = leitor.nextInt();

    while (resposta != 3) {
      if (resposta == 1) {
        depositar();
        return;
      } else {
        sacar();
        return;
      }
    }
    System.out.println("Encerrando o atendimento...");
    mostrarDados();
  }

  private void mostrarDados() {
    System.out.println("Dados da conta:");
    System.out.printf("Numero: %s, Nome: %s, Saldo: $ %.2f\n", obterNumConta(), obterNome(),
        valorDeposito);
    System.out.println("--------------------------------------------");

  }
}
