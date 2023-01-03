import java.util.Arrays;
import java.util.Scanner;

public class Three {

  private double matrizDouble[][] = new double[2][5];
  Scanner leitorX = new Scanner(System.in);

  private void definirMatriz() {
    for (int i = 0; i < matrizDouble.length; i++) {
      for (int j = 0; j < matrizDouble[i].length; j++) {
        System.out.printf("\n Digite um valor para linha %d e coluna %d: ", i, j);
        matrizDouble[i][j] = leitorX.nextDouble();
      }
    }
  }

  public void mostrarMatriz() {
    definirMatriz();
    System.out.println("--------------- Matriz --------------- ");
    System.out.println(Arrays.deepToString(matrizDouble)); // Mostrar a matriz no formato String
  }
}
