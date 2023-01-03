public class Seven {
  private static int matrizInteiros[][];
  private static int soma;

  public static void setMatrizInteiro(int[][] matrizInteiros) {
    Seven.matrizInteiros = matrizInteiros;
  }

  public static int somaMatrizInteiros() {
    for (int linha[] : matrizInteiros) {
      for (int valor : linha) {
        soma += valor;
      }
    }
    return soma;
  }

}
