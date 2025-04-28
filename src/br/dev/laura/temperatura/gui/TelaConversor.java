package br.dev.laura.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	// Atributos
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelMensagemErro;

	private Font fonteTextCelsius;
	private Font fonteMensagemErro;
	private Color corLabelMensagemErro;

	// Método para criar tela
	public void criarTelaConversor() {
		// Tela gráfica
		JFrame tela = new JFrame();

		// Definir o tamanho da tela através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(505, 400);

		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		//Criar um JLabel e um JTextField para o textCelcius
		labelCelsius = new JLabel();
      

		
		

		
		
		tela.setVisible(true);
	}

}
