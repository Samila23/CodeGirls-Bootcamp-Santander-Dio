package br.com.dio;

public class Calculadora {
	
	public static void soma(double numero1 , double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("A soma dos n�meros " + numero1 + " + " + numero2 + " � " + resultado);
	}
	
	public static void subtracao(double numero1 , double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("A subtracao dos n�meros " + numero1 + " + " + numero2 + " � " + resultado);
	}
	
	public static void divisao(double numero1 , double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("A divis�o dos n�meros " + numero1 + " + " + numero2 + " � " + resultado);
	}
	
	public static void multiplicacao (double numero1 , double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("A multiplicac�o dos n�meros " + numero1 + " + " + numero2 + " � " + resultado);
	}
}
