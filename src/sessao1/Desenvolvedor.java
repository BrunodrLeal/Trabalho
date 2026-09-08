package sessao1;
public class Desenvolvedor extends Funcionario {
    
    private String linguagem;
    private boolean manutencao;
    
    // Constructor Desenvolvedor
    public Desenvolvedor (int id, String nome, String cpf, String telefone, 
                         String email, String cargo, double salario, String dataAdmissao, 
                         boolean ativo, String linguagem, boolean manutencao) {
        
        super(id,nome,cpf,telefone,email,cargo,salario,dataAdmissao,ativo);

        setLinguagem(linguagem);
        setManutencao(manutencao);
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario() {
        return getSalario() * 1.10;
    }   

    @Override
    public String toString() {
    return super.toString() +
           "\nLinguagem: " + linguagem +
           "\nManutenção: " + manutencao;
    }
    // Setters sem verificação por hora. 
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }
    
    // return desenvolvedor 
    public String getLinguagem() {
        return linguagem;
    }
    // return manutencao.
    public boolean getManutencao() {
        return manutencao;
    }
      
}   
