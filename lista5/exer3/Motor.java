package exer3;

public class Motor {
    private String tipo;
    
    Motor(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return tipo;
    }  
}
