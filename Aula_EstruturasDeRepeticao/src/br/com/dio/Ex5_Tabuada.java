package br.com.dio;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = scan.nextInt();
		
		for ( int i = 1 ; i < 11 ; i++) {
			 System.out.println(tabuada + "x" + i + "=" + (tabuada * i));                                                                                                                                                   
		}

	}

}
