package br.com.dio;

import java.util.Scanner;

public class Ex3_MaiorEntrada {
	/*
	 Fa�a um programa que leia 05 numeros e infomre o maior n�mero e a m�dia, desses n�meros.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int numero;
		int maior = 0;
		int count = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um n�mero");
			numero = scan.nextInt();
			count = count + 1;
			
			soma = soma + numero;
			
			if (numero > maior ) {
				maior = numero;
			}
			
		} while (count < 5);
		
		System.out.println("O maior n�mero � : " + maior);
		System.out.println("A soma dos n�meros � : " + soma);
		System.out.println("A m�dia dos n�meros � : " + (soma/5));
	}

}
