package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome, rua, numero, bairro, complemento, cep, cidade, uf, cpf, nascimento, idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite sua rua: ");
		rua = sc.nextLine();
		
		System.out.println("Digite seu numero: ");
		numero = sc.nextLine();
		
		System.out.println("Digite seu bairro: ");
		bairro = sc.nextLine();
		
		System.out.println("Digite seu complemento: ");
		complemento = sc.nextLine();
		
		System.out.println("Digite seu CEP: ");
		cep = sc.nextLine();
		
		System.out.println("Digite sua cidade: ");
		cidade = sc.nextLine();
		
		System.out.println("Digite seu estado (UF): ");
		uf = sc.nextLine();
		
		System.out.println("Digite seu CPF: ");
		cpf = sc.nextLine();
		
		System.out.println("Digite sua data de nascimento: ");
		nascimento = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + rua + ", " + numero + ", " + bairro + ", " + complemento + ", " + cep + ", " + cidade + " - " + uf);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de nascimento: " + nascimento);
		System.out.println("Idade: " + idade);

	}

}
