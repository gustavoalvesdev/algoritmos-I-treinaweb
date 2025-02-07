package br.com.treinaweb.algoritmos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("\nDigite o %dº número: ", (i + 1));
			numeros[i] = entrada.nextInt();
		}
		
		entrada.close();
		
		System.out.println("Números Digitados");
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

}
