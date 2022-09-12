package br.com.fiap.shift.on;

import java.util.Random;

/**
 * Esta classe realiza sorteios
 * 
 * @author Francis
 *
 */
public class Sorteio {

	public static void main(String[] args) {
		Random r = new Random();

		int sorteado = r.nextInt(11);

		System.out.println(sorteado);

	}
}
