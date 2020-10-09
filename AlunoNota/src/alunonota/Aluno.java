package alunonota;

import java.text.DecimalFormat;

public class Aluno {
    private String matricula;
    private String nome;
    private float n1,n2,notaTrab;
    private double media;
    //Construct

    public Aluno(String matricula, String nome, float n1, float n2, float notaTrab) {
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.notaTrab = notaTrab;
    }
    
    //Methods
    //DecimalFormat
    DecimalFormat dF = new DecimalFormat("###,###.##");
    public void calcMedia(){
         this.media=(((this.n1+this.n2)*3)+(this.notaTrab*4))/10;
         System.out.println("Media do aluno = " + dF.format(this.media));
    }
    public void notaFinal(){
        double faltaNota;
        if(getMedia()<6){
            faltaNota=6-this.media;
            System.out.println("O Aluno precisa de "+ dF.format(faltaNota));
        } else{
            System.out.println("Ja passou, não precisa de nota!");
        } 
            
    }
    
    public double getMedia() {
        return media;
    }

    //Getters e Setters
    public void setMedia(double media) {
        this.media = media;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getNotaTrab() {
        return notaTrab;
    }

    public void setNotaTrab(float notaTrab) {
        this.notaTrab = notaTrab;
    }
    
}
