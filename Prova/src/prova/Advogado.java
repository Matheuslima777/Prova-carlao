
package prova;

import java.time.LocalDate;


public class Advogado extends Funcionario{
    
    private String oab;

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, LocalDate dataNascimento,  String nome, String telefone, Endereco endereco, String email) {
        super(cpf, rg, matricula, setor, salario,  genero, dataNascimento, nome, telefone, endereco, email);
        this.oab = oab;
    }

    
    
    

   

   
    @Override
    public String toString() {
        return super.toString() + "\n OAB: " + oab ;
    }
    
    
    
    
    
}
