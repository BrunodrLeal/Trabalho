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

    public void setNome(){
        if(nome != null && !nome.isEmpty()&& nome.length() >= 3){
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void setSalarioBase() {
        if(salarioBase >= 1){
            this.cpf = cpf;
        } else {
            System.out.println("Salário inválido.");
        }
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
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
