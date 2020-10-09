package funcionarios;

import java.text.DecimalFormat;

public class Funcionario {
    DecimalFormat df = new DecimalFormat("###,###.##");
    //Attributes
    private String nome;
    private String sobrenome;
    private double gratificacao=0.5f;//Aumento
    private double salMensal;
    private double porcGratificacao;
    
    //Constructor
    
    void Funcionario(){
        this.nome="Wellington";
        this.sobrenome="Roberto";
        this.salMensal=1000f;
        this.gratificacao=0.5f;//Aumento de responsa
    }
    
    //TooString

    @Override
    public String toString() {
        setPorcGratificacao((getGratificacao()*100)/getSalMensal());
        return "Funcionario{" + " Nome=" + nome + 
                "\nSobrenome=" + sobrenome + 
                "\nGratificação=" + gratificacao + 
                "\nSalário mensal=" + salMensal + 
                "\nSalário mensal com gratificação =" + df.format(getSalMensal()+getGratificacao()) + 
                "\nEsse funcionário recebeu uma gratificação de "+ df.format(porcGratificacao) + "%" + '}';
    }
    
    //Methods
    
    //Getters n Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalMensal() {
        return salMensal;
    }

    public void setSalMensal(double salMensal) {
        this.salMensal = salMensal;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double getPorcGratificacao() {
        return porcGratificacao;
    }

    public void setPorcGratificacao(double porcGratificacao) {
        this.porcGratificacao = porcGratificacao;
    }
    
    
}
