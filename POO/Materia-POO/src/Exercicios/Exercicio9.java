package Exercicios;

public class Exercicio9 {

	public static void main(String[] args) {
		System.out.println(calculaPotenciacao(3,3));
	}
	
	public static int calculaPotenciacao(int base, int expoente) {
		
		int resultado = base;
		
		for (int i = 1; i < expoente; i++) {
			resultado = base * resultado ;
		}
		
		return resultado;
	}

}
