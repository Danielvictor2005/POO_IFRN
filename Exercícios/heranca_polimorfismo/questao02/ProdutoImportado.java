public class ProdutoImportado extends Produto {
  private double taxa;

  public ProdutoImportado(String nome, double preco, double taxa) {
    super(nome, preco);
    this.taxa = taxa;
  }

  public double precoProduto() {
    return super.precoProduto() + getTaxa();
  }

  public double getTaxa() {
    return taxa;
  }

  public void setTaxa(double taxa) {
    this.taxa = taxa;
  }

}
