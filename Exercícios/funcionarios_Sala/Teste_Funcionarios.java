import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Teste_Funcionarios {
  public static void main(String[] args) {

    Funcionarios fun = new Funcionarios();
    Funcionarios fun2 = new Funcionarios();

    ArrayList<Funcionarios> lista_Funcionarios = new ArrayList<Funcionarios>();
    HashMap<Integer, Funcionarios> lista_Funcionarios2 = new HashMap<Integer, Funcionarios>();
    LinkedList<Funcionarios> lista_Funcionarios3 = new LinkedList<Funcionarios>();

    // TODO: ArrayList
    // ArrayList é mais indicada para obter um objeto
    lista_Funcionarios.add(fun);
    lista_Funcionarios.add(fun2);

    // TODO: HashMap
    // É baseada em tabela empilhada, necessário uma chave ID e valor (null)
    fun.cadastrar_Funcionario();

    lista_Funcionarios2.put(10, fun);
    lista_Funcionarios2.put(20, fun2);

    // TODO: LinkedList
    // É serve mais para inserção e exclusão de dados ou objeto, por ele ser em
    // sequência.
    lista_Funcionarios3.add(fun);

    System.out.println(lista_Funcionarios2.get(10).getName());
    // for (int i = 0; i < lista_Funcionarios.size(); i++) {
    // lista_Funcionarios.get(i).cadastrar_Funcionario();
    // }

    // for (int i = 0; i < lista_Funcionarios.size(); i++) {
    // System.out.println(lista_Funcionarios.get(i).getId());
    // System.out.println(lista_Funcionarios.get(i).getName());
    // System.out.println(lista_Funcionarios.get(i).getSalario());

    // }

  }
}
