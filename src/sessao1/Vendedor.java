package sessao1;

public class Vendedor extends Funcionario {
    
    // atributos vendedor
    private double metaVendas;
    private double percentualComissao;

    // Constructor Vendedor
    public Vendedor(int id, String nome, String cpf, String telefone, 
                    String email, String cargo, double salario, String dataAdmissao, boolean ativo,
                    double metaVendas, double percentualComissao) {
        
        super(id,nome,cpf,telefone,email,cargo,salario,dataAdmissao,ativo);

        this.metaVendas = metaVendas;
        this.percentualComissao = percentualComissao;
    }
    // Método @Override Obrigatório.
    @Override
    public double calcularSalario() {
        return getSalario() + (metaVendas * percentualComissao);
    }
    @Override 
    public String toString(){
        return super.toString() +
           "\nMeta de Vendas: " + metaVendas +
           "\nPercentual de comissão: " + percentualComissao;

    }

    // verifica se vendedor tem feito seu trabalho.
    public void setMetaVendas(double metaVendas) {
        
        if (metaVendas > 0) {
            this.metaVendas = metaVendas;
        
        }  else {
           throw new IllegalArgumentException(" Vendedor precisa de treinamento."); 
        }

    }
    // PercentualComissao tem que ficar entre 3 e 5%;
    public void setPercentualComissao(double percentualComissao) {
        
        if (percentualComissao >= 3 && percentualComissao <= 5) {
            this.percentualComissao = percentualComissao;
        
        } else {
            throw new IllegalArgumentException(" Vendedor precisa de treinamento.");
        }
    }
    
    // Return ValorVendas
    public double getMetaVendas() {
        return metaVendas;
    }
    // Return percentualComissao
    public double getPercentualComissao() {
        return percentualComissao;
    }
    
}