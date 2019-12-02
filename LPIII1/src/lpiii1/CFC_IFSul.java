/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class CFC_IFSul {
    public static void main(String[] args){

// endereco e = new endereco("rua 1", "são paulo", "sp");
// 
// a.ImprimirDados();

//ArrayList <Aluno>  a = new ArrayList<Aluno>();{
//
//Aluno julia = new Aluno();
//
//julia.setCpf("450.824.317-54");
//julia.setFirst_name("Julia");
//julia.setLast_name("Pinheiro Oliveira");
//julia.setNascimento("22/06/1999");
//    
//    
//    
// }
        endereco e = new endereco();
        Vector<Pessoa> FuncionarioVec = new Vector();
        Vector<Pessoa> alunoVec = new Vector();
        Vector<Automovel> automovelVec = new Vector();
        Scanner ler = new Scanner(System.in);
        
         
                int opca =0;
        int opc = 0 ;
        
        do {
        
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - LISTAR ALUNOS"  );
            System.out.println("3 - CADASTRAR AUTOMOVEL");
            System.out.println("4 - LISTAR AUTOMOVEL"  );
            System.out.println("5 - CADASTRAR FUNCIONÁRIOS");
            System.out.println("6 - LISTAR FUNCIONÁRIOS");
            System.out.println("0 - SAIR");
            System.out.print("------------------------------");
            opc = ler.nextInt();
            
            if (opc  == 1){
            Aluno aluno = new Aluno();
            aluno = aluno.inserir();
            alunoVec.add(aluno);
            } else if (opc == 2) {
            for (Pessoa vector : alunoVec){
            vector.ImprimirDados();
            
                }
            }
            
            if (opc ==3){
               
                
                System.out.println("1 - CADASTRAR CARRO");
                System.out.println("3 - CADASTRAR MOTO");
                System.out.println("2 - CADASTRAR ONIBUS");
                opca = ler.nextInt();
                
                if (opca ==1){
            Carro carro = new  Carro();
            carro = carro.inserir();
            automovelVec.add(carro);
                } else if(opca ==2){
                  Moto m = new Moto();
                  m = m.inserir();
                  automovelVec.add(m);
                } else if (opc==3){
                Onibus onibus = new Onibus();
                onibus = onibus.inserir();
                automovelVec.add(onibus);
                
                
            }
                if (opc==4){
                    
            for (Automovel vector : automovelVec){
            vector.imprimir();
            }
            
            if (opc == 5){
             System.out.println("1 - CADASTRAR ATENDENTE");
             //System.out.println("2 - CADASTRAR INSTRUTOR");
            opca = ler.nextInt();
             if (opca==1){
             Atendente a = new Atendente();
             a = a.inserir();
             FuncionarioVec.add(a);
             }
//             } else if (opca==2){
//               Instrutor instrutor = new Instrutor();
//               instrutor = instrutor.inserir(automovelVec);
//               if (instrutor != null)
//               
//             
//             }
            
            }
            
            if (opc == 6){
            for (Pessoa vector : FuncionarioVec){
            vector.ImprimirDados();
            }
            }
                    
                    
                }}
        
         } while (opc !=0);
        
        
        
        
        



}
       
}