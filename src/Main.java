import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curse;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){

        Mentoria mentor1 =new Mentoria("Matheus","mamamamam@gmail.com");
        Mentoria mentor2 =new Mentoria("Miguel","mamamamam@gmail.com");


        Curse Java2023 = new Curse("Java2023","Top",87,mentor1);
        Curse JavaScript2023 = new Curse("JavaScript2023","Menus Top",87,mentor2);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootcMP2023");
        bootcamp.setDescricao("top Demais");
        bootcamp.getConteudos().add(Java2023);
        bootcamp.getConteudos().add(JavaScript2023);
        bootcamp.getConteudos().add(mentor1);
        System.out.println("====================================");
        System.out.println("====================================");

        Dev matheus = new Dev();
        matheus.inscreverBootcamp(bootcamp);
        matheus.setNome("matheus");
        System.out.println("Conteudos inscritos" + matheus.getConteudosIncritos());
        matheus.progredir();
        System.out.println("Conteudos inscritos" + matheus.getConteudosIncritos());
        System.out.println("Conteudos concluidos" + matheus.getConteudosConcluidos());
        System.out.println("XP total:" + matheus.calcularTotalXP());
        matheus.progredir();
        System.out.println("XP total:" + matheus.calcularTotalXP());
        System.out.println("====================================");
        Dev miguel = new Dev();
        miguel.setNome("miguel");
        miguel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + miguel.getConteudosIncritos());
          miguel.progredir();
        System.out.println("Conteudos inscritos" + miguel.getConteudosIncritos());
        System.out.println("Conteudos concluidos" + miguel.getConteudosConcluidos());
        System.out.println("XP total:" + miguel.calcularTotalXP());
    }
}
