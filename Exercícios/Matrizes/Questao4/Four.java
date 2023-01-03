import java.util.Arrays;

public class Four {
  private double matrizOriginal[][];
  private int quantidadeLinhas;
  private int quantidadeColunas;

  // NOTE: Construtores
  public Four() {

  }

  public Four(double[][] matrizBi) {
    matrizOriginal = matrizBi;
  }

  // NOTE: Métodos especiais
  public void setMatriz(double[][] matrizBi) {
    matrizOriginal = matrizBi;
  }

  public int getLinhasMatriz() {
    for (int i = 0; i < matrizOriginal.length; i++) {
      quantidadeLinhas++;
    }
    return quantidadeLinhas;
  }

  public int getColunasMatriz() {
    for (int i = 0; i < matrizOriginal.length; i++) {
      for (int j = 0; j < matrizOriginal[i].length; j++) {
        quantidadeColunas++;
      }
    }
    return quantidadeColunas;
  }

  public String imprimir() {
    return Arrays.deepToString(matrizOriginal);
    
  }
}
