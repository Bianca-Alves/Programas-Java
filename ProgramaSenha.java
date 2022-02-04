import java.util.Scanner;

public class ProgramaSenha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int senha;

		System.out.print("Digite a senha: ");
		senha = ler.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida");
			System.out.print("Digite a senha: ");
			senha = ler.nextInt();
		}
		System.out.println("Acesso permitido");
		ler.close();
	}
}