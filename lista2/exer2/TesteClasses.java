package lista2.exer2;

public class TesteClasses {

    public static void main(){
        Universidade a1  = new Universidade();
        a1.nome = "Unicentro";
        a1.estado = "Parana";
        a1.cidade = "Guarapuava";
        a1.ExibeDados();

        Aluno a2 = new Aluno();
        a2.nome = "Breno";
        a2.curso = "mac";
        a2.ExibeDados();

        Universidade a3  = new Universidade();
        a3.nome = "Unicentro";
        a3.estado = "Parana";
        a3.cidade = "Guarapuava";
        a3.ExibeDados();

        Aluno a4 = new Aluno();
        a4.nome = "Pamela";
        a4.curso = "mac";
        a4.ExibeDados();
        
    
    }
}
