package sessao1;

import java.util.ArrayList;
import java.util.Scanner;
public class Empresa {
    
    private static int proximoId = 1;  // Atributo static para referencia no AdicionarFuncionario.
    public static void main(String[] args) {
        
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        while(loop) {
            System.out.println("\n======= Menu Mattos Calçados =====  ");
            System.out.println("1 - Adicionar Funcionari o");
            System.out.println("2 - Remover Funcionario ");
            System.out.println("3 - Buscar Funcionario ");
            System.out.println("4 - Listar Funcionario ");
            System.out.println("5 - Calcular Folha ");
            System.out.println("6 - SAIR ");
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
                System.out.println("Saindo  ");   
                    loop = false;
                break;
            
                default:
                    System.out.println("Opção inválida. ");
                break;
            }
        }
    }

public static void adicionarFuncionario (Scanner sc, ArrayList<Funcionario> funcionarios) { // metodo de cadastro completo do Funcionario independente do Tipo.
    
    int id = proximoId++; // adiciona o id para o funcionario
    Funcionario novoFuncionario = null; // Objeto Null para referencia.

     DadosBasicos dadosB = DadosBasicos.cadastroBasico(sc); // dados Basicos 

    System.out.println("Digite o cargo, opções: Gerente, Desenvolvedor ou Vendedor? ");
        
    String cargo =  sc.nextLine(); // pega o cargo definido acima, fora desses está incorreto.
        
        if (cargo.equalsIgnoreCase("Gerente")) { // opção Gerente.
            
            Dados ativo = Dados.cadastroDados(sc, cargo);            
            
            CadastroGerente funcao = CadastroGerente.CadastroG(sc);

            novoFuncionario = new Gerente(id, dadosB.getNome(), dadosB.getCpf(), 
                    dadosB.getTelefone(),dadosB.getEmail(), cargo, 
                    ativo.getSalario(), ativo.getDataAdmissao(), ativo.getAtivo(), 
                    funcao.getContratar(), funcao.getDemitir()); // Criação do objeto com todas as informações

            System.out.println("Gerente cadastrado com sucesso, seja bem vindo a Mattos Calçados! ");  //informa o fim do cadastro completo do Gerente.  
            
        } else if (cargo.equalsIgnoreCase("Desenvolvedor")) { // informações pertinentes ao desenvolvedor.

            System.out.println("Digite o salário ref: Desenvolvedor"); // Registra o salario
                double salario =  sc.nextDouble();
                sc.nextLine();// limpa o enter
                
                System.out.println("Data da admissão: "); // Registra a data de admição
                    String dataAdmissao = sc.nextLine();

                System.out.println("Desenvolvedor ativo: (s) ou (n)? ");// Registra se Desenvolvedor está ativo ou não, outras opções são inválidadas
                String ativoFuncionario = sc.nextLine();
                
                boolean ativo = false; // variavel boleana para registro do if posterior.

                if (ativoFuncionario.equalsIgnoreCase("s")) {
                    ativo = true; 
                
                } else if (ativoFuncionario.equalsIgnoreCase("n")) {
                    ativo = false;
                
                } else {
                    System.out.println("Opção inválida! ");
                }

                System.out.println("Linguagem de programação utilizada ?"); // registra qual linguagem de programação ele atuará
                String linguagem= sc.nextLine();
                
                System.out.println("Funcionario Ativo: (s) ou (n)? ");// Registra se desenvolvedor fará manutenções ou não
                String manutencaoAtiva = sc.nextLine();
                
                boolean manutencao = false;
                if (manutencaoAtiva.equalsIgnoreCase("s")) {
                    manutencao = true; 
                
                } else if (manutencaoAtiva.equalsIgnoreCase("n")) {
                    manutencao = false;
                
                } else {
                    System.out.println("Opção inválida! ");
                }

                novoFuncionario = new Desenvolvedor(id,nome,cpf,telefone,email,cargo,salario, 
                                                    dataAdmissao,ativo,linguagem,manutencao); // Criação do objeto com todas as informações

                System.out.println("Desenvolvedor cadastrado com sucesso, seja bem vindo a Mattos Calçados! ");  //informa o fim do cadastro completo do Desenvolvedor.
        
            } else if (cargo.equalsIgnoreCase("Vendedor")) {

                System.out.println("Digite o salário ref: Vendedor: "); // Registra o salario
                    double salario =  sc.nextDouble();
                    sc.nextLine();// limpa o enter

                System.out.println("Data da admissão: "); // Registra a data de admição
                    String dataAdmissao = sc.nextLine();
            
                System.out.println("Vendedor Ativo: (s) ou (n)? ");// Registra se vendedor está ativo ou não, outras opções são inválidadas
                    String ativoFuncionario = sc.nextLine();
                
                boolean ativo = false; // variavel boleana para registro do if posterior.

                    if (ativoFuncionario.equalsIgnoreCase("s")) {
                        ativo = true; 
                
                    } else if (ativoFuncionario.equalsIgnoreCase("n")) {
                        ativo = false;
                
                    } else {
                        System.out.println("Opção inválida! ");
                    } 
                    
                System.out.println("Meta de vendas: "); // Registra a meta do vendedor podendo ser alterada depois por outro método que será criado. 
                double metaVendas = sc.nextDouble();

                System.out.println("Percentual da comissão: "); // Registra o percentual de comissão do vendedor podendo ser alterada depois por outro método que será criado. 
                double percentualComissao = sc.nextDouble();
        
            novoFuncionario = new Vendedor(id,nome,cpf,telefone,email,cargo,salario, dataAdmissao,ativo,metaVendas,percentualComissao);
        }
        /*Chegando ao fim adicionando qual tipo de Funcionario seja ao ArrayLIst "funcionarios" usando o polimorfismo. */
        funcionarios.add(novoFuncionario); // adicionado ao Array
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
public static String[] cadastroBasico1( Scanner sc ) {

    System.out.println("Digite o nome completo: "); // registra o nome
        String nome =  sc.nextLine();
       
    System.out.println("Digite o cpf completo: "); // registra o cpf 
        String cpf =  sc.nextLine();
    
    System.out.println("Digite o telefone completo: "); // registra o telefone
        String telefone =  sc.nextLine();
    
    System.out.println("Digite o email completo: "); // registra o email
        String email =  sc.nextLine();
    
        return new String[]{nome, cpf, telefone, email};
    }

public static String[] cadastroGerente( Scanner sc ){
    
    System.out.println("Digite o salário ref: Gerente" );
        double salario =  sc.nextDouble();
        sc.nextLine(); // limpa o enter
            
    System.out.println("Data da admissão: "); // registra data de adimição
        String dataAdmissao = sc.nextLine();

        return new String[] { salario, dataAdmissao };
    }
}


