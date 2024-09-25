import bootcamp.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso da linguagem Java");
        curso.setCargaHoraria(40);

        Curso cursoJS = new Curso();

        cursoJS.setTitulo("Curso JavaScript");
        cursoJS.setDescricao("Curso da linguagem JavaScript");
        cursoJS.setCargaHoraria(20);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria das aulas do Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(cursoJS);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria);

        Developers devYan = new Developers();

        devYan.inscreverBootcamp(bootcamp);

        devYan.setNome("Yan");
        System.out.println("Conteudos inscritos Yan: " + devYan.getConteudosInscritos());

        Developers devMarcia = new Developers();
        devMarcia.inscreverBootcamp(bootcamp);
        devMarcia.setNome("Marcia");
        System.out.println("Conteudos inscritos Marcia: " + devMarcia.getConteudosInscritos());

    }
}