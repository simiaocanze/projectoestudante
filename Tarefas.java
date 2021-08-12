/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SIMIÃO CANZE
 */
public class Tarefas {
    
    Validacao val =new Validacao();
    int quant;
    private Estudantes_modelo[] estudante;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    public Tarefas ()throws IOException{
       // System.out.println("insira a quantidade");
        //quant=Integer.parseInt(br.readLine());
       quant=val.validarInt("insira a quantidade",1,12);
        estudante=new Estudantes_modelo[quant];
        inserirEstudante();
        imprimir();
    }
    
    public void inserirEstudante()throws IOException{
        
        //BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String  nome;
        int codigo;
        double n1,n2, media;
        int i=0;
        
        
        do
        {
            System.out.println("Insira o codigo: ");
            codigo=Integer.parseInt(br.readLine());
            
            System.out.println("Insira o Nome: ");
            nome=br.readLine();
           
            System.out.println("Insira a Primeira nota: ");
            n1=Double.parseDouble(br.readLine());
             
           System.out.println("Insira a Segunda nota: ");
           n2=Double.parseDouble(br.readLine()); 
           media=(n1+n2)/2;
            System.out.println("Media: "+media);
           estudante[i]=new Estudantes_modelo(codigo, nome, n1, n2, media);
           i++;
           
        }
        while (i<quant);
    }
    
    public void imprimir(){
        Estudantes_modelo est=new Estudantes_modelo();
        for (int i=0; i<estudante.length; i++){
            System.out.println("Nome: "+ estudante[i].getNome()+" Codigo: " +estudante[i].getCodigo()+" Nota1: "+ estudante[i].getN1()+" Nota2 "+estudante[i].getN2()+" Media "+estudante[i].getMedia());
             
        }
    }
}
