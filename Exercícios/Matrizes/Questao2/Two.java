import java.util.Random;
import java.util.Arrays;

public class Two {
  private static int matriz[] = new int[10];

  private static void setMatriz() {
    Random random = new Random();
    for (int i = 0; i < matriz.length; i++) {
      matriz[i] = random.nextInt(0, 99);
    }
  }

  public static void imprimir_Matriz() {
    setMatriz();
    System.out.println(Arrays.toString(matriz));
  }
}
