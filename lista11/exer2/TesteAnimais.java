package exer2;

public class TesteAnimais {
    public static void main(String[] args){
        Animal[] animais = new Animal[3];
        animais[0]=new Cachorro();
        animais[1]=new Gato();
        animais[2]=new Preguica();

         for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
