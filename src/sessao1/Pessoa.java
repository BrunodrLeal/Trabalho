package sessao1;

abstract class Pessoa {

    // Atributos básicos de um funcionario. 
    private int id = 1;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    

    // constructor com todas as funções para as classes filhas
    public Pessoa(int id, String nome, String cpf, String telefone, String email){
        setId(id);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setEmail(email);
        
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
    public void setTelefone(String telefone) {
    String somenteDigitos = telefone == null
        ? ""
        : telefone.replaceAll("\\D", "");

    if (somenteDigitos.matches("\\d{10,11}")) {
        this.telefone = somenteDigitos;
    } else {
        throw new IllegalArgumentException(
            "Telefone deve possuir 10 ou 11 dígitos."
        );
    }
}
    // Verificação se o email é válido
    public void setEmail(String email) {
    if (email == null) {
        throw new IllegalArgumentException("E-mail não pode ser vazio.");
    }

    String emailLimpo = email.trim();

    if (emailLimpo.matches("^[\\w.+-]+@[\\w-]+(?:\\.[\\w-]+)+$")) {
        this.email = emailLimpo;
    } else {
        throw new IllegalArgumentException("E-mail inválido.");
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
   
    // Classe abstrat para classes filhas aplicarem.
    public abstract double calcularSalario();
    
    public String toString(){
        
    return "ID: " + id +
            "\nNome: " + nome +
            "\nCPF: " + cpf +
            "\nTelefone: " + telefone +
            "\nEmail: " + email ;
    }    
    
}
