package Exercicios;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int numero;
		
		do {
		System.out.println("Digite um numero para fatora��o: ");
		 numero = UtilExercicios.entrada.nextInt();
		} while(numero < 0);
		
		System.out.println("O fatorial de " + numero + " = " + calculaFatorial(numero));
		 
	}	
	
	public static int calculaFatorial(int numero) {
		
		int resultado = 1;
		
		for(int i = 1; i <= numero ; i++) {
			resultado *= i;
		}
		
		return resultado;
	}	
}
