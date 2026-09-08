package sessao1;
public  class Gerente extends Funcionario {
    //Atributos classe Gerente.
    
    private boolean contratar;
    private boolean demitir;
    // Constructor classe Gerente.
    public Gerente(int id, String nome, String cpf, String telefone,
                   String email, String cargo, double salario, String dataAdmissao,
                   boolean ativo, boolean contratar, boolean demitir) {
        
        super(id,nome,cpf,telefone,email,cargo,salario,dataAdmissao,ativo);
        
        setContratar(contratar);
        setDemitir(demitir);
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario() {
        return getSalario() * 1.20;
    }

    @Override
    public String toString() {
    return super.toString() +
           "\nPode contratar: " + contratar +
           "\nPode demitir: " + demitir;
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
