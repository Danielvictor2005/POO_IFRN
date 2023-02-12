public class PessoaJuridica extends Pessoa {
  private int funcionarios;

  public PessoaJuridica(String nome, double rendaAnual, int funcionarios) {
    super(nome, rendaAnual);
    this.funcionarios = funcionarios;
  }

  public double calcularImposto() {
    if (funcionarios < 10) {
      return this.getRendaAnual() * 0.16;
    } else {
      return this.getRendaAnual() * 0.14;
    }
  }

  public int getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(int funcionarios) {
    this.funcionarios = funcionarios;
  }

}
