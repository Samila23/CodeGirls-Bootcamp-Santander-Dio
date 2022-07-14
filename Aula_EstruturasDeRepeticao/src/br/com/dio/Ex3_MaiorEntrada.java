package br.com.dio;

import java.util.Scanner;

public class Ex3_MaiorEntrada {
	/*
	 Faça um programa que leia 05 numeros e infomre o maior número e a média, desses números.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int numero;
		int maior = 0;
		int count = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um número");
			numero = scan.nextInt();
			count = count + 1;
			
			soma = soma + numero;
			
			if (numero > maior ) {
				maior = numero;
			}
			
		} while (count < 5);
		
		System.out.println("O maior número é : " + maior);
		System.out.println("A soma dos números é : " + soma);
		System.out.println("A média dos números é : " + (soma/5));
	}

}
