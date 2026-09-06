package sessao1;

public class Vendedor extends Funcionario{

    private double valorVendas;
    private double percentualComissao;

    public Vendedor(String nome, String cpf, double salarioBase, double valorVendas, double percentualComissao) {
        super(nome, cpf, salarioBase);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase() + (valorVendas * percentualComissao);
    }
}