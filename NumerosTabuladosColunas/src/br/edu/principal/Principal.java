package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i = 1;
		
		while(i<=1000) {
			System.out.print(i+"\t");
			i+= 2;
			
			if(i%3==0) {
				System.out.println();
			}
		}
	}

}
