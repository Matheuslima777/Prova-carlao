
package prova;

import java.time.LocalDate;


public class Cliente  extends Fisica{
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, LocalDate dataNascimento, String nome, String telefone, Endereco endereco, String email) {
        super(genero, dataNascimento, nome, telefone, endereco, email);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n PROTOCOLO DE ATENDIMENTO: " + protocoloAtendimento ;
    }
    
    
}
