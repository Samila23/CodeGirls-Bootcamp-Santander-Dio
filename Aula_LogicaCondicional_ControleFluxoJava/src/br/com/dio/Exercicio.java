package br.com.dio;

public class Exercicio {

	public static void main(String[] args) {
		ifFlesha();
		ifSemFlash();
		ifFerias();
		ifMenor();
		switchSemana();
	
	}
	private static void ifFlesha() {
		int mes  = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		}
		else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			}
			else {
				if (mes == 3) {
					System.out.println("Mar�o");
				}
				else {
					if (mes == 4) {
						System.out.println("Abril");
					}
					else {
						if (mes == 5) {
							System.out.println("Maio");
						}
						else {
							if (mes == 6) {
								System.out.println("Junho");
							}
							else {
								if (mes == 7) {
									System.out.println("Junho");
								}
								else {
									if (mes == 8) {
										System.out.println("Agosto");
									}
									else {
										if (mes == 9) {
											System.out.println("Setembro");
										}
										else {
											if (mes == 10) {
												System.out.println("Outubro");
											}
											else {
												if (mes == 11) {
													System.out.println("Novembro");
												}
												else {
													if (mes == 12) {
														System.out.println("Dezembro");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private static void ifSemFlash() {
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		}
		else if (mes == 2) {
			System.out.println("Fevereiro");
		}
		else if (mes == 3) {
			System.out.println("Mar�o");
		}
		else if (mes == 4) {
			System.out.println("Abril");
		}
		else if (mes == 5) {
			System.out.println("Maio");
		}
		else if (mes == 6) {
			System.out.println("Junho");
		}
		else if (mes == 7) {
			System.out.println("Julho");
		}
		else if (mes == 8) {
			System.out.println("Agosto");
		}
		else if (mes == 9) {
			System.out.println("Setembro");
		}
		else if (mes == 10) {
			System.out.println("Outubro");
		}
		else if (mes == 11) {
			System.out.println("Novembro");
		}
		else if (mes == 11) {
			System.out.println("Dezembro");
		}
	}
	
	private static void ifFerias() {
		String mes = "julho";
		
		if ( mes == "julho" || mes == "dezembro" || mes == "janeiro" ) {
			System.out.println("F�rias");
		}
	}
	private static void ifMenor() {
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcion�rio deve receber auxilio");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcion�rio deve receber auxilio");
		}
		
		boolean recebeAuxilio = (salarioBaixo && (muitosDependentes));
		if (recebeAuxilio) {
			System.out.println("Funcion�rio deve receber auxilio");
		}
		else {
			System.out.println("Funcion�rio n�o deve receber auxilio");
		}
	}
	
	public static void switchSemana() {
		String dia = "ter�a";
		switch (dia){
			case "segunda":
				System.out.println("2");
				break;
			case "ter�a":
				System.out.println("3");
				break;
			case "quarta":
				System.out.println("4");
				break;
			case "quinta":
				System.out.println("5");
				break;
			case "sexta":
				System.out.println("6");
				break;
			case "sabado":
				System.out.println("7");
				break;
			case "domingo":
				System.out.println("1");
				break;
			default:
				System.out.println("Dia inv�lido");
		}
	}
}
