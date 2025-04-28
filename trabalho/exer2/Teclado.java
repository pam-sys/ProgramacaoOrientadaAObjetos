package exer2;

public class Teclado {
        private boolean ligado;
    
        public Teclado(boolean ligado){
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
                System.out.println("teclado ligado");
            }else{
                System.out.println("teclado desligado");
            }
        }
    
}
