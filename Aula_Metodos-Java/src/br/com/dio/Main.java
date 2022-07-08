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
		
		
		System.out.println("Exercicio Quadrilhatero");
		double areaQuadrado = Quadrilatero.area(3);
		double areaRetangulo = Quadrilatero.area(5d,5d);
		double areaTrapezio = Quadrilatero.area(7,8,9);
		double areaLozango = Quadrilatero.area(2f, 5f);
		
		
		System.out.println("Area do Quadrado " + areaQuadrado );
		System.out.println("Area do Retângulo " + areaRetangulo );
		System.out.println("Area do Trapézio " + areaTrapezio );
		System.out.println("Area do Losango " + areaLozango );
	}
	

}
