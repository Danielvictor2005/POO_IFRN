
public class Principal {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.titular.inserirNome();
    c1.sacar();
    c1.titular.inserirNumConta();
  }
}
