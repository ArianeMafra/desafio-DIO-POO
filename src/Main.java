import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Dominando IDEs Java");
        curso1.setDescricao("Aprendendo a utilizar Eclipse, IntelliJ e VSCode para programar em Java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Introdução ao Java");
        curso2.setDescricao("Aprendendo variáveis, tipos de dados e operadores matemáticos em Java");
        curso2.setCargaHoraria(2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Pensamento computacional e orientação a objetos");
        mentoria1.setDescricao("Desenvolvendo o seu pensamento computacional com orientação a objetos");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Trilha de desenvolvimento Java com Spring Framework");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAriane = new Dev();
        devAriane.setNome("Ariane");
        devAriane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Ariane:" + devAriane.getConteudosInscritos());

        devAriane.progredir();
        devAriane.progredir();
        System.out.println("Progredindo ....");
        System.out.println("Conteúdos Inscritos de Ariane:" + devAriane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Ariane:" + devAriane.getConteudosConcluidos());
        System.out.println("XP: " +  devAriane.calcularTotalXP());


        System.out.println("*************************************************");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        System.out.println("Progredindo ....");
        System.out.println("Conteúdos Inscritos de Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " +  devCamila.calcularTotalXP());

    }
}
