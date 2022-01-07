package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		 
		Curso curso1 = new Curso();
		Curso curso2=new Curso("Estrutura de dados com Java","Entendendo estrutura de dados", 20);
		Curso curso3 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(28);
		
		curso3.setTitulo("curso javaScript");
		curso3.setDescricao("descrição curso javaScript");
		curso3.setCargaHoraria(18);
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
		
		Mentoria mentoria1=new Mentoria();
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());//imprime a data da criação
		
		System.out.println(mentoria1);
		
		
			
	}

}
