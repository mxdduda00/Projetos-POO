package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//System.out.println("Olá mundo");
		
		String nome, situacao;
		Double n1, n2, media, af, mf;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite N1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite N2: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2)/2;
		
		if(media >= 6) {
			situacao = "Aprovado";
		}
		else {
			if(media >= 3) {
				situacao = "Recuperação";
				System.out.println("Vai para a " + situacao);
				System.out.println("Digite sua nota da AF: ");
				af = sc.nextDouble();
				
				mf = (af + media)/2;
				
				if (mf >= 5) {
					situacao = "Aprovado na recuperação";
				}
				else {
					situacao = "Reprovado na recuperação";
				}
			}
			else {
				situacao = "Lascado desde sempre";
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("Olá, " + nome);
		System.out.println("Média: " + media);
		System.out.println("Situação: " + situacao);
		System.out.println("------------------------------------");

	}

}