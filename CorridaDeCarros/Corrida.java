package CorridaDeCarros;

public class Corrida {
	public static void main(String[] args) {
		
		CodCarro carrinho = new CodCarro(0, 0);
		CodCarro carrinho2 = new CodCarro(0, 0);
		Pista pi = new Pista(100);
		int[] distanciaTotal = new int[100];
		
		try {
		while (carrinho.getDistancia() < distanciaTotal.length && carrinho2.getDistancia() < distanciaTotal.length) {
		carrinho.randomizarVelocidade();
		carrinho2.randomizarVelocidade();
		carrinho.setDistancia(carrinho.getDistancia() + carrinho.getVelocidade());
		carrinho2.setDistancia(carrinho2.getDistancia() + carrinho2.getVelocidade());
		pi.posicoesPista(carrinho, carrinho2);
		
		}
	} catch (ArrayIndexOutOfBoundsException e) {
		if (carrinho.getDistancia()>= distanciaTotal.length && carrinho.getDistancia() > carrinho2.getDistancia()) {
			System.out.println("O carrinho 1 ultrapassou a linha de chegada e venceu!");
			System.out.println("Carrinho 1 ganhou com distância: " + carrinho.getDistancia());
			System.out.println("Carrinho 2 perdeu com distância: " + carrinho2.getDistancia());
		} else if (carrinho2.getDistancia()>= distanciaTotal.length && carrinho2.getDistancia() > carrinho.getDistancia()) {
			System.out.println("O carrinho 2 ultrapassou a linha de chegada e venceu!");
			System.out.println("Carrinho 1 perdeu com distância: " + carrinho.getDistancia());
			System.out.println("Carrinho 2 ganhou com distância: " + carrinho2.getDistancia());
		} else if (carrinho.getDistancia() == carrinho2.getDistancia()){
			System.out.println("Os carrinhos ultrapassaram a linha de chegada juntos!");

		}
	 }
		
	}

}
