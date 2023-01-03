public class Aplicacao {
  public static void main(String[] args) {

    double matrizTeste[][] = {{23,32,32}, {32,32,51}, {3,2,5}};


    Five.setMatrizDouble(matrizTeste);
    System.out.println("O maior valor: " + Five.getMaiorValor());
  }
}
