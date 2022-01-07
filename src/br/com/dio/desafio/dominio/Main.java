package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		 
		System.out.println("***********Lista de Cursos*****************\n");
		Curso curso1 = new Curso();
		Curso curso2=new Curso();
		Curso curso3 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(28);
		
		curso2.setTitulo("curso java POO");
		curso2.setDescricao("descrição curso java POO");
		curso2.setCargaHoraria(8);
		
		curso3.setTitulo("curso javaScript");
		curso3.setDescricao("descrição curso javaScript");
		curso3.setCargaHoraria(18);
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
		System.out.println("--");
		
		Mentoria mentoria1=new Mentoria();
		Mentoria mentoria2=new Mentoria();
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());//imprime a data da criação
		
		mentoria2.setTitulo("Mentoria de JavaScript");
		mentoria2.setDescricao("descrição mentoria javaScript");
		mentoria2.setData(LocalDate.now());//imprime a data da criação
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1=new Dev();
		dev1.setNome("Ana Maria");
		dev1.inscreverBootcamp(bootcamp);
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos:" + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos Concluidos:" + dev1.getConteudosConcluidos());
		System.out.println("XP:"+dev1.calcularTotalXp());
		
		Dev dev2=new Dev();
		dev2.setNome("Anderson Silva");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos:" + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos Concluidos:" + dev2.getConteudosConcluidos());
		System.out.println("XP:"+dev2.calcularTotalXp());

		
		
		
			
	}

}
