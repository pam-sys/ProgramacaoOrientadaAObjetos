package exer1;

public class Geladeira {
    private boolean ligado;

    public Geladeira(boolean ligado){
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
            System.out.println("geladeira ligada");
        }else{
            System.out.println("geladeira desligada");
        }
    }
}
