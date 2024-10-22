package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double  n1, n2, m;
		String nome, curso, disciplina;
		int idade, ano, semestre;
		
		System.out.print("Digite o nome de um aluno: ");
		nome =scanner.next();

		System.out.print("Digite a idade do aluno: ");
		idade =scanner.nextInt();
		
		System.out.print("Digite o ano em que o aluno está estudando: ");
		ano =scanner.nextInt();
		
		System.out.print("Digite o curso do aluno: ");
		curso =scanner.next();
		
		System.out.print("Digite a disciplina do aluno: ");
		disciplina  = scanner.next();
		
		System.out.print("Digite o semestre do aluno: ");
		semestre  =scanner.nextInt();

		System.out.print("Digite a nota da N1: ");
		n1 =scanner.nextDouble();
		
		System.out.print("Digite a nota da N2: ");
		n2 =scanner.nextDouble();
		
		m = (n1*2 + n2*3)/5;
		
		String resultado = (m >= 6)?"aprovado":"reprovado";
		
		System.out.print("A média final foi: " + m);
		System.out.print("O resultado do aluno foi:" + resultado);
		
		
	}
}