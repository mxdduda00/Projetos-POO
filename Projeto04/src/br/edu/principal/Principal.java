package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		dia = sc.nextInt();
		
		//ELSE IF
		System.out.println("Usando IF-ELSE");
		if (dia == 1) {
			System.out.println("Domingo");
		}
		else if (dia == 2) {
			System.out.println("Segunda");
		}
		else if (dia == 3) {
			System.out.println("Terça");
		}
		else if (dia == 4) {
			System.out.println("Quarta");
		}
		else if (dia == 5) {
			System.out.println("Quinta");
		}
		else if (dia == 6) {
			System.out.println("Sexta");
		}
		else if (dia == 7) {
			System.out.println("Sábado");
		}
		else {
			System.out.println("Dia da semana não existe");
		}
		
		//Switch-case
		System.out.println("Usando SWITCH-CASE padrão");
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia da semana inexistente");
		}
		
		//Switch-case Expression
		System.out.println("Usando SWITCH STATEMENT");
		switch (dia) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda");
		case 3 -> System.out.println("Terça");
		case 4 -> System.out.println("Quarta");
		case 5 -> System.out.println("Quinta");
		case 6 -> System.out.println("Sexta");
		case 7 -> System.out.println("Sábado");
		default -> System.out.println("Esse dia da semana não existe!");
		}

	}

}
