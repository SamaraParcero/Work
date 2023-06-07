package jogodasenha;

import java.util.Scanner;

import java.util.Random;

public class jogodasenha {
    public static void main(String[] args) {
		int [] senha = new int[4];
		int [] digitos = new int[4];
		randomizar(senha);
		receber(digitos);
		comparar1(senha, digitos);
		comparar2(senha, digitos);
		
	    
	}
    public static void randomizar(int[] senha) {
    	Random rand = new Random();
    	for (int i=0; i<senha.length;i++) {
    		senha[i]= rand.nextInt(6);
    		System.out.println(senha[i]);
    	}
    }
    public static void receber(int[] digitos) {
    Scanner scan= new Scanner(System.in);
    	for(int i=0; i<digitos.length; i++) {
    		digitos[i]= scan.nextInt();
    		
    	}
    	scan.close();
    }
    public static void comparar1(int [] senha, int [] digitos) {
    	int contp=0;
    	for (int i=0; i<senha.length; i++) {
    		if (senha[i]== digitos[i]) {
    			contp++;
    			
    		}
 
    	}
    	System.out.println("Digitos corretos: " + contp);
    }
    public static void comparar2(int [] senha, int [] digitos) {
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
       
      }
  }
