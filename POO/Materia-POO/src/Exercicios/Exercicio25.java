package Exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("vetor 1:");
		double[] vetor1 = retornaVetorPopuladoDouble(10);
	
		System.out.println("vetor 2:");
		double[] vetor2 = retornaVetorPopuladoDouble(10);
	
		char[] vetorCaracter = retornaVetorPopuladoChar(10);

		System.out.println("vetor 1 digitado");
		printaVetor(vetor1);
		System.out.println("vetor 2 digitado");
		printaVetor(vetor2);
		System.out.println("vetor de Caracter digitado");
		printaVetor(vetorCaracter);
		
		mostraResultado(vetor1,vetor2,vetorCaracter);
	}
	
	public static void mostraResultado(double[] vetor1, double[] vetor2,char[] caracter) {
		
		int tamanho = vetor1.length == vetor2.length && vetor1.length ==  caracter.length ? vetor1.length: 0;
		
		double[] resultado = new double[tamanho];
 		
		for(int i = 0; i < resultado.length; i++) {
			if(caracter[i] == '+') {
				resultado[i] = vetor1[i] + vetor2[i];
			}
			if(caracter[i] == '*') {
				resultado[i] = vetor1[i] * vetor2[i];
			}
			if(caracter[i] == '/') {
				resultado[i] = vetor1[i] / vetor2[i];
			}
			if(caracter[i] == '-') {
				resultado[i] = vetor1[i] - vetor2[i];
			}
		}
		System.out.println("Resultado:");
		printaVetor(resultado);
	}
	
	
	public static double[] retornaVetorPopuladoDouble(int tamanho) {
		Scanner entrada = new Scanner(System.in);
	
		double [] vetor = new double [tamanho];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("Popule o vetor [" + (i + 1) + "]:");
			vetor[i]= entrada.nextDouble();
		}
		return vetor;
	}
	
	public static char[] retornaVetorPopuladoChar(int tamanho) {
		Scanner entrada = new Scanner(System.in);
	
		char [] vetor = new char [tamanho];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("Popule o vetor com os seguinte caracter + - * / [" + (i + 1) +"]: ");
			vetor[i]= entrada.next().charAt(0);
			
			while(vetor[i] != '+' && vetor[i] != '-' && vetor[i] != '*' && vetor[i] != '/') {
				System.out.println("Caracter Invalido! permitidos: + - * /.");
				System.out.println("Digite novamente: ");
				vetor[i]= entrada.next().charAt(0);
			}
			
		}
		return vetor;
	}
	
	
	public static void printaVetor(double[] vetor) {
		for(double numero : vetor) {
			 System.out.print("| " + numero + " ");
		}
		System.out.println();
	}
	
	public static void printaVetor(char[] vetor) {
		for(char caracter : vetor) {
			System.out.print("|  " + caracter + "  ");
		}
		System.out.println();
	}
}
