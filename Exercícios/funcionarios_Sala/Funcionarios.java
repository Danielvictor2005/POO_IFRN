import java.util.Scanner;

public class Funcionarios {

  private int id;
  private String name;
  private double salario;
  private double taxa_aumento;
  // private int quantidade_funcionarios;

  Scanner leitorX = new Scanner(System.in);

  public int getId() {
    return id;
  }

  private void setId() {
    System.out.print("ID: ");
    id = leitorX.nextInt();
    leitorX.nextLine(); // ! Bug do Scanner de não ler o conteúdo seguinte
  }

  public String getName() {
    return name;
  }

  private void setName() {
    System.out.print("\nName: ");
    name = leitorX.nextLine();
  }

  public double getSalario() {
    return salario;
  }

  private void setSalario() {
    System.out.print("\nSalário: ");
    salario = leitorX.nextDouble();
  }

  public double getTaxa() {
    return taxa_aumento;
  }

  private void setTaxa() {
    System.out.println("Digite a taxa de aumento: ");
    taxa_aumento = leitorX.nextDouble();
  }

  public void aumento_Salario() {
    System.out.println("Digite o ID do funcionário para o aumento: ");
    if (leitorX.nextInt() == id) {
      setTaxa();
      salario = salario + (salario * taxa_aumento) / 100;
    } else {
      System.out.println("Não existe esse ID...");
    }
  }

  public void cadastrar_Funcionario() {
    setId();
    setName();
    setSalario();
  }

  public void mostrar_Dados() {
    System.out.printf("%d, %s, %.2f \n", getId(), getName(), getSalario());
  }

}
