
package prova;


public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    RIO_DEjANEIRO("Rio de Janeiro", "RJ"),
    SAO_PAULO("São Paulo", "SP");

    protected String texto;
    protected String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getRIO_DEjANEIRO() {
        return RIO_DEjANEIRO;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }

    

   
    
    
}
