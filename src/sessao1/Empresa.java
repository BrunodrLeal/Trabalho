package sessao1;


import java.util.ArrayList;
import java.util.Scanner;
public class Empresa {

    public static void main(String[] args) {
        
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        while(loop){
            System.out.println("\n======= Menu Mattos Calçados ===== ");
            System.out.println("1 - Adicionar Funcionario");
            System.out.println("2 - Remover Funcionario");
            System.out.println("3 - Buscar Funcionario");
            System.out.println("4 - Listar Funcionario");
            System.out.println("5 - Calcular Folha");
            System.out.println("6 - SAIR");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                adicionarFuncionario(sc,funcionarios);    
                    break;
                
                    case 2:
                removerFuncionario(sc,funcionarios);    
                    break;
                
                    case 3:
                buscarFuncionario(sc,funcionarios);    
                    break;
                
                    case 4:
                listarFuncionario(funcionarios);    
                    break;
                
                    case 5:
                calcularFolhaSalarial(funcionarios);   
                    break;
                
                    case 6:
                System.out.println("Saindo");   
                loop = false;
            
                default:
                System.out.println("Opção inválida.");
                    break;
            }
        }
    }

public static void adicionarFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios){
    
    System.out.println("Digite o nome completo:");
        String nome =  sc.nextLine();

    System.out.println("Digite o cpf completo:");
        String cpf =  sc.nextLine();

    System.out.println("Digite o salário base. ref: Gerente = R$ 5000, Vendendor = R$ 3500, Desenvolvedor R$ 4200:");
        
        int salarioBase =  sc.nextInt();
        sc.nextLine();// limpa o enter

    // após o cadastro se inicia o ArrayList
    Funcionario novoFuncionario = null;

    if(salarioBase == 5000){
        
        novoFuncionario = new Gerente(nome,cpf,salarioBase);

        System.out.println("Gerente cadastrado.");
    } 
    else if (salarioBase == 3500) {
        
        double valorVendas = 0;
        
        double percentualComissao = 0;

        novoFuncionario = new Vendedor(nome, cpf, salarioBase,valorVendas,percentualComissao);

        System.out.println("Vendedor cadastrado.");
    } 
    else if (salarioBase == 4200){

        novoFuncionario = new Desenvolvedor(nome, cpf, salarioBase);
        
        System.out.println("Desenvolvedor cadastrado.");
    }
    else {

        System.out.println("Salário inválido! Funcionário não categorizado.");
    }

    // adicionado ao Array
    funcionarios.add(novoFuncionario);
    
}
public static void removerFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios){
    
    System.out.println("Digite o nome do funcionario? ");
        String nomeFuncionario = sc.nextLine();

    Funcionario funcionarioParaRemover = null;

    for (Funcionario f : funcionarios) {
    // 1 Pegando o nome do funcionário e usando equalsIgnoreCase
        if (f.getNome().equalsIgnoreCase(nomeFuncionario)) { 
            System.out.println("Nome encontrado: " + f.getNome());
            funcionarioParaRemover = f; // Guarda o objeto encontrado
            break; // Para o laço imediatamente
    }
    // 2. Corrigido: Remove fora do laço for-each para não dar erro no Java
    if (funcionarioParaRemover != null) {
    
        funcionarios.remove(funcionarioParaRemover); // Remove o objeto Funcionario
        System.out.println("Funcionario removido com sucesso.");
    } else {
        System.out.println("Funcionario nao encontrado.");
    }
}
    
}
public static void buscarFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios){
    
    System.out.println("Digite o nome do funcionario? ");
    String nomeFuncionario = sc.nextLine();

    for (Funcionario f : funcionarios) {
        if (f.getNome().equalsIgnoreCase(nomeFuncionario)) { 
            System.out.println("Funcionário encontrado: "+ f.getNome() + " cpf: " + f.getCpf());

        break; // Para o laço imediatamente
        } 
        else{
            System.out.println("Funcionário não encontrado.");
        }
    }
}
public static void listarFuncionario(ArrayList<Funcionario> funcionarios){
    
    if (funcionarios == null || funcionarios.isEmpty()) {
        System.out.println("Nenhum funcionário cadastrado.");
        return;
    }

    for(Funcionario f : funcionarios) {
        System.out.println(f);
    }   
}
public static void calcularFolhaSalarial(ArrayList<Funcionario> funcionarios){
    
    double totalFolha = 0.0;
    
    System.out.println("Sergue a lista de funcionarios e seus salarios.");
    
    for(Funcionario f : funcionarios) {
    System.out.println(f.getNome() + ": R$ " + f.getSalarioBase());
        
    // Somando o salário atual ao total
    totalFolha += f.getSalarioBase();
    }
    }   
}



