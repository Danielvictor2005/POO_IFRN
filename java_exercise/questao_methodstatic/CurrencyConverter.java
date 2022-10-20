import java.util.Scanner;
import javax.swing.JOptionPane;

public class CurrencyConverter {
  private static double dollarPrice;
  private static double dollarQuantidade;
  private static double totalReais;

  public static void readPriceDollar() {

    Scanner leitorX = new Scanner(System.in);

    // Pegar a cotação do dólar
    System.out.print("Qual a cotação do dólar: ");
    dollarPrice = leitorX.nextDouble();

    // Pegar a quantidade em dólar
    System.out.println("Quantidade em dólares: ");
    dollarQuantidade = leitorX.nextDouble();

    // Calcular o IOF no total
    totalReais = dollarQuantidade * dollarPrice * 1.06;
    System.out.println("Quantidade para reais: " + totalReais);

    leitorX.close();
  }
}
