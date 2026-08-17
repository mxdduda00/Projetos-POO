package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//System.out.println("Olá mundo");
		
		String nome;
		Double n1, n2, media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Digite N1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite N2: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2)/2;
		
		System.out.println("Nome: " + nome + " | Sua média foi " + media);

	}

}
