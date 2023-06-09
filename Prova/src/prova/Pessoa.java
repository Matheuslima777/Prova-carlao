
package prova;


public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected Endereco endereco;
    protected String email;

    public Pessoa( String nome, String telefone, Endereco endereco, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return 
                "\n NOME: " + nome +
                "\n TELEFONE: " + telefone + 
                "\n ENDERECO: " + endereco + 
                "\n EMAIL: " + email ;
    }
    
    
}
