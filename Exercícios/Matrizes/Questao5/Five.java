public class Five {
  private static double matrizDouble[][];
  private static double maiorValor = 0;

  public static void setMatrizDouble(double[][] matrizDouble) {
    Five.matrizDouble = matrizDouble;
  }

  public static double getMaiorValor() {
    for (double[] linha : matrizDouble) {
      for (double valor : linha) {
        if (valor > maiorValor) {
          maiorValor = valor;
        }
      }
    }
    return maiorValor;
  }
}
