package exer1;

public class Microondas {
    private boolean ligado;
    
    public Microondas(boolean ligado){
        this.ligado=ligado;
    }

    void ligar(){
        this.ligado=true;
    }

    void desligar(){
        this.ligado=false;
    }
    
    boolean isLigado(){
        return this.ligado;
    }

    void observar(){
        if (isLigado()){
            System.out.println("microondas ligado");
        }else{
            System.out.println("microondas desligado");
        }
    } 
}
