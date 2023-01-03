public class Aplicacao {
  public static void main(String[] args) {
    double matriz[][] = { { 23, 32, 3, 2 }, { 22, 3, 35, 2 }, { 23, 34, 5, 1 } };
    Four teste = new Four();

    teste.setMatriz(matriz);
    System.out.println(teste.getLinhasMatriz());
    System.out.println(teste.getColunasMatriz());

    System.out.println(teste.imprimir());
  }
}
