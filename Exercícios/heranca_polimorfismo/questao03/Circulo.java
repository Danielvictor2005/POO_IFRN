import java.lang.Math;

public class Circulo extends Forma {
  private double radio;

  public Circulo(double radio, String cor) {
    super(cor);
    this.radio = radio;
  }

  public double area() {
    return Math.round((Math.PI * (Math.pow(radio, 2))));
  }

}
