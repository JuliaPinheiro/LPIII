/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

import java.util.Scanner;

public class Onibus extends Automovel{
    private int numLugares;
    
    Scanner ler = new Scanner (System.in);
    
  // constructor empty  
    public Onibus (){
    
    this.numLugares = 0;
    this.cor="";
    this.modelo = "";
    this.placa = "";
    
    }
    
  // constructor 
    
    public Onibus(int numLugares, String cor, String modelo, String placa){
    
    this.numLugares = numLugares;
    this.cor = cor;
    this.modelo = modelo;
    this.placa = placa;
    
    }
    
  // print out  
    
       @Override
    public void imprimir() {
        System.out.println("Onibus");
        System.out.println("------");
        super.imprimir();
        System.out.println("Numero de lugares: " + numLugares);
        System.out.println(" ");
    }

        public Onibus inserir() {
        Automovel info = super.inserir();
        System.out.print("Digite o numero de lugares: ");
        int numLugares = ler.nextInt();
      
        Onibus onibus = new Onibus(numLugares, info.cor, info.modelo, info.placa);
        
        return onibus;
    }
    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

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



}
