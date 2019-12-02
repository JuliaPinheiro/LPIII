
package lpiii1;

import java.util.Scanner;

public class Carro extends Automovel{
    private int numPortas;
    
    Scanner ler = new Scanner (System.in);
            

    // constructor empty
    
    public Carro(){
  
    this.numPortas = 0;
    this.cor = "";
    this.modelo = "";
    this.placa = "";
    
    }
    
  // constructor 
    
    public Carro(int numPortas, String cor, String modelo, String placa){
    this.numPortas = numPortas;
    this.cor = cor;
    this.modelo = modelo;
    this.placa = placa;
    }
    
    
    // print out
    
    public void imprimir (){
        System.out.println("CARRO");
        System.out.println("-----");
    System.out.println("Número de portas: " + this.numPortas);
    super.imprimir();
    
    }
    
    // inserir
    
    public Carro inserir  (){
    Automovel info = super.inserir();
    System.out.println("Quantidade de portas");
    int numPortas = ler.nextInt();
    
    Carro carro = new Carro(numPortas,info.modelo, info.cor, info.placa);
    
    return carro;
    }
    
    // get and set
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
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
