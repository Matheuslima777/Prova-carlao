
package prova;

import java.time.LocalDate;
import java.time.Period;


public abstract class Fisica extends Pessoa{
    
    protected Genero genero;
    protected LocalDate dataNascimento;
  

    public Fisica(Genero genero, LocalDate dataNascimento,  String nome, String telefone, Endereco endereco, String email) {
        super(nome, telefone, endereco, email);
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }

    
    
    public int getIdade(){
    return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

  

    @Override
    public String toString() {
        return super.toString() +
                "\n GENERO: " + genero.sigla +
                "\n DATA DE NASCIMENTO: " + dataNascimento + 
                "\n IDADE: " + getIdade() ;
    }
    
    
}
