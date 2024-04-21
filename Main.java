import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double largura, comprimento, metroQuadrado, area, preco;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		metroQuadrado = sc.nextDouble();

		area = (largura * comprimento);
		preco = (largura * comprimento * metroQuadrado);

		System.out.printf("A área do terreno é de %.2f%n", area);
		System.out.printf("O preço do terreno é de %.2f", preco);

		sc.close();

	}

}
