package sessao1;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarFuncionario {
    
    private int id;

    public BuscarFuncionario (int id) {
        this.id = id;
    }

    public static Funcionario Consulta(
        Scanner sc,
        ArrayList<Funcionario> funcionarios) {

    System.out.println("Digite o id do Funcionario:");
    int id = sc.nextInt();
    sc.nextLine();

    for (Funcionario f : funcionarios) {

        if (f.getId() == id) {
            System.out.println(
                "Funcionário encontrado: "
                + f.getNome()
                + " CPF: "
                + f.getCpf()
            );

            return f;
        }
    }

    return null;
    }
}