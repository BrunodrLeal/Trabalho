package sessao1;

import java.time.LocalDate;

abstract  class Gerente extends Funcionario{
    
    public Gerente(int id, String nome, String cpf, String telefone, String email, String cargo, double salario, LocalDate dataAdmicao, boolean ativo){
        super(id,nome,cpf,telefone,email,cargo,salario,dataAdmicao,ativo);
    }

    @Override
    public double calcularSalario(){
        return getSalario() * 1.20;
    }

}
