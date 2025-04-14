package exer2;
public class Retangulo{
    private double comprimento, largura;

    public Retangulo(){
        this.comprimento=1;
        this.largura=1;
    }

    public Retangulo(double comprimento, double largura){
        this.comprimento=comprimento;
        this.largura=largura;
    }

    public double getComprimento(){
        return comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    double Perimetro(){
        return 2*comprimento+2*largura;
    }

    double area(){
        return comprimento*largura;   
    }

    void exibirDimensoes(){
        System.out.println("perimetro = " + Perimetro());
        System.out.println("area = " + area());
    }
} 