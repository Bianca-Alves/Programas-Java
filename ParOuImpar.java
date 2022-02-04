import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = 0;

		System.out.print("Digite um número: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número digitado é par.");
		} else {
			System.out.println("O número digitado é ímpar.");
		}
		ler.close();
	}
}