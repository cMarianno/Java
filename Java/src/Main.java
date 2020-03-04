import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		RegraINSS regra = new RegraINSS();

		int idade, sexo;

		System.out.println("\n\n");

		System.out.print("Sua idade: ");
		idade = entrada.nextInt();

		System.out.println("\n\n HOMEM - 1     MULHER - 2");

		System.out.print("Seu sexo: ");
		sexo = entrada.nextInt();

		System.out.println("\n\n Relatório ****** ");

		if (regra.aposentado(idade, sexo) == true)
			System.out.println("LIBERADO!");
		else {
			System.out.println("PENDENTE!");
			System.out.println("Falta(m) " + regra.pendencia(idade, sexo));
		}
	}
}
