package sessao1;

import java.util.Scanner;

public class CadastroGerente {
    
    private boolean contratar;
    private boolean demitir;

    public CadastroGerente(boolean contratar, boolean demitir){

        this.contratar = contratar;
        this.demitir = demitir;
    }
    public static CadastroGerente CadastroG(Scanner sc){
        
        System.out.println("Poderá contratar: (s) ou (n)? "); // Registra se o Gerente deve contratar ou não.
                String contrata = sc.nextLine();
            
                boolean contratar = false; // variavel boleana para registro do if posterior.

                if (contrata.equalsIgnoreCase("s")) {
                    contratar = true;
                
                } else if(contrata.equalsIgnoreCase("n")) {
                    contratar = false;
                
                } else {
                    System.out.println("Opção inválida! ");
                }

        System.out.println("Poderá Demitir: (s) ou (n)? "); // Registra se o Gerente deve demitir ou não.
            String demite = sc.nextLine();

            boolean demitir = false; // variavel boleana para registro do if posterior.

            if (demite.equalsIgnoreCase("s")) {
                demitir = true;
                
            } else if(demite.equalsIgnoreCase("n")) {
                demitir = false;
                
            } else {
                System.out.println("Opção inválida!");
            }
            return new CadastroGerente(contratar, demitir);
    } 

    public boolean getContratar() { return contratar; }
    public boolean getDemitir() { return demitir; }
}  
