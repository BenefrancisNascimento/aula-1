package br.com.fiap.shift.on;

public class Tipos {

	public static void main(String[] args) {

		// variáveis para números inteiros.
		byte tamanhoMinimoByte = Byte.MIN_VALUE;
		byte tamanhoMaximoByte = Byte.MAX_VALUE;
		short tamanhoMinimoShort = Short.MIN_VALUE;
		short tamanhoShort = Short.MAX_VALUE;
		int tamanhoMinimoInt = Integer.MIN_VALUE;
		int tamanhoInt = Integer.MAX_VALUE;
		long tamanhoMinimoLong = Long.MIN_VALUE;
		long tamanhoLong = Long.MAX_VALUE;

		// Números de ponto flutuante
		float tamanhoMinimoFloat = Float.MIN_VALUE;
		float tamanhoMaximoFloat = Float.MAX_VALUE;
		double tamanhoMinimoDouble = Double.MIN_VALUE;
		double tamanhoMaximoDouble = Double.MAX_VALUE;

		boolean verdadeiro = true; // ou false se não for iniciado false é o valor padrão.
		char caractere = 'a';

		String texto = "Este aqui recebe textos";

		System.out.println("***********     INTEIROS    ***************************************");
		System.out.println("O byte cabe de: " + tamanhoMinimoByte + " até: " + tamanhoMaximoByte);
		System.out.println("short  cabe de: " + tamanhoMinimoShort + " até: " + tamanhoShort);
		System.out.println("int cabe de: " + tamanhoMinimoInt + " até: " + tamanhoInt);
		System.out.println("long cabe de: " + tamanhoMinimoLong + " até: " + tamanhoLong);

		System.out.println("****************   REAIS   ****************************************");
		System.out.println("O float cabe de: " + tamanhoMinimoFloat + " até: " + tamanhoMaximoFloat);
		System.out.println("O double cabe de: " + tamanhoMinimoDouble + " até: " + tamanhoMaximoDouble);

	}

}