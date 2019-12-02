/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

import java.util.Scanner;


public class endereco {
    
    private String logadouro;
    private String cidade;
    private  String estado;
    
    // constructor empty 

    public endereco() {
    this.cidade = "";
    this.estado = "";
    this.logadouro = "";
    
    }
    
// constructor
    
    public endereco(String logadouro, String cidade, String estado) {
        this.logadouro = logadouro;
        this.cidade = cidade;
        this.estado = estado;
    }
public void imprimir (){

    System.out.println("Cidade: "+ this.cidade);
    System.out.println("Logadouro"+ this.logadouro);
    System.out.println("Estado: "+ this.estado);

}
    
public endereco inserir(){
 Scanner ler = new Scanner (System.in);
 
    System.out.println("Informe o logadouro");
    this.logadouro = ler.nextLine();
    System.out.println("Informe a cidade");
    this.cidade = ler.nextLine();
    System.out.println("Informe o estado");
    this.estado = ler.nextLine();
    
    return this;
    
}
    
    endereco(String rua_1, int i, String sao_paulo, String sp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
//
//public String toString (){
//  
//    return ("Rua: " + getLogadouro() + "Cidade: " + getCidade() + "Estado: " + getEstado());
//}      
}
