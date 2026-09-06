package sessao1;
public  class Gerente extends Funcionario{
    //Atributos classe Gerente.
    private boolean gerenciar;
    private boolean contratar;
    private boolean demitir;
    // Constructor classe Gerente.
    public Gerente(int Id, String nome, String cpf, String telefone,
        String email, String cargo, double salario, String dataAdmicao, boolean ativo,boolean gerenciar, boolean contratar, boolean demitir){
        
        super(Id,nome,cpf,telefone,email,cargo,salario,dataAdmicao,ativo);
        
        this.gerenciar = gerenciar;
        this.contratar = contratar;
        this.demitir = demitir;
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario(){
        return getSalario() * 1.20;
    }

    // Verifcação gerenciar.
    public void setGerenciar(boolean gerenciar){
        this.gerenciar = gerenciar;
    }
    
    // Verificação Contratar.
    public void setContratar(boolean contratar){
        this.contratar = contratar;
    }

    // verificação Demitir.
    public void setDemitir(boolean demitir) {
        this.demitir = demitir;
    }

    // Return Gerenciar
    public boolean getGerenciar(){
        return gerenciar;
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
