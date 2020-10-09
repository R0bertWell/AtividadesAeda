package emitirnotafiscal;
public class NotaFiscal {
    private String numPeca,descPeca;
    private int qtdComprada;
    private double preco;
    //Construct
    //Methods
    public void mostrarDados(){
        System.out.println("Número da peça : " + this.getNumPeca());
        System.out.println("Descrição da peça : " + this.getDescPeca());
        System.out.println("Quantidade comprada : " + this.getQtdComprada());
        System.out.println("Preço : R$ " + this.getPreco()*this.getQtdComprada());
    }
            
    //Getters e setters
    public String getNumPeca() {
        return numPeca;
    }

    public void setNumPeca(String numPeca) {
        this.numPeca = numPeca;
    }

    public String getDescPeca() {
        return descPeca;
    }

    public void setDescPeca(String descPeca) {
        this.descPeca = descPeca;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
