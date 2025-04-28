package exer2;

public class CPU {
    private boolean ligado;

    public CPU(boolean ligado){
        this.ligado=ligado;
    }

    void ligar(){
        this.ligado = true;
    }

    void desligar(){
        this.ligado = false;
    }
    
    boolean isLigado(){
        return this.ligado;
    }

    void observar(){
        if (isLigado()){
            System.out.println("CPU ligado");
        }else{
            System.out.println("CPU desligado");
        }
    }
}
