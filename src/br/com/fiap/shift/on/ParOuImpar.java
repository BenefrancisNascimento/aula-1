package br.com.fiap.shift.on;
/**
 * Classe responsavel para verificar se um numero eh par ou impar.
 * 
 * 
 * @see System#out
 * 
 * @author Francis
 * 
 * @since 1.0
 * @version 1.1
 *
 */
public class ParOuImpar {

	static final int NUMERO_PARA_TESTE = 1503;

	/**
	 * Este método é o método inicial do programa ParOuImpar. Aqui também estamos
	 * veridicando a divisibiliade de outros número.
	 * 
	 * Nesta aula o professor apresentou o nosso querido MOD. Ou seja o operador %.
	 * Com ele você consegue saber o resto de uma divisão.
	 * 
	 * é o suficiente para sabermos se um número é Par ou Impar. E também para saber
	 * a divisibilidade dos números
	 * 
	 * @param args
	 */
	static public void main(String[] args) {

		if (NUMERO_PARA_TESTE % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		if (NUMERO_PARA_TESTE % 3 == 0) {
			System.out.println("DIVISIVEL POR 3");
		} else {
			System.out.println("NÃO É DIVISIVEL POR TRÊS");
		}

		if (NUMERO_PARA_TESTE % 5 == 0) {
			System.out.println("DIVISIVEL POR 5");
		} else {
			System.out.println("NÃO É DIVISIVEL POR CINCO");
		}

	}

}
