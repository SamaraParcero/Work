package jogodasenha;

import java.util.Scanner;

import java.util.Random;

public class jogodasenha {
    public static void main(String[] args) {
		int vidas = 10;
		int [] senha = new int[4];
		int [] digitos = new int[4];
		randomizar(senha);
		Scanner scan = new Scanner(System.in);
		while (vidas!= 0 ) {
		receber(scan,digitos);
		if(comparar1(senha, digitos) == 4) {
			System.out.println("Você ganhou!");
			System.exit(0);
		}
		comparar2(senha, digitos);
		vidas--;
		System.out.println("Vidas = "+vidas);
		if(vidas == 0) {
			System.out.println("Game Over! O computador ganhou!");
		}
		  }
		  scan.close();
		}
    public static void randomizar(int[] senha) {
    	Random rand = new Random();
    	for (int i=0; i<senha.length;i++) {
    		senha[i]= rand.nextInt(6)+1;
    		System.out.print(senha[i]);
    	}
    	System.out.println("\n");
    }
    public static void receber(Scanner scan, int[] digitos) {
    	for(int i=0; i<digitos.length; i++) {
    		digitos[i]= scan.nextInt();
    		if(digitos[i] >= 7 || digitos[i] <= 0) {
    			System.out.println("O número deve ser de 1 a 6. \nPrograma finalizado.");
    			System.exit(0);
    		}
    	}
    }
    public static int comparar1(int [] senha, int [] digitos) {
    	int contp=0;
    	for (int i=0; i<senha.length; i++) {
    		if (senha[i]== digitos[i]) {
    			contp++;			
    		}
    	}
    	System.out.println("Digitos corretos: " + contp);
    	return contp;
    }
    public static int comparar2(int [] senha, int [] digitos) {
    	int contp=0;
    	for (int i=0; i<senha.length; i++) {
    		if (senha[i] != digitos[i] ){
    			for (int j = 0; j < senha.length; j++) {
                    if (senha[j] == digitos[i] && senha[i] != digitos[i]) {
                    	contp++;
                        break;
    		 }
    			
    			}
    	      }
    		}
    	System.out.println("Digitos deslocados: " + contp);
    	return contp;
      }
  }
