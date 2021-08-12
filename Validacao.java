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
public class Validacao
{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
  
    public String validacaoString(String msg, int menor, int maior){
        
        String variavel="";
        do
        {
            try{
                variavel=br.readLine();
                System.out.println(msg);
                if(variavel.length()<menor || variavel.length()>maior)
                    System.err.println("A palava deve ter no minimo "+ menor + " e no maximo "+maior);
            }
            catch (IOException ex){
                System.err.println("erro: "+ ex.getMessage());
            }
        }while(variavel.length()<menor || variavel.length()> maior);
        return variavel;
        
    }
    public static int validarInt (String caracter, int menor, int maior)
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int num=0;
        
        do
        {
            System.out.println(caracter);
            try
            {
                num=Integer.parseInt(br.readLine());
                if(num < menor || num > maior)
                    System.out.println("NUMERO INVALIDO! \n O numero deve estar entre "+menor+ " e "+maior+".");
            }
            catch (NumberFormatException nfe)
            {
                System.err.println("ERRO: DADOS MAL INSERIDOS! \n"+nfe.getMessage());
            }
            catch(IOException ex)
            {
                System.err.println("Error: \n" + ex.getMessage());
            }
        }
        while (num < menor || num > maior);
        return num;
    }

}
