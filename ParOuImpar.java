import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = 0;

		System.out.print("Digite um n�mero: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O n�mero digitado � par.");
		} else {
			System.out.println("O n�mero digitado � �mpar.");
		}
		ler.close();
	}
}