import java.util.Scanner;
import java.lang.Math;

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
        depositar();
        return;
      }
    }
    mostrarDados();

  }

  public void depositar() {
    if (contaAberta == true) {
      System.out.println("\nValor para depósito: ");
      valorDeposito += leitorX.nextDouble();
    } else {
      abrirConta();
    }
  }

  public void sacar() {
    if (contaAberta == true) {
      System.out.println("\nQuanto deseja retirar: ");
      double retirar = leitorX.nextDouble();
      if (retirar <= valorDeposito) {
        valorDeposito -= retirar + 5;
      } else {
        System.out.println("Sua conta tem pouco saldo!");
      }
    } else {
      abrirConta();
    }
  }

  private void mostrarDados() {
    System.out.println("Dados da conta:");
    System.out.printf("Numero: %s, Nome: %s, Saldo: $ %.2f\n", titular.obterNumConta(), titular.obterNome(),
        valorDeposito);
  }
}
