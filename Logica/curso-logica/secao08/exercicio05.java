package secao08;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
     // variaveis
		int[] vetor = new int[10];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		for (int i = 0; i < 10; i++) {
			System.out.printf("informe o valor para o vetor %d/10\n", (i+1));
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("o numero %d est� na posi��o %d\n", vetor[i],i);
			  tem_maior_50 = true;
			}
			if(!tem_maior_50) {
				System.out.println("n�o existe nenhum numero maior que 50");
			}
		}
		teclado.close();
	}

}
