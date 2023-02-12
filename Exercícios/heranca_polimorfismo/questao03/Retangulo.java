public class Retangulo extends Forma {
  private double altura;
  private double comprimento;

  public Retangulo(double altura, double comprimento, String cor) {
    super(cor);
    this.altura = altura;
    this.comprimento = comprimento;
  }

  public double area(){
    return this.comprimento * altura;
  }
}
