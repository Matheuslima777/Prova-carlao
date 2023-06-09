
package prova;


public class Endereco {
    protected String logradouro;
    protected String numero;
    protected String cidade;
    protected String complemento;
    protected UnidadeFederativa uf;

    public Endereco(String logradouro, String numero, String cidade, String complemento, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.complemento = complemento;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return  "\n LOGRADOURO: " + logradouro + 
                "\n NUMERO; " + numero + 
                "\n CIDADE: " + cidade +
                "\n COMPLEMENTO: " + complemento + 
                "\n UNIDADE FEDEATIVA: " + uf.texto ;
    }

    
    
}
