package sessao1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

abstract  class Funcionario extends Pessoa{
    
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;
    private boolean ativo;

    public Funcionario (int id, String nome, String cpf, 
                        String telefone, String email,String cargo, 
                        double salario, String dataAdmissao, boolean ativo) {

        super(id,nome,cpf,telefone,email);
        
        setCargo(cargo);
        setSalario(salario);
        setDataAdmissao(dataAdmissao);
        setAtivo(ativo);
    }

    // Verificação se o cargo é válido
    public void setCargo (String cargo) {
        if(cargo != null && !cargo.isEmpty()&& cargo.length() >= 3){
            this.cargo = cargo;
        } else {
            throw new IllegalArgumentException("Cargo inválido: "+ cargo);
        }
    }
    // Verificação se o salário é válido
    public void setSalario(double salario) {
        if(salario >= 1){
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Salário inválido: "+ salario);
        }
    }
    // Verificação se a data de admição é válida
    public void setDataAdmissao(String dataAdmissao) { // Essa função tive uma ajuda da IA para entender pois não tinha estudando essas funções
    try {
        DateTimeFormatter formato = DateTimeFormatter
            .ofPattern("dd/MM/uuuu")
            .withResolverStyle(ResolverStyle.STRICT);

        LocalDate data = LocalDate.parse(dataAdmissao.trim(), formato);

        if (data.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(
                "A data de admissão não pode estar no futuro."
            );
        }

        this.dataAdmissao = data;

    } catch (DateTimeParseException e) {
        throw new IllegalArgumentException(
            "Data inválida. Use o formato dd/MM/aaaa."
            );
        }
    } 
    // Verificação se o funcionario está ativo
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

     // Retorno Cargo
    public String getCargo() {
        return cargo;
    }
    // Retorno Salario
    public double getSalario() {
        return salario;
    }
    // Retorno Data de admição
    public LocalDate getDataAdmissao() { // modificação para verificação correta da data de admissão
        return dataAdmissao;
    }
    // Retorno Ativo
    public boolean getAtivo() {
        return ativo;
    }

    // Método de calculo de salário para classes filhas. 
    public void aumentarSalario(double valor) {
        if(valor > 0) {
            salario += valor;
            System.out.println("Salário ajustado: R$ " + salario);
        } else {
            System.out.println("Aumento invalidado.");
        }
    }
    @Override 
    public String toString(){
        return super.toString() +
        "\nCargo: " + cargo +
            "\nSalário: " + salario +
            "\nData de Admissão: " + dataAdmissao +
            "\nAtivo: " + ativo;
}
}


