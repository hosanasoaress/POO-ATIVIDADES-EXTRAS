package br.edu.principal;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Double mf;
		String m, nome, msg;
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		msg = "Olá :) Seja bem-vindo(a)" + nome + " coisa linda de vó :D " ;
		
		JOptionPane.showMessageDialog(null, msg);
		
		m = JOptionPane.showInputDialog("Digite sua média: ");
		mf = Double.parseDouble(m);
		JOptionPane.showMessageDialog(null, mf);
	}

}
