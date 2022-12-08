import java.util.ArrayList;

public class Teste_Funcionarios {
    public static void main(String[] args) {

        Funcionarios fun = new Funcionarios();
        ArrayList<Funcionarios> lista_Funcionarios = new ArrayList<>();

        fun.cadastrar_Funcionario();
        System.out.println(fun.getSalario());
        lista_Funcionarios.add(fun);

    }
}
