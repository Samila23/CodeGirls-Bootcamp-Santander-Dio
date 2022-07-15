package br.com.dio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao Curso Java");
		curso1.setCargaHoraria(8);
		
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descricao Curso JavaScript");
		curso2.setCargaHoraria(8);
		
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria JavaScript");
		mentoria1.setDescricao("Descricao Mentoria JavaScript");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1);
	}

}
