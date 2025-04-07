public class Fatura{
    private String numero;
    private String descricao;
    private int qtdItem;
    private double preco;

    public String getNumero() { 
        return numero; 
    } 

    public void setNumero(String numero){
        this.numero=numero;
    }

    public String getDescricao() { 
        return descricao; 
    } 

    public void setDescricao(String descricao){
        this.descricao=descricao;
    }

    public double getQtdItem() { 
        return qtdItem; 
    }

    public void setQtdItem(int qtdItem){
        this.qtdItem=qtdItem;
    }
    
    public double getPreco() { 
        return preco; 
    } 

    public void setPreco(double preco){
        this.preco=preco;
    }

    public double getQtdeFatura(){
        double valor = this.qtdItem*this.preco;
        return valor;

    }

    void exibeDados(double qtdeFatura){
        System.out.println(this.numero + "\n" + this.descricao + "\n" + this.qtdItem + "\n" + this.preco + "\n" + qtdeFatura);
    }
    
}

