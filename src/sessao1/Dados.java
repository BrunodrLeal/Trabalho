package sessao1;

import java.util.Scanner;

public class Dados {
    
    private double salario;
    private String dataAdmissao;
    private boolean ativo;

    public Dados( double salario, String dataAdmissao, boolean ativo){
        
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.ativo = ativo;
        

    }
    public static Dados cadastroDados (Scanner sc,String cargo) {
        
        System.out.println("Digite o salário ref: "+ cargo); // Registra o salario
                    double salario =  sc.nextDouble();
                    sc.nextLine();// limpa o enter

                System.out.println("Data da admissão: "); // Registra a data de admição
                    String dataAdmissao = sc.nextLine();
            
                System.out.println(cargo + " Ativo: (s) ou (n)? ");// Registra se vendedor está ativo ou não, outras opções são inválidadas
                    String ativoFuncionario = sc.nextLine();
                
                boolean ativo = false; // variavel boleana para registro do if posterior.

                    if (ativoFuncionario.equalsIgnoreCase("s")) {
                        ativo = true; 
                
                    } else if (ativoFuncionario.equalsIgnoreCase("n")) {
                        ativo = false;
                
                    } else {
                        System.out.println("Opção inválida! ");
                    } 
        return new Dados(salario,dataAdmissao,ativo);
    }
    public double getSalario() { return salario; }
    public String getDataAdmissao() { return dataAdmissao; }
    public boolean getAtivo() { return ativo; }
}
