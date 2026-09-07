package sessao1;



//Classe Abstrata - Classe Pai
abstract class Funcionario {

    // Atributos básicos de um funcionario. 
    private static int id = 1;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String cargo;
    private double salario;
    private String dataAdmissao;
    private boolean ativo;

    // constructor com todas as funções para as classes filhas
    public Funcionario(int id, String nome, String cpf, String telefone, 
    String email, String cargo, double salario, String dataAdmissao, boolean ativo){
        this.id= id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.cargo =  cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.ativo = ativo;
    }

    // Verificação se o id é válido
    public void setId (int id) {
        if(id > 0 ) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID inválido: " + id);
        }
    }
    // Verificação se o nome é válido
    public void setNome (String nome){
        if(nome != null && !nome.isEmpty()&& nome.length() >= 3){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido: "+ nome);
        }
    }
    // Verificação se o cpf é válido
    public void setCpf (String cpf) {
        if (cpf != null && cpf.replaceAll("\\D", "").length() == 11){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido!"+ cpf);
        }
    }
    // Verificação se o telefone é válido
    public void setTelefone (String telefone) {
        if(telefone != null && telefone.replaceAll("\\D", "").length() >= 10){
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido: "+ telefone);
        }
    }
    // Verificação se o email é válido
    public void setEmail (String email) {
        if(email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            this.email = email;
        } else {
            throw new IllegalArgumentException("E-mail inválido!"+ email);
        }
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
            throw new IllegalArgumentException("Sal´[ario inválido: "+ salario);
        }
    }
    // Verificação se a data de admição é válida
    public void setDataAdmissao (String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;   
     } 
    // Verificação se o funcionario está ativo
    public void setAtivo(boolean ativo){
        if(ativo = true){
            this.ativo = ativo;
        } else{
            throw new IllegalArgumentException("Funcionario desligado: " + ativo);
        }
    }
    // Retorno id
    public int getId() {
        return id;
    }
    // Retorno Nome
    public String getNome(){
        return nome;
    }
    // Retorno cpf
    public String getCpf() {
        return cpf;
    }
    // Retorno Telefone
    public String getTelefone(){
        return telefone;
    }
    // Retorno Email
    public String getEmail() {
        return email;
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
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    // Retorno Ativo
    public boolean getAtivo() {
        return ativo;
    }
    // Classe abstrat para classes filhas aplicarem.
    public abstract double calcularSalario();
    
    public String toString(){
        
    return "ID: " + id +
            "\nNome: " + nome +
            "\nCPF: " + cpf +
            "\nTelefone: " + telefone +
            "\nEmail: " + email +
            "\nCargo: " + cargo +
            "\nSalário: " + salario +
            "\nData de Admissão: " + dataAdmissao +
            "\nAtivo: " + ativo;

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
}
