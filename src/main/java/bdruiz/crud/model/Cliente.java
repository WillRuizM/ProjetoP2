package bdruiz.crud.model;

public class Cliente {

    private int id;
    private String nome, cpf, email, nivel;
    
    public Cliente(){
        
    }
    
    public Cliente(int id, String nome, String cpf, String email, String nivel){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nivel = nivel;
    }

    public Cliente(String nome, String cpf, String email, String nivel){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    

    
}