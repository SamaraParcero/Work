package CorridaDeCarros;

import java.util.Random;

public class CodCarro {
    	private int velocidade;
	private int distancia;
	
	public CodCarro(int velocidade, int distancia) {
		this.velocidade = velocidade = 0;
		this.distancia = distancia = 0;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public int randomizarVelocidade() {
		Random rand = new Random();
		
		return velocidade = rand.nextInt(1,4);
	}
}
