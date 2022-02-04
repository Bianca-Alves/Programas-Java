public class MatrizNotaAlunos {

	public static void main(String[] args) {
		double notasAlunos[][] = new double[3][4];
		String nomes[] = { "Pedro", "Maria", "João" };

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (int l = 0; l < notasAlunos.length; l++) {
			System.out.println("");
			System.out.println(nomes[l]);
			for (int c = 0; c <= notasAlunos.length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		}
	}
}