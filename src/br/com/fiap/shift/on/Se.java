package br.com.fiap.shift.on;
import java.util.Scanner;

public class Se {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		String nome = scanner.nextLine();

		System.out.println("Informe o ano em que você nasceu: ");
		int anoNascimento = scanner.nextInt();

		int resultado = 2022 - anoNascimento;

		if (resultado >= 18) {
			System.out.println("Nome: " + nome + "  idade: " + resultado + " você pode dirigir");
		} else if (resultado > 16) {
			System.out.println("Nome: " + nome + "  idade: " + resultado + " você pode votar");
		} else {
			System.out.println("Você é totalmente incapaz");
		}
		
		scanner.close();
	}

}
