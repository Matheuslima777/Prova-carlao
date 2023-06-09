
package prova;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    
    private String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, LocalDate dataNascimento,  String nome, String telefone, Endereco endereco, String email) {
        super(cpf, rg, matricula, setor, salario, genero, dataNascimento, nome, telefone, endereco, email);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

   

    
    

   


    @Override
    public String toString() {
        return super.toString() + 
                "\n CNH: " + cnh ;
    }

  
    
    
}
