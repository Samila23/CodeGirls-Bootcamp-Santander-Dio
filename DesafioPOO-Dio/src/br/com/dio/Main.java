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
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Code Girls");
		bootcamp.setDescricao("Descrição Bootcamp Code Girls");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Dev devSamila = new Dev();
		devSamila.setNome("Sâmila");
		devSamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Sâmila" + devSamila.getConteudosInscritos());
		devSamila.progredir();
		devSamila.progredir();
		System.out.println("Conteudos Inscritos Sâmila" + devSamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Sâmila" + devSamila.getConteudosConcluidos());
		System.out.println("XP: " + devSamila.calcularTotalXP());
		
		Dev devMilena = new Dev();
		devMilena.setNome("Milena");
		devMilena.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Milena" + devMilena.getConteudosInscritos());
		devMilena.progredir();
		System.out.println("Conteudos Inscritos Milena" + devMilena.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Milena" + devMilena.getConteudosConcluidos());
		System.out.println("XP: " + devMilena.calcularTotalXP());
	}

}
