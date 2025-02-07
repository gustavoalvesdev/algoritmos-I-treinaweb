package br.com.treinaweb.algoritmos;

import java.util.Scanner;

public class DesafioPaises {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int tamanho = Integer.parseInt(scann.nextLine());
		
		String[] paises = new String[tamanho];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = scann.nextLine();
		}
		
		scann.close();
		
		for (String pais : paises) {
			System.out.print(pais + " ");
		}
		
		
	}
}
