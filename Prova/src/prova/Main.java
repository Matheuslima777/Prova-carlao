
package prova;

import java.time.LocalDate;
import java.time.Month;


public class Main {

   
    public static void main(String[] args) {
       Juridica pessoaJuridca = new Juridica("21314141", "2313131", "Americanas", "231414",
               new Endereco("RUA &", "12341", "Salvador", "Casa", UnidadeFederativa.BAHIA), "americanas@gmail.com"); 
       
       Cliente cliente = new Cliente(123341, Genero.fEMININO, LocalDate.of(2001, Month.MARCH, 8), "Lara", "231123412", 
               new Endereco("Avenida sete", "2313", "Rio  de janeiro", "Casa", UnidadeFederativa.RIO_DEjANEIRO), "Ahdj@gmail.com");
      
       Medico medico = new Medico("231314", "23214144", "3231214", "231241414", Setor.SAUDE, 8900, Genero.fEMININO, LocalDate.of(2001, Month.MARCH, 18), "Laara", "2312314",
               new Endereco("RUA nv", "312314", "Salvador", "casa", UnidadeFederativa.BAHIA), "hdjsak@gmail.com");
       
       Motoboy motoboy = new Motoboy("231314", "2313131", "231226266", "23125242321", Setor.OPERACOES, 9, Genero.fEMININO, LocalDate.of(2002, Month.MARCH, 1), "larissa", "2312314", 
               new Endereco("av 87", "123", "Salvador", "CASA", UnidadeFederativa.BAHIA), "djsakja@gmail.com");
       
       
       Advogado advogado = new Advogado("213321", "23123124", "2312414", "232141142", Setor.SAUDE, 32000, Genero.fEMININO, LocalDate.of(2003, Month.MARCH, 7),  "Alan", "231241213", 
               new Endereco("RUA 87", "231", "Salvador", "CASA", UnidadeFederativa.BAHIA), "2312312@gmail.com");
      
       
       System.out.println(pessoaJuridca.toString());
       System.out.println(cliente.toString());
       System.out.println(medico.toString());
        System.out.println(motoboy.toString());
        System.out.println(advogado.toString());
    }
    
    
}
