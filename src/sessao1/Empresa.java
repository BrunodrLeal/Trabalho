package sessao1;

import java.util.*;

public class Empresa {
    
    private static int proximoId = 1;  // Atributo static para referencia no AdicionarFuncionario.
    public static void main(String[] args) {
        
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        while(loop) {
            System.out.println("\n======= Menu Mattos Calçados =====  ");
            System.out.println("1 - Adicionar Funcionario: ");
            System.out.println("2 - Remover Funcionario: ");
            System.out.println("3 - Buscar Funcionario: ");
            System.out.println("4 - Listar Funcionario: ");
            System.out.println("5 - Calcular Folha: ");
            System.out.println("6 - SAIR: ");
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

public static void adicionarFuncionario (
    Scanner sc, 
    ArrayList<Funcionario> funcionarios) { // metodo de cadastro completo do Funcionario independente do Tipo.
    
    int id = proximoId++; // adiciona o id para o funcionario
    Funcionario novoFuncionario = null; // Objeto Null para referencia.

    DadosBasicos dadosB = DadosBasicos.cadastroBasico(sc); // dados Basicos 

    System.out.println("Digite o cargo, opções: Gerente, Desenvolvedor ou Vendedor? ");
        
    String cargo =  sc.nextLine(); // pega o cargo definido acima, fora desses está incorreto.
        
        if (cargo.equalsIgnoreCase("Gerente")) { // opção Gerente.
            
            Dados ativoG = Dados.cadastroDados(sc, cargo);            
            
            CadastroGerente funcaoG = CadastroGerente.CadastroG(sc);

            novoFuncionario = new Gerente(
                id,                                                                                     // id gera automático
                dadosB.getNome(), dadosB.getCpf(), dadosB.getTelefone(),dadosB.getEmail(),              // dados basicos
                cargo,                                                                                  //Cargo escolhidos pelo usuário antes do if. 
                ativoG.getSalario(), ativoG.getDataAdmissao(), ativoG.getAtivo(),                       // Situação salarial, data de inicio e atividade.
                funcaoG.getContratar(), funcaoG.getDemitir());                                          // Funções adquiridas pelo cargo.     

            System.out.println("Gerente cadastrado com sucesso, seja bem vindo a Mattos Calçados! ");  //informa o fim do cadastro completo do Gerente.  
            
        } else if (cargo.equalsIgnoreCase("Desenvolvedor")) { // informações pertinentes ao desenvolvedor.

            Dados ativoD = Dados.cadastroDados(sc, cargo);

            CadastroDesenvolvedor funcaD = CadastroDesenvolvedor.CadastroD(sc);

            novoFuncionario = new Desenvolvedor(            
                id,                                                                                      // id gera automático
                dadosB.getNome(), dadosB.getCpf(),dadosB.getTelefone(),dadosB.getEmail(),                // dados basicos
                cargo,                                                                                   //Cargo escolhidos pelo usuário antes do if.
                ativoD.getSalario(),ativoD.getDataAdmissao(),ativoD.getAtivo(),                          // Situação salarial, data de inicio e atividade.
                funcaD.getLinguagem(),funcaD.getManutencao());                                           // Funções adquiridas pelo cargo.             

                System.out.println("Desenvolvedor cadastrado com sucesso, seja bem vindo a Mattos Calçados! "); //informa o fim do cadastro completo do Desenvolvedor.
        
            } else if (cargo.equalsIgnoreCase("Vendedor")) {

                Dados ativoV = Dados.cadastroDados(sc, cargo);
                
                CadastroVendedor funcaoV = CadastroVendedor.cadastroV(sc);
            novoFuncionario = new Vendedor(
                id,                                                                                      // id gera automático
                dadosB.getNome(), dadosB.getCpf(),dadosB.getTelefone(),dadosB.getEmail(),                // dados basicos   
                cargo,                                                                                   //Cargo escolhidos pelo usuário antes do if.
                ativoV.getSalario(),ativoV.getDataAdmissao(),ativoV.getAtivo(),                          // Situação salarial, data de inicio e atividade.
                funcaoV.getMetaComissao(),funcaoV.getPercentualComissao());                                                          // Funções adquiridas pelo cargo.     
        
            } else {
            
            System.out.println("Cargo inválido!");
            
        }
        /*Chegando ao fim adicionando qual tipo de Funcionario seja ao ArrayLIst "funcionarios" usando o polimorfismo. */
        if (novoFuncionario != null) {
        funcionarios.add(novoFuncionario);   // adicionado ao Array
}       

        
    }
        
public static void removerFuncionario(
    Scanner sc, 
    ArrayList<Funcionario> funcionarios){
    
    Funcionario funcionario = BuscarFuncionario.Consulta(sc,funcionarios);

    if (funcionario != null) {
        funcionarios.remove(funcionario);
        System.out.println("Funcionário removido com sucesso!");
    } else {
        System.out.println("Funcionário não encontrado.");
    }
}

public static void buscarFuncionario(
    Scanner sc, 
    ArrayList<Funcionario> funcionarios) {
    
    Funcionario funcionario = BuscarFuncionario.Consulta(sc,funcionarios);

        if (funcionario != null) {
        System.out.println(
            "Funcionário encontrado: "
            + funcionario.getNome()
            + " CPF: "
            + funcionario.getCpf()
        );
    } else {
        System.out.println("Funcionário não encontrado.");
    }
}

public static void listarFuncionario(
    ArrayList<Funcionario> funcionarios){
    
    for (Funcionario funcionario : funcionarios) {
        System.out.println(funcionario);
        System.out.println("----------------------------");
    }
}
public static void calcularFolhaSalarial(
    ArrayList<Funcionario> funcionarios){
    
    double totalFolha = 0.0;

    for(Funcionario f : funcionarios) {
    
    System.out.println("Sergue a lista de funcionarios e seus salarios.");
    
    double salarioCalculado = f.calcularSalario();  

        System.out.println(
            f.getNome() + ": R$ " + salarioCalculado
        );
        
        // Somando o salário atual ao total
        totalFolha += f.getSalario();
    }
    System.out.println("-------------------------");
    System.out.println("Total da folha: R$ " + totalFolha);
    }  
}



