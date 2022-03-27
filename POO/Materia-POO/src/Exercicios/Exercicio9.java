package Exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite a base para a potenciação: ");
		int x = entrada.nextInt();

		System.out.println("Digite o expoente: ");
		int y = entrada.nextInt();
		
		System.out.println(x + " Elevado a "+ y + " = "+calculaPotenciacao(x,y));
	}
	
	public static int calculaPotenciacao(int base, int expoente) {
		
		int resultado = base;
		
		for (int i = 1; i < expoente; i++) {
			resultado *= base;
		}
		
		return resultado;
	}

}
