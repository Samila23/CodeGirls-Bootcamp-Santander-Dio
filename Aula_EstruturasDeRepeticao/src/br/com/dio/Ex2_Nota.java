package br.com.dio;

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		/*
		 	Fa�a um programa que pe�a uma notaa, entre 0 de 10.
		 	Mostre uma mensagem, caso o valor seja inv�lido, e continue pedindo at� que o usu�rio 
		 	informe um valor v�lido.
		 */
		
		Scanner scan = new Scanner (System.in);
		int nota;
		
		System.out.println("Nota:");
		nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida, digite novamente");
			
			System.out.println("Nota:");
			nota = scan.nextInt();
		}
	}
}
