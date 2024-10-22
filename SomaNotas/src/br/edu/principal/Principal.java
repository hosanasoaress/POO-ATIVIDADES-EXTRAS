package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double n1, n2, m;
		
		System.out.print("Digite a nota da N1: ");
		n1 = scanner.nextDouble();
		System.out.print("Digite a nota da N2: ");
		n2 = scanner.nextDouble();
		m = (n1*2 + n2*3)/5;
		System.out.println("A média final é: " + m);
	}

}
