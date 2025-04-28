package exer2;

public class Monitor {
    private boolean ligado;

    public Monitor(boolean ligado){
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
            System.out.println("monitor ligado");
        }else{
            System.out.println("monitor desligado");
        }
    }
}

