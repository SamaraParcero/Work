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
		if (carrinho.getDistancia()> distanciaTotal.length) {
			System.out.println("O carrinho 1 ultrapassou a linha de chegada e venceu!");
		} else if (carrinho2.getDistancia()> distanciaTotal.length) {
			System.out.println("O carrinho 2 ultrapassou a linha de chegada e venceu!");
		} else {
			System.out.println("Os carrinhos ultrapassaram a linha de chegada juntos!");
		}
	 }
		
	}
}
