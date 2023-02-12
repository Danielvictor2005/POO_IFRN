public class PessoaFisica extends Pessoa {
  private double gastosSaude;

  public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
    super(nome, rendaAnual);
    this.gastosSaude = gastosSaude;
  }

  public double calcularImposto() {
    if (this.getRendaAnual() < 20000) {
      return this.getRendaAnual() * 0.15 - (this.gastosSaude * 0.50);
    } else {
      return this.getRendaAnual() * 0.25 - (this.gastosSaude * 0.50);
    }
  }

  public double getGastosSaude() {
    return gastosSaude;
  }

  public void setGastosSaude(double gastosSaude) {
    this.gastosSaude = gastosSaude;
  }

}
