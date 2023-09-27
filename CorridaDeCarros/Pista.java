package CorridaDeCarros;

public class Pista {
    private int comprimento;

    public Pista(int comprimento) {
        this.comprimento = comprimento;
    }

    public void posicoesPista(CodCarro carrinho1, CodCarro carrinho2) {
        String[] pista1 = new String[comprimento];
        String[] pista2 = new String[comprimento];

        
        for (int i = 0; i < comprimento; i++) {
            pista1[i] = " ";
            pista2[i] = " ";
        }

        
        pista1[carrinho1.getDistancia()] = "#";
        pista2[carrinho2.getDistancia()] = "#";

       
       
        System.out.print("|");
        for (String c : pista1) {
            System.out.print(c);
        }
        System.out.println("|");

        
        System.out.print("|");
        for (String c : pista2) {
            System.out.print(c);
        }
        System.out.println("|");
        System.out.print("|");
        for (int i = 0; i < comprimento; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }
}
