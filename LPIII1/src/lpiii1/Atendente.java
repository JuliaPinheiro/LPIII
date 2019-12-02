
package lpiii1;

import java.util.Scanner;

public class Atendente extends Pessoa{
    private String turno;
    Scanner  ler = new Scanner (System.in);
    
    
    
    
    // empty constructor
    
    public Atendente(){
    this.first_name = "";
    this.last_name ="";
    this.number =  "";
    this.turno = "";
    
    }
    
       @Override
       public void ImprimirDados() {
      System.out.println("dados do atendente");
      System.out.println("------------------");
      super.ImprimirDados();
      System.out.println("Turno: " + this.turno);
    }
       
       
         
    public Atendente inserir(){
        System.out.println("Cadastrar atendente");
        System.out.println("-------------------");
        
        System.out.println("turno: ");
        this.turno = ler.nextLine();
        System.out.println("Nome:" );
        this.first_name = ler.nextLine();
        System.out.println("sobrenome:");
        this.last_name = ler.nextLine();
        System.out.println("Numero");
        this.number =ler.nextLine();
        System.out.println("Cpf:");
        this.cpf = ler.next();
        System.out.println("data de nascimento:");
        this.nascimento = ler.next();
        
        return this;
 
    
    }
    //constructor
    
    public Atendente (String first_name, String last_name, String number, String turno){
    this.first_name =first_name;
    this.last_name = last_name;
    this.number = number;
    this.turno = turno;
    
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

 

 
    
}
