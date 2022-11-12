import java.util.Scanner;
public class ProdutoArray {

  // BLOCO: 1 (DE INICIALIZAÇÃO DE VARIÁREIS E OBJETOS EXTERNOS)

  private String[] nomesArray;
  private double[] precosArray;

  private double totalValor;
  private int tamanhoArray;

  Scanner leitorX = new Scanner(System.in);

  // BLOCO: 2 (TODOS OS MÉTODOS)

  public void fazerCompras() {
    difinirTamanhoArray();
    inserirDados();
    calcularMedia();
  }

  // BLOCO: 3 (MÉTODOS ESPECIAIS COM CADA FUNÇÃO DO PROGRAMA)

  private void difinirTamanhoArray() {

    System.out.println("Difina um tamanho do array: ");
    tamanhoArray = leitorX.nextInt();

    nomesArray = new String[tamanhoArray];
    precosArray = new double[tamanhoArray];
  }

  private void inserirDados() {
    for (int x = 0; x < tamanhoArray; x++) {
      System.out.println("Insira o nome do produto e preço: ");
      nomesArray[x] = leitorX.next();
      precosArray[x] = leitorX.nextDouble();
    }
  }

  private void calcularMedia() {
    for (int x = 0; x < tamanhoArray; x++) {
      totalValor += precosArray[x];
    }
    System.out.println("Valor médio: " + totalValor / tamanhoArray);
  }
}
