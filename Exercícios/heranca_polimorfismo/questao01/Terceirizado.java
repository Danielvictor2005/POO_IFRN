public class Terceirizado extends Empregado {

  private double valorAdicional;

  public Terceirizado(String nome, int horas, double valorPorHoras, double valorAdicional) {
    super(nome, horas, valorPorHoras);
    this.valorAdicional = valorAdicional;
  }

  public double pagamento() {
    return super.pagamento() + getValorAdicional();
  }

  public double getValorAdicional() {
    return valorAdicional * 0.10;
  }

  public void setValorAdicional(double valorAdicional) {
    this.valorAdicional = valorAdicional;
  }

}
