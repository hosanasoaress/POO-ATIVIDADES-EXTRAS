package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  num, anterior=0;
		
		do {
			System.out.println("Digite um número inteiro positivo: ");
			num = sc.nextInt();
			System.out.println(num);
			if(num>0){
			anterior = num;
			
			} 
		} while(num > 0);
		System.out.println("Número inválido!!");
		System.out.println("O número anterior foi: " + anterior);
	
		
	}
}
