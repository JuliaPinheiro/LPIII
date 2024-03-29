/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

public class Automovel implements Tipo{
    protected String placa;
    protected String cor;
    protected String modelo;
    
    protected Instrutor inst;

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
        return inst;
    }

    public void setInst(Instrutor inst) {
        this.inst = inst;
    }

    @Override
    public int numPneus(){
        return 1;
    }
    
    @Override
    public int numCavalos(){
        return 1;
    }
    
    //construtor vazio
    public Automovel(){
        this("", "", "");
    }
    
    //construtor default
    public Automovel(String placa, String cor, String modelo){
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }
}
