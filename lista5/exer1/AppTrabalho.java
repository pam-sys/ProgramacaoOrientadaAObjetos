public class AppTrabalho{
    public static void main(String[] args){
        Dispositivo dispositivo1 = new Dispositivo(1, "notbook");
        Dispositivo dispositivo2 = new Dispositivo(2, "desktop");

        Usuario usuario1 = new Usuario(1, "Breno");
        Usuario usuario2 = new Usuario(2, "Pamela");

        usuario1.setDispositivo(dispositivo1);
        usuario1.trabalhar();
        usuario2.setDispositivo(dispositivo2);
        usuario2.trabalhar();
    }
}