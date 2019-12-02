/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

import java.util.Scanner;

public class Aluno extends Pessoa{
    
    //var   
    private String categoriaHabilitacao;
    private endereco end;
    
    // scanner
    
    Scanner ler = new Scanner(System.in);
    

    // constructor empty 
    public Aluno(){
    this.categoriaHabilitacao = "";    
    }
    
    // constructor 
    
    public Aluno ( String CategoriaHabilitacao, String first_name, String last_name, String number, endereco end){
    
   
    this.categoriaHabilitacao = CategoriaHabilitacao;
    this.first_name = first_name;
    this.last_name = last_name;
    this.number = number;
    this.end = this.end;
    }
    
    @Override
    public void ImprimirDados() {
        System.out.println("Aluno");
        System.out.println("-----");
        System.out.println("Categoria cnh:" +this.categoriaHabilitacao);
        super.ImprimirDados();
        
    }
    
    @Override
    public Aluno inserir(){
      
        System.out.println("CADASTRAR ALUNO");
        System.out.println("---------------");
        
        
        
        endereco end = super.inserir();
        Aluno aluno = new Aluno(categoriaHabilitacao, first_name, last_name, number, end);
        System.out.println("Informe a categoria do aluno: ");
        char cnh = ler.next().charAt(0);
        
        return aluno;
    }
    

    public String getCategoriaHabilitacao() {
        return categoriaHabilitacao;
    }

    public void setCategoriaHabilitacao(String categoriaHabilitacao) {
        this.categoriaHabilitacao = categoriaHabilitacao;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

      
   

    
    
    
    
    
}
