package Exercicios;

public class Exercicio14 {

	public static void main(String[] args) {
		 
		String desejaSair, nomeMaiorMedia ="", nomeMenorMedia ="";
		int contadorAlunos = 0, contadorAprovados = 0, cotadorReprovados = 0, contadorExame = 0;
		double mediaClasse = 0, maiorMedia = 0, menorMedia = 0;

		do {
			contadorAlunos++;
			System.out.println("digite o nome do aluno: ");		
			String nome = UtilExercicios.entrada.next();
			
			System.out.println("Digite sua nota: ");
			double nota1 = UtilExercicios.verificaNota(UtilExercicios.entrada.nextDouble());
					
			System.out.println("Digite sua nota: ");
			double nota2 = UtilExercicios.verificaNota(UtilExercicios.entrada.nextDouble());
			
			double mediaAritimedica = (nota1 + nota2) / 2;
			
			mediaClasse += mediaAritimedica;
			
			// inicializo as variaveis.
			if(maiorMedia == 0 && menorMedia == 0) {
				maiorMedia = mediaAritimedica;
				menorMedia = mediaAritimedica;
				nomeMaiorMedia = nome;
				nomeMenorMedia = nome;
			}
			if(mediaAritimedica > maiorMedia) {
				maiorMedia = mediaAritimedica;
				nomeMaiorMedia = nome;
			}
			else if(mediaAritimedica < menorMedia) { 
				menorMedia = mediaAritimedica;
				nomeMenorMedia = nome;
			}
	
			System.out.println("Media das duas notas lidas " + mediaAritimedica);
			
			if(mediaAritimedica >= 7) {
				System.out.println("Parabens voc� foi Aprovado!");
				contadorAprovados ++;
			}
			else if(mediaAritimedica > 3 && mediaAritimedica < 7) {
				System.out.println("voc� ficou de Exame!");
				contadorExame++;
			}
			else {
				System.out.println("Reprovado!");
				cotadorReprovados++;
			}
			
			System.out.println("Deseja Sai?(sim, n�o)");
			desejaSair = UtilExercicios.entrada.next();
			
		} while(!desejaSair.equals("sim"));
		
		System.out.println("Relatorio das inser��es de nota: ");
		System.out.println("Quantidade de alunos Digitados: " + contadorAlunos);
		System.out.println("Quantidade de alunos Aprovados: " + contadorAprovados);
		System.out.println("Quantidade de alunos de Exame: " + contadorExame);
		System.out.println("Quantidade de alunos Reprovado: " + cotadorReprovados);
		System.out.println("Media da classe: " + mediaClasse);
		System.out.println("nome do aluno com maior media " + nomeMaiorMedia + " media do aluno " + maiorMedia);
		System.out.println("nome do aluno com menor media " + nomeMenorMedia + " media do aluno " + menorMedia);

	}
}
