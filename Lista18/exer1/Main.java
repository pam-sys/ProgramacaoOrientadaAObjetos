package exer1;

public class Main {
    public static void main(String[] args){
        Series serie = new MaisDois();
        Series serie1 = new MaisTres();

        System.out.println("MaisDois");
        System.out.println("5 primeiros valores:");
        for(int i=0; i<5; i++){
            System.out.println(serie.getNext());
        }

        serie.reset();

        System.out.println("apos utilizar o reset");
        for(int i=0; i<5; i++){
            System.out.println(serie.getNext());
        }

        serie.setStart(100);

        System.out.println("serie iniciando em 100");
        for(int i=0; i<5; i++){
            System.out.println(serie.getNext());
        }

        serie.reset();

        System.out.println("repetindo passo 3:");
        for(int i=0; i<5; i++){
            System.out.println(serie.getNext());
        }

        System.out.println("MaisTres");
        System.out.println("5 primeiros valores:");
        for(int i=0; i<5; i++){
            System.out.println(serie1.getNext());
        }

        serie1.reset();

        System.out.println("apos utilizar o reset");
        for(int i=0; i<5; i++){
            System.out.println(serie1.getNext());
        }

        serie1.setStart(100);

        System.out.println("serie iniciando em 100");
        for(int i=0; i<5; i++){
            System.out.println(serie1.getNext());
        }
    }
    
}
