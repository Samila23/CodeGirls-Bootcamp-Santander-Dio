package br.com.dio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro("Celta", 2004, 30);
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getAnoFabricacao());
		System.out.println(carro.getCapacidadeTanque());
		
		
		Moto moto = new Moto("Fam", 2014, 15);
		
		System.out.println(moto.getModelo());
		System.out.println(moto.getAnoFabricacao());
		System.out.println(moto.getCapacidadeTanque());
		
		Caminhao caminhao = new Caminhao("Caminhao", 2018, 60);
		
		System.out.println(caminhao.getModelo());
		System.out.println(caminhao.getAnoFabricacao());
		System.out.println(caminhao.getCapacidadeTanque());
	}

}
