import java.util.Scanner;

public class ProgramaNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = 0;

		System.out.print("Digite um n�mero: ");
		numero = ler.nextInt();

		if (numero < 0) {
			System.out.println("O n�mero digitado � negativo.");
		} else {
			System.out.println("O n�mero digitado n�o � negativo.");
		}
		ler.close();
	}
}