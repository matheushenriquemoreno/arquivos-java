package Exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite sua senha: ");
		int senhaAtual = entrada.nextInt();
		
		System.out.println("digite a senha informada: ");
		int senhaDigitada = entrada.nextInt();
		while(senhaAtual != senhaDigitada) {
			System.out.println("Senha incorreta, tente novamente");
			System.out.println("digite a senha informada: ");
			senhaDigitada = entrada.nextInt();
		}

		System.out.println("Senha correta! Bem-vindo ao sistema");
	}
}