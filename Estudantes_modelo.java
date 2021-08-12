/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudante;

/**
 *
 * @author SIMIÃO CANZE
 */
public class Estudantes_modelo
{
    
    private String  nome;
    private int codigo;
    private double n1,n2, media;

    public Estudantes_modelo(int codigo,String nome , double n1, double n2, double media) {
        this.nome = nome;
        this.codigo = codigo;
        this.n1 = n1;
        this.n2 = n2;
        this.media = media;
    }

    public Estudantes_modelo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Estudantes_modelo{" + "nome=" + nome + ", codigo=" + codigo + ", n1=" + n1 + ", n2=" + n2 + ", media=" + media + '}';
    }

    
    
    
    
}
