package sessao1;

import java.util.Scanner;

public class DadosBasicos  {
    
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public DadosBasicos (String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    public static DadosBasicos cadastroBasico(Scanner sc){
        System.out.println("Digite o nome completo: "); // registra o nome
            String nome =  sc.nextLine();
       
        System.out.println("Digite o cpf completo: "); // registra o cpf 
            String cpf =  sc.nextLine();
    
        System.out.println("Digite o telefone completo: "); // registra o telefone
            String telefone =  sc.nextLine();
    
        System.out.println("Digite o email completo: "); // registra o email
            String email =  sc.nextLine();

        return new DadosBasicos(nome, cpf, telefone, email);
    }


    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    
}

