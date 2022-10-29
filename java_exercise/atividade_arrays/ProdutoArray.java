import java.util.Scanner;

public class ProdutoArray {

  private String[] produtosNomes;
  private double[] precosProdutos;

  private double totalValor;
  private int tamanhoArray;

  Scanner leitorX = new Scanner(System.in);

  public void fazerCompras() {
    difinirTamanhoArray();
    inserirDados();
    valorTota();
  }

  private int difinirTamanhoArray() {

    System.out.println("Difina um tamanho do array: ");
    tamanhoArray = leitorX.nextInt();

    produtosNomes = new String[tamanhoArray];
    precosProdutos = new double[tamanhoArray];

    return tamanhoArray;
  }

  private void inserirDados() {

    if (tamanhoArray != 0) {
      for (int x = 0; x < tamanhoArray; x++) {
        System.out.println("Insira o nome do produto e preço: ");
        produtosNomes[x] = leitorX.next();
        precosProdutos[x] = leitorX.nextDouble();
      }
    } else {
      difinirTamanhoArray();
    }
  }

  private void valorTota() {
    for (int x = 0; x < tamanhoArray; x++) {
      totalValor += precosProdutos[x];
    }
    System.out.println("Valor total: " + totalValor);
  }
}
