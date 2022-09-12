package br.com.fiap.shift.on;

import java.util.Random;
import java.util.Scanner;

public class EscondeEsconde {

	public static void main(String[] args) {

		Random r = new Random();
		int oculto = r.nextInt(2);

		Scanner sc = new Scanner(System.in);

		System.out.println("Descubra o número sorteado [0-99]: ");
		int chute = sc.nextInt();

		int condicao = chute - oculto;

		while (oculto != chute) {
			if (condicao > 0) {
				System.out.println("Menor");
				System.out.println("Tente novamente: ");
				chute = sc.nextInt();
			} else if (condicao < 0) {
				System.out.println("Maior");
				System.out.println("Tente novamente: ");
				chute = sc.nextInt();
			}
		}

		System.out.println("Parabéns!!!\nO número oculto é: " + oculto);
		sc.close();
	}
}
