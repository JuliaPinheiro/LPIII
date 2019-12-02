/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

public class Instrutor extends Pessoa{
    private int id;
    private Automovel automovel;
    
    
    // constructor empty
    
   public Instrutor(){

    this.first_name = "";
    this.last_name=  "";
    this.number = "";
    this.id = 0;
   }
    
   // constructor
   
    public  Instrutor (String first_name, String last_name, String number){
    
        this.first_name = first_name;
        this.last_name = last_name;
        this.id = id;
        this.number = number;
    }
       
   
   

    public Automovel getAut() {
        return automovel;
    }

    public void setAut(Automovel aut) {
        this.automovel = aut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    @Override
    public void ImprimirDados() {
    System.out.println("dados intrutor");
    System.out.println("--------------");
    System.out.print("Nome: "+ this.first_name);
    System.out.println("Sobrenome: "+ this.last_name);
    System.out.println("Id: "+ this.id );
    System.out.println("Automovel: "+ this.automovel);
    System.out.println("Numero:  "+ this.number);    
    }
    
    
}
