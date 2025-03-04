import java.util.Locale;
import java.util.Scanner;

/*
Para marcar uma linha de breakpoint: 
 Run -> Toggle Breakpoint
 
Para iniciar o debug
 Bot�o direito na classe -> Debug -> Java Application

Para executar uma linha: 
 F6
*/
public class debug_eclipse {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();

	}

}
