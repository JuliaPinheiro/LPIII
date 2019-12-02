/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

import java.util.Scanner;


public class Automovel implements Tipo{
    protected String placa;
    protected String cor;
    protected String modelo;
    protected Instrutor instrutor;
    
    Scanner ler = new Scanner(System.in);
// constructor empty
    
    public Automovel(){
    this.placa= "";
    this.cor = "";
    this.modelo = "";   
    }
 
// constructor 
    
    public Automovel (String placa, String cor, String modelo){
    
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    
    }

    // print out
    
    public void imprimir (){
    
    System.out.println("Placa: " + this.placa);
    System.out.println("Cor:  " + this.cor   );
    System.out.println("Modelo: "+ this.modelo);
    }
    
    //insert
    
    public Automovel inserir (){
    
        System.out.println("Informe a placa:");
        String placa = ler.next();
        System.out.println("Cor:");
        String cor = ler.next();
        System.out.println("Modelo: ");
        String modelo = ler.next();
        
        Automovel automovel = new Automovel(placa, cor, modelo);
    
        return automovel;
    }
    
    // get and set
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Instrutor getInst() {
        return instrutor;
    }

    public void setInst(Instrutor inst) {
        this.instrutor = inst;
    }

    @Override
    public int numPneus(){
        return 1;
    }
    
    @Override
    public int numCavalos(){
        return 1;
    }
    

    
    
}
