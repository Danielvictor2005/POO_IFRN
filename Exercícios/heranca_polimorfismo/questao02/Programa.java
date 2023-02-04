import java.util.LinkedList;
import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    LinkedList<Produto> produtos = new LinkedList<Produto>();
    Scanner leitorX = new Scanner(System.in);

    System.out.println("Digite a quantidade de produtos: ");
    int qtdeProdutos = leitorX.nextInt();
    leitorX.nextLine();

    for (int i = 0; i < qtdeProdutos; i++) {
      System.out.printf("Dados do produto %d", i++);
      System.out.println("Comum-1, Usado-2 ou Importado-3: ");
      int numero = leitorX.nextInt();
      leitorX.nextLine();

      System.out.println("Nome: ");
      String nome = leitorX.nextLine();

      System.out.println("Preço: ");
      double preco = leitorX.nextDouble();

      if (numero == 1) {

        System.out.println("A taxa de alfândega: ");
        double taxa = leitorX.nextDouble();
        produtos.add(new ProdutoImportado(nome, preco, taxa));

      } else if (numero == 2) {

        System.out.println("Data de fabricação (DD/MM/YYYY): ");
        String data = leitorX.nextLine();
        produtos.add(new ProdutoUsado(nome, preco, data));

      } else if (numero == 3) {
        produtos.add(new Produto(nome, preco));

      } else {

        System.out.println("Nenhum das opções...");
        System.out.println("Comum-1, Usado-2 ou Importado-3: ");
        numero = leitorX.nextInt();
        leitorX.nextLine();
      }

    }

    System.out.println("Preços de cada produto: ");
    for (Produto produto : produtos) {
      if (produto instanceof ProdutoImportado) {
        System.out.printf("%s %.2f (Taxa alfândega: $ %.2f)", produto.getNome(), produto.precoProduto(),
            produto.getTaxa());

      }
    }
  }
}
