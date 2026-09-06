package sessao1;

abstract  class Gerente extends Funcionario{
    
    public Gerente(String nome, int cpf, double salarioBase){
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularsalario(){
        return getSalarioBase() * 1.20;
    }

}
