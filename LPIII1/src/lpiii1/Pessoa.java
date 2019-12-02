/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

public abstract class Pessoa extends endereco{
    
    
    
    protected String first_name;
    protected String last_name;
    protected String number;
    protected String cpf;
    protected String nascimento;
    
  
    public void ImprimirDados(){
        System.out.println("Nome: " + this.first_name);
        System.out.println("Sobrenome: "+ this.last_name);
        System.out.println("numero: "+ this.number);
        System.out.println("data  de nascimento: " + this.nascimento);
        System.out.println("cpf: "+ this.cpf);
        super.imprimir();
    }
    
}
