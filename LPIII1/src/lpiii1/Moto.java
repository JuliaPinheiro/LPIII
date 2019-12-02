/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

import java.math.MathContext;
import java.util.Scanner;


public class Moto extends Automovel{
    private int cilindradas;
    
    Scanner ler = new Scanner(System.in);
    
    
    // constructor empty
    
    public Moto(){
    this.cilindradas = 0;
    this.cor = "";
    this.modelo = "";
    this.placa = "";
    this.instrutor = instrutor;
    }
    
    // constructor 
    
    public Moto (int cilindradas,String cor, String modelo, String placa, Instrutor Indtrutor ){
    this.cilindradas = cilindradas;
    this.cor = cor;
    this.modelo = modelo;
    this.placa = placa;
    this.instrutor = instrutor;
    
    
    }
    
    
    public void Moto (){
        System.out.println("moto");
        System.out.println("----");
        System.out.println("Cilindradas: " + this.cilindradas);
      super.imprimir();
    
    }
    
    public Moto inserir (){
    Automovel info = super.inserir();
    System.out.println("Informe as cilindradas:");
    int cilindradaas = ler.nextInt();
    Moto moto   = new Moto(cilindradas, info.cor, info.modelo, info.placa, info.instrutor);
    
    return moto;
    }
    
    // get and set
    
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
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
