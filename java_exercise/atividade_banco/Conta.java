import java.util.Scanner;

public class Conta {

  private final String[] afirmativos = { "y", "yes", "sim" };
  private double valorDeposito = 0;
  private boolean contaAberta;

  Titular titular = new Titular();
  Scanner leitorX = new Scanner(System.in);

  public void abrirConta() {

    contaAberta = true;

    if (titular.obterNome() == null) {
      titular.inserirNome();
    }
    if (titular.obterNumConta() == 0) {
      titular.inserirNumConta();
    }

    System.out.println("Deseja inserir um depósito inicial?");
    String resposta = leitorX.next();

    for (String nome : afirmativos) {
      if (nome.equals(resposta)) {
        System.out.println("Valor inicial para depositar:");
        valorDeposito += leitorX.nextDouble();
        return;
      }
    }
    mostrarDados();

  }

  public void depositar() {
    if (contaAberta == true) {
      System.out.println("\nValor para depósito: ");
      valorDeposito += leitorX.nextDouble();
      mostrarDados();
    } else {
      abrirConta();
    }
    repetirProcesso();
  }

  public void sacar() {
    if (contaAberta == true) {
      System.out.println("\nQuanto deseja retirar: ");
      double retirar = leitorX.nextDouble();
      if (retirar <= valorDeposito) {
        valorDeposito -= retirar + 5;
        mostrarDados();
      } else {
        System.out.println("Sua conta tem pouco saldo!");
      }
    } else {
      abrirConta();
    }
    repetirProcesso();
  }

  private void repetirProcesso() {
    System.out.println("Deseja depositar ou sacar? (1-Depositar 2-Sacar ou 3-Encerrar)");
    int resposta = leitorX.nextInt();

    while (resposta != 3) {
      if (resposta == 1) {
        depositar();
        return;
      } else if (resposta == 2) {
        sacar();
        return;
      }
    }
    System.out.println("Encerrando o atendimento...");
    mostrarDados();
  }

  private void mostrarDados() {
    System.out.println("Dados da conta:");
    System.out.printf("Numero: %s, Nome: %s, Saldo: $ %.2f\n", titular.obterNumConta(), titular.obterNome(),
        valorDeposito);
    System.out.println("--------------------------------------------");
  }
}
