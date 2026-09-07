package sessao1;
public  class Gerente extends Funcionario {
    //Atributos classe Gerente.
    
    private boolean contratar;
    private boolean demitir;
    // Constructor classe Gerente.
    public Gerente(int Id, String nome, String cpf, String telefone,
                   String email, String cargo, double salario, String dataAdmissao,
                   boolean ativo, boolean contratar, boolean demitir) {
        
        super(Id,nome,cpf,telefone,email,cargo,salario,dataAdmissao,ativo);
        
        this.contratar = contratar;
        this.demitir = demitir;
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario() {
        return getSalario() * 1.20;
    }

    // Verificação Contratar.
    public void setContratar(boolean contratar) {
        this.contratar = contratar;
    }

    // verificação Demitir.
    public void setDemitir(boolean demitir) {
        this.demitir = demitir;
    }   

    // Return Contratar
    public boolean getContratar() {
        return contratar;
    }

    // Return Demitir
    public boolean getDemitir() {
        return demitir;
    }
}
