import br.com.dio.desafio.dominio.Curse;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){

        Mentoria mentor1 =new Mentoria("Matheus","mamamamam@gmail.com");
        Mentoria mentor2 =new Mentoria("Miguel","mamamamam@gmail.com");


        Curse Java2023 = new Curse("Java2023","Top",87,mentor1);
        Curse JavaScript2023 = new Curse("JavaScript2023","Menus Top",87,mentor2);
        System.out.println(Java2023);
        System.out.println(JavaScript2023);
    }
}
