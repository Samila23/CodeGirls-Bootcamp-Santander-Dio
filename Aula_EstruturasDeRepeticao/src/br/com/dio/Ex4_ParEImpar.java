package br.com.dio;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int quantidadeNumeros;
		int numero;
		int quantidadeImpar = 0 , quantidadePares = 0;
		System.out.println("Quantidade de n�meros:");
		quantidadeNumeros = scan.nextInt();
		
		
		int count = 0;
		do {
		System.out.println("N�mero");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			quantidadePares = quantidadePares + 1;
		}
		else quantidadeImpar = quantidadeImpar+ 1;
		
		count = count + 1;
		}while (count < quantidadeNumeros);
		
		System.out.println("Quantidade de n�meros Par: " + quantidadePares);
		System.out.println("Quantidade de n�meros Impar: " + quantidadeImpar);
	}
	
}
