package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, cont = 0;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		
		for (int i = 1; i<=num; i++) {
			if (num% i == 0) {
				cont++;
			}
		}
		
		if(cont==2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}	
		
	
}
