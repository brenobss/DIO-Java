package application;

import java.time.LocalDate;

import model.dominio.Bootcamp;
import model.dominio.Dev;
import model.dominio.impl.Curso;
import model.dominio.impl.Mentoria;

public class Main {

    public static void main(String[] args) {
	
	Curso cursoJava = new Curso("Java", "Curso de java", 56);
	
	Curso cursoPHP = new Curso();
	cursoPHP.setTitulo("php");
	cursoPHP.setDescricao("Curso de php");
	cursoPHP.setCargaHoraria(45);
	
	Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Mentoria de Java suporte a OO", LocalDate.of(2022, 02, 28));
	
	Bootcamp bootcampJava = new Bootcamp("Java", "Bootcamp Java Developer");
	bootcampJava.getConteudos().add(cursoJava);
	bootcampJava.getConteudos().add(mentoriaJava);
	
	Bootcamp bootcampPHP = new Bootcamp("PHP", "Bootcamp PHP developer");
	bootcampPHP.getConteudos().add(cursoPHP);
	
	Dev devPaulo = new Dev("Paulo");
	
	devPaulo.inscreverBootcamp(bootcampJava);
	devPaulo.progredir();
	devPaulo.progredir();
	
	System.out.println(devPaulo);
	
	Dev devMarcia = new Dev("Marcia");
	devMarcia.inscreverBootcamp(bootcampPHP);
	devMarcia.progredir();
	devMarcia.progredir();
	
	System.out.println(devMarcia);
    }

}
