package br.com.dio;

public class Veiculo {
	private String modelo;
	private int capacidadeTanque;
	private int anoFabricacao;
	
	
	public Veiculo(String modelo, int capacidadeTanque, int anoFabricacao) {
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
		this.anoFabricacao = anoFabricacao;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}


	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	
	
	
}
