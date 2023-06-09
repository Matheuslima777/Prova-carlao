
package prova;


public enum Genero {
    MASCULINO(" Masculino", 'M'),
    fEMININO("Feminino", 'F');
    
    protected String texto;
    protected char sigla;

    private Genero(String texto, char sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getfEMININO() {
        return fEMININO;
    }

    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }
    
    
    
}
