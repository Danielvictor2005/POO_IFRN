import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

public class Programa {
  public static void main(String[] args) {
    LinkedList<Empregado> empregados = new LinkedList<Empregado>();

    empregados.add(new Empregado("Daniel", 100, 15));
    empregados.add(new Terceirizado("Victor", 100, 15, 200));

    System.out.println("Pagamentos:");
    for (Empregado empregado : empregados) {
      System.out.printf("%s %.2f\n", empregado.getNome(), empregado.pagamento());
    }
  }
}
