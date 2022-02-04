import java.util.Scanner;

public class ProgramaNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = 0;

		System.out.print("Digite um número: ");
		numero = ler.nextInt();

		if (numero < 0) {
			System.out.println("O número digitado é negativo.");
		} else {
			System.out.println("O número digitado não é negativo.");
		}
		ler.close();
	}
}