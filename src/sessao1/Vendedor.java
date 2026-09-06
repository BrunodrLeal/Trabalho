package sessao1;

import java.time.LocalDate;

public class Vendedor extends Funcionario{

    private double valorVendas;
    private double percentualComissao;

    public Vendedor(int id, String nome, String cpf, String telefone, String email, String cargo, double salario, LocalDate dataAdmicao, boolean ativo){
        super(id,nome,cpf,telefone,email,cargo,salario,dataAdmicao,ativo);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() + (valorVendas * percentualComissao);
    }
}