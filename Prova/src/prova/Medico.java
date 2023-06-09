
package prova;

import java.time.LocalDate;


public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario,  Genero genero, LocalDate dataNascimento,  String nome, String telefone, Endereco endereco, String email) {
        super(cpf, rg, matricula, setor, salario,  genero, dataNascimento, nome, telefone, endereco, email);
        this.crm = crm;
    }

   

    

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CRM: " + crm ;
    }

    
}
