import java.util.Scanner;
import java.lang.Math;

public class One {
  private int qLinhas; // Linhas
  private int qColunas; // Colunas
  private int numero;
  private int matriz[][];

  Scanner leitorX = new Scanner(System.in);

  private void leituraDeDados() {
    System.out.println("Digite um número para linhas: ");
    qLinhas = leitorX.nextInt();

    System.out.println("Digite um número para colunas: ");
    qColunas = leitorX.nextInt();

    matriz = new int[qLinhas][qColunas];

    for (int linha = 0; linha < qLinhas; linha++) {
      for (int coluna = 0; coluna < qColunas; coluna++) {
        System.out.printf("Digite os valores para a linha %d e coluna %d da matriz: ", linha, coluna);
        matriz[linha][coluna] = leitorX.nextInt();
      }
    }
  }

  private void encontrarValor() {

    System.out.println("Digite para verficar se existe no array");
    numero = leitorX.nextInt();

    for (int linha = 0; linha < qLinhas; linha++) {
      for (int coluna = 0; coluna < qColunas; coluna++) {
        if (numero == matriz[linha][coluna]) {
          System.out.printf("\nPosição %d,%d \n", linha, coluna);

          if (coluna > 0 && coluna < qColunas) {
            System.out.printf("Esquerda: %d\n", matriz[linha][coluna - 1]);
          }

          if (coluna < qColunas - 1) {
            System.out.printf("Direita: %d\n", matriz[linha][coluna + 1]);
          }

          if (linha > 0) {
            System.out.printf("Acima: %d\n", matriz[linha - 1][coluna]);
          }

          if (linha < qLinhas - 1) {
            System.out.printf("Abaixo: %d\n", matriz[linha + 1][coluna]);
          }

        }
      }
    }
  }

  // TODO: Executar todos os métodos anteriores
  public void executarMetodos() {
    leituraDeDados();
    encontrarValor();
  }
}
