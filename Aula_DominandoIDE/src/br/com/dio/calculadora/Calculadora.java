package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		System.out.println(soma);
		int subtracao = subtracao(a,b);
		System.out.println(subtracao);
		int multiplicacao = multiplicacao(a,b);
		System.out.println(multiplicacao);
		double divisao = divisao(a,b);
		System.out.println(divisao);
		

	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static double divisao(int a, int b) {
		return a / b;
	}
}
