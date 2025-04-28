package exer1;

public class Liquidificador {
    private boolean ligado;
     
    public Liquidificador(boolean ligado){
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
            System.out.println("liquidificador ligado");
        }else{
            System.out.println("liquidificador desligado");
        }
    }
}
