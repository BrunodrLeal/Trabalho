package sessao1;

abstract class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, int cpf, double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularsalario(){
        return getSalarioBase() * 1.10;
    }   
    
}   
