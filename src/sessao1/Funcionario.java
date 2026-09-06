package sessao1;

//Classe Abstrata - Classe Pai
abstract class Funcionario {

    // Atributos basicos
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String cargo;
    private double salario;
    private String dataAdmissao;
    private boolean ativo;

    // constructor
    public Funcionario(int id, String nome, String cpf, String telefone, String email, String cargo, double salario, String dataAdmicao, boolean ativo){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.cargo =  cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmicao;
        this.ativo = ativo;
    }

    // Setters para verificação
    public void setId (int id) {
        if(id > 0 ) {
            this.id = id;
        } 
    }
    public void setNome (String nome){
        if(nome != null && !nome.isEmpty()&& nome.length() >= 3){
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }
    public void setCpf (String cpf) {

    }
    public void setTelefone (String telefone) {

    }
    public void setEmail (String email) {

    }
    public void setCargo (String cargo) {

    }
    public void setSalario(double salario) {
        if(salario >= 1){
            this.salario = salario;
        } else {
            System.out.println("Salário inválido.");
        }
    }
    public void setDataAdmicao (String dataAdmicao) {

    } 
    public void setAtivo(boolean ativo){

    }
    // Getters para retorno
    public int getId() {
        return id;
        }
    public String getNome(){
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public String getDataAdmicao() {
        return dataAdmissao;
    }
    public boolean getAtivo() {
        return ativo;
    }
    
    public abstract double calcularsalario();
        
    public void aumentarSalario(double valor) {
        if(valor > 0) {
            salarioBase += valor;
            System.out.println("Salário ajustado: R$ " + salarioBase);
        } else {
            System.out.println("Aumento invalidado.");
        }
    }
}
