
package prova;


public enum Setor {
    
    SAUDE("Saude"),
    Engenharia("Comercial"),
    JURIDICO("Comercial"),
    OPERACOES("Comercial");
    
   protected final String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public static Setor getSAUDE() {
        return SAUDE;
    }

    public static Setor getEngenharia() {
        return Engenharia;
    }

    public static Setor getJURIDICO() {
        return JURIDICO;
    }

    public static Setor getOPERACOES() {
        return OPERACOES;
    }

    public String getTexto() {
        return texto;
    }

   
   
   
    
}
