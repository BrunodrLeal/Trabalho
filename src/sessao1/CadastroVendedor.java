package sessao1;

import java.util.Scanner;

public class CadastroVendedor {
    
    private double metaVendas;
    private double percentualComissao;

    public CadastroVendedor(double metaVendas, double percentualComissao) {

        this.metaVendas = metaVendas;
        this.percentualComissao = percentualComissao;

    }

    public static CadastroVendedor cadastroV(Scanner sc){
        
        System.out.println("Meta de vendas: "); // Registra a meta do vendedor podendo ser alterada depois por outro método que será criado. 
            double metaVendas = sc.nextDouble();

        System.out.println("Percentual da comissão: "); // Registra o percentual de comissão do vendedor podendo ser alterada depois por outro método que será criado. 
            double percentualComissao = sc.nextDouble();

        return new CadastroVendedor(metaVendas, percentualComissao);
    }

    public double  getMetaComissao() { return metaVendas; }
    public double getPercentualComissao() { return percentualComissao; }
}
