package br.com.dio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Exercicio Calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		
		
		System.out.println("Exercicio Mensagem");
		Mensagem.obterMenssagem(9);
		Mensagem.obterMenssagem(14);
		Mensagem.obterMenssagem(17);
		
		System.out.println("Exercicio Emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}
	

}
