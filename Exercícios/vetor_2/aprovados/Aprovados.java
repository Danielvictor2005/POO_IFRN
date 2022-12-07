import java.util.Scanner;

public class Aprovados {

    Scanner leitorX = new Scanner(System.in);
    private String alunos[];
    private double seg_Semestere[];
    private double pri_Semestre[];
    private int num_Alunos;

    public void executar_Metodos() {
        set_Quantidade_Alunos();
        set_Notas_Alunos();
        mostrar_Dados();
    }

    private void set_Quantidade_Alunos() {

        System.out.println("Quantos alunos serão digitados: ");
        num_Alunos = leitorX.nextInt();
        alunos = new String[num_Alunos];
        pri_Semestre = new double[num_Alunos];
        seg_Semestere = new double[num_Alunos];

    }

    private void set_Notas_Alunos() {

        for (int element = 0; element < num_Alunos; element++) {
            System.out.println("Digite a nota 1 e nota 2 e nome: ");
            leitorX.nextLine();
            alunos[element] = leitorX.nextLine();
            pri_Semestre[element] = leitorX.nextDouble();
            seg_Semestere[element] = leitorX.nextDouble();
        }
    }

    private void mostrar_Dados() {
        System.out.println("Alunos aprovados: ");

        for (int element = 0; element < num_Alunos; element++) {
            if (pri_Semestre[element] + seg_Semestere[element] / 2 >= 6) {
                System.out.printf("%s\n", alunos[element]);
            }
        }

    }

}