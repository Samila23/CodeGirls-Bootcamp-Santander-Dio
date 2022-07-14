package br.com.dio;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int quantidadeNumeros;
		int numero;
		int quantidadeImpar = 0 , quantidadePares = 0;
		System.out.println("Quantidade de números:");
		quantidadeNumeros = scan.nextInt();
		
		
		int count = 0;
		do {
		System.out.println("Número");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			quantidadePares = quantidadePares + 1;
		}
		else quantidadeImpar = quantidadeImpar+ 1;
		
		count = count + 1;
		}while (count < quantidadeNumeros);
		
		System.out.println("Quantidade de números Par: " + quantidadePares);
		System.out.println("Quantidade de números Impar: " + quantidadeImpar);
	}
	
}
