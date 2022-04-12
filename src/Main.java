import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Programação com Java");
        curso1.setDescricao("Ensina programação com a linguagem Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria curso Java");
        mentoria1.setDescricao("Auxiliar e acompanhar os alunos do curso de Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Curso de programador Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Buzz");

        Dev dev2 = new Dev();
        dev2.setNome("Zurg");

        System.out.println(dev1.getNome() + " inscrito em: " + dev1.getConteudosInscritos());
        System.out.println(dev1.getNome() + " inscrito em: " + dev1.getConteudosInscritos());

        System.out.println();
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(dev1.getNome() + " inscrito em: " + dev1.getConteudosInscritos());
        System.out.println(dev1.getNome() + " inscrito em: " + dev1.getConteudosInscritos());

        System.out.println();
        System.out.println(dev1.getNome() + " conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println(dev2.getNome() + " conteudos concluidos: " + dev2.getConteudosConcluidos());

        dev1.progredir();
        dev2.progredir();

        System.out.println();
        System.out.println(dev1.getNome() + " conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println(dev2.getNome() + " conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println();
        System.out.println(dev1.getNome() + " inscrito em: " + dev1.getConteudosInscritos());
        System.out.println(dev1.getNome() + " inscrito em: " + dev1.getConteudosInscritos());
        System.out.println();
        System.out.println(dev1.getNome() + " XP: " + dev1.calcularTotalXp());
        System.out.println(dev2.getNome() + " XP: " + dev2.calcularTotalXp());

    }

}
