package sessao1;

import java.util.Scanner;

public class CadastroDesenvolvedor {
     
    private String linguagem;
    private boolean manutencao;

    public CadastroDesenvolvedor(String linguagem, boolean manutencao){
        this.linguagem = linguagem;
        this.manutencao = manutencao;
    }
    public static CadastroDesenvolvedor CadastroD (Scanner sc) {
        
        System.out.println("Linguagem de programação utilizada ?"); // registra qual linguagem de programação ele atuará
                String linguagem= sc.nextLine();
                
                System.out.println("Realizará manutenção?: (s) ou (n)? ");// Registra se desenvolvedor fará manutenções ou não
                String manutencaoAtiva = sc.nextLine();
                
                boolean manutencao = false;
                if (manutencaoAtiva.equalsIgnoreCase("s")) {
                    manutencao = true; 
                
                } else if (manutencaoAtiva.equalsIgnoreCase("n")) {
                    manutencao = false;
                
                } else {
                    System.out.println("Opção inválida! ");
                }
                return new CadastroDesenvolvedor(linguagem, manutencao);
    }
    public String getLinguagem() { return linguagem; }
    public boolean getManutencao() { return manutencao; }
}
