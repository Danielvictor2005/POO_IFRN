public class Empregado {

  private String nome;
  private int horas;
  private double valorPorHoras;

  public Empregado(String nome, int horas, double valorPorHoras) {
    this.nome = nome;
    this.horas = horas;
    this.valorPorHoras = valorPorHoras;
  }

  public double pagamento() {
    return horas * valorPorHoras;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public double getValorPorHoras() {
    return valorPorHoras;
  }

  public void setValorPorHoras(double valorPorHoras) {
    this.valorPorHoras = valorPorHoras;
  }

}
