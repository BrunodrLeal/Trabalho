package sessao1;
public class Vendedor extends Funcionario{
    
    // atributos vendedor
    private boolean  vendas;
    private double valorVendas;
    private double percentualComissao;

    // Constructor Vendedor
    public Vendedor(int Id, String nome, String cpf, String telefone, 
        String email, String cargo, double salario, String dataAdmicao, boolean ativo){
        
        super(Id,nome,cpf,telefone,email,cargo,salario,dataAdmicao,ativo);
        
        this.vendas = vendas;
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario(){
        return getSalario() + (valorVendas * percentualComissao);
    }
    // Verifica se vendedor está ativo.
    public void setVendas(boolean  vendas){
        
        if (vendas == true) {
            this.vendas = vendas; 
        } else {
            throw new IllegalArgumentException(" Vendedor inativo");
        }
    }
    // verifica se vendedor tem feito seu trabalho.
    public void setValorVendas(double valorVendas){
        
        if (valorVendas > 0) {
            this.valorVendas = valorVendas;
        }  else {
           throw new IllegalArgumentException(" Vendedor precisa de treinamento."); 
        }
    }
    // PercentualComissao tem que ficar entre 3 e 5%;
    public void setPercentualComissao(double percentualComissao){
        
        if (percentualComissao >= 3 && percentualComissao <= 5) {
            this.percentualComissao = percentualComissao;
        } else{
            throw new IllegalArgumentException(" Vendedor precisa de treinamento.");
        }
    }
    // Return Vendas
    public boolean  getVendas(){
        return vendas;
    }
    // Return ValorVendas
    public double getValorVendas(){
        return valorVendas;
    }
    // Return percentualComissao
    public double getPercentualComissao(){
        return percentualComissao;
    }
    
}