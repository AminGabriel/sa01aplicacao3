package br.com.javatagua.sa1.app3;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.AssentoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resp = JOptionPane.showInputDialog("Digite a quantidade de aviões: ");
		
		int qtdeAvioes = Integer.parseInt(resp);
		
		AssentoBO abo = new AssentoBO();
		
		JOptionPane.showMessageDialog(null,"Quantidade geral de assentos: " + abo.calcularAssentos(qtdeAvioes));

	}

}
