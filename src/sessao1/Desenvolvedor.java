package sessao1;
public class Desenvolvedor extends Funcionario {
    private String linguagem;
    private boolean manutencao;
    
    // Constructor Desenvolvedor
    public Desenvolvedor (int Id, String nome, String cpf, String telefone, 
                         String email, String cargo, double salario, String dataAdmssao, 
                         boolean ativo, String linguagem, boolean manutencao) {
        
        super(Id,nome,cpf,telefone,email,cargo,salario,dataAdmssao,ativo);

        this.linguagem = linguagem;
        this.manutencao = manutencao;
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario() {
        return getSalario() * 1.10;
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
