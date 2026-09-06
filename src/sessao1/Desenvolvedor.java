package sessao1;
public class Desenvolvedor extends Funcionario {
    private boolean desenvolver;
    private boolean manutencao;
    
    // Constructor Desenvolvedor
    public Desenvolvedor(int Id, String nome, String cpf, String telefone, 
        String email, String cargo, double salario, String dataAdmicao, boolean ativo, boolean desenvolvedor, boolean manutencao){
        
        super(Id,nome,cpf,telefone,email,cargo,salario,dataAdmicao,ativo);

        this.desenvolver = desenvolver;
        this.manutencao = manutencao;
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario(){
        return getSalario() * 1.10;
    }   
    // Setters sem verificação por hora. 
    public void setDesenvolver(boolean desenvolver){
        this.desenvolver = desenvolver;
    }
    public void setManutencao(boolean manutencao){
        this.manutencao = manutencao;
    }
    
    // return desenvolvedor 
    public boolean getDesenvolver(){
        return desenvolver;
    }
    // return manutencao.
    public boolean getManutencao(){
        return manutencao;
    }
      
}   
