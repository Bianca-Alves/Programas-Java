import java.util.Scanner;

public class CalculadorIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int anoNasc, anoAtual, idade;
		String resposta;

		resposta = "s";

		while (resposta.contentEquals("s")) {
			System.out.print("Digite seu ano de nascimento: ");
			anoNasc = ler.nextInt();

			System.out.print("Digite o ano atual: ");
			anoAtual = ler.nextInt();

			idade = anoAtual - anoNasc;

			System.out.println("Sua idade é: " + idade + " anos");

			if (idade < 18) {
				System.out.println("Você é menor de idade.");
			} else {
				System.out.println("Você é maior de idade.");
			}
			System.out.println("================================================");
			System.out.println("Deseja calcular a idade de mais uma pessoa?");
			System.out.println("S/N");
			resposta = ler.next();
		}
		System.out.println("=============== Fim do programa ================");
		ler.close();
	}
}