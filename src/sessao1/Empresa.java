package sessao1;


import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    private static int proximoId = 1;
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
                break;
            
                default:
                    System.out.println("Opção inválida.");
                break;
            }
        }
    }

public static void adicionarFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios){
    
    int id = proximoId++;
    
    System.out.println("Digite o nome completo:");
        String nome =  sc.nextLine();
    
    System.out.println("Digite o cpf completo:");
        String cpf =  sc.nextLine();
    
    System.out.println("Digite o telefone completo:");
        String telefone =  sc.nextLine();
    
    System.out.println("Digite o email completo:");
        String email =  sc.nextLine();
    
    System.out.println("Digite o cargo:");
    System.out.println("Opções:");
    System.out.println(" Gerente, Desenvolvedor, Vendedor:");
    
    String cargo =  sc.nextLine();
        
        Funcionario novoFuncionario = null;

        if(cargo.equalsIgnoreCase("Gerente")){
            System.out.println("Digite o salário ref: Gerente");
                double salario =  sc.nextDouble();
                sc.nextLine();// limpa o enter
                
            System.out.println("Data da admição:");
                String dataAdmicao = sc.nextLine();
                
            boolean ativo = true;
            boolean gerenciar = true;
            boolean contratar = true;
            boolean demitir = true;

            novoFuncionario = new Gerente(id,nome,cpf,telefone,email,cargo,salario, dataAdmicao,ativo,gerenciar,contratar, demitir);
            System.out.println("Gerente cadastrado");    

        } 
        else if(cargo.equalsIgnoreCase("Desenvolvedor")){

            System.out.println("Digite o salário ref: Desenvolvedor");
                    double salario =  sc.nextDouble();
                    sc.nextLine();// limpa o enter
                
                System.out.println("Data da admição:");
                    String dataAdmicao = sc.nextLine();
                
                boolean ativo = true;
                boolean desenvolver = true;
                boolean manutencao = true;

                novoFuncionario = new Desenvolvedor(id,nome,cpf,telefone,email,cargo,salario, dataAdmicao,ativo,desenvolver,manutencao);
        } 
        else if (cargo.equalsIgnoreCase("Vendedor")) {
        
        double valorVendas = 0;
        
        double percentualComissao = 0;

        novoFuncionario = new Vendedor(nome, cpf, salario,valorVendas,percentualComissao);

        System.out.println("Vendedor cadastrado.");
        } 
        else {
        System.out.println("Cargo inválido. tente novamente");
        return;
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
    System.out.println(f.getNome() + ": R$ " + f.getSalario());
        
    // Somando o salário atual ao total
    totalFolha += f.getSalario();
    }
    }   
}



