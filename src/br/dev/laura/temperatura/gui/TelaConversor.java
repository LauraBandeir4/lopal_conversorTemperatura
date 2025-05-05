package br.dev.laura.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Temperatura;

public class TelaConversor {
	// Atributos

	private JLabel labelCelsius;
	private JTextField textCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultadoFinal;
	


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

		// Criar um JLabel e um JTextField para o textCelsius
		labelCelsius = new JLabel();
		labelCelsius.setText("Valor em Celsius: ");
		tela.getContentPane().add(labelCelsius);
		labelCelsius.setBounds(50, 10, 300, 50);

		// JField
		textCelsius = new JTextField();
		textCelsius.setHorizontalAlignment(JTextField.RIGHT);
		textCelsius.setBounds(50, 45, 260, 50);
		tela.getContentPane().add(textCelsius);

		// Botão Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(50, 100, 130, 50);
		tela.getContentPane().add(buttonKelvin);

		// Botão Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setBounds(180, 100, 130, 50);
		tela.getContentPane().add(buttonFahreinheit);

		// Label Resultado
		labelResultadoFinal = new JLabel();
		labelResultadoFinal.setText("Valor final: ");
		labelResultadoFinal.setBounds(50, 200, 200, 50);
		tela.getContentPane().add(labelResultadoFinal);

		// Todos os componentes foram adicionandos de acordo com sua respectiva ordem

		// Adicionar um ouvinte de ação (Listener) ao botão Kelvin
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String valorCelsius = textCelsius.getText();

				Temperatura temperatura = new Temperatura();

				double celsius = Double.parseDouble(valorCelsius);
				temperatura.setCelsius(celsius);
				String kelvin = String.valueOf(temperatura.converterParaKelvin());
				labelResultadoFinal.setText(kelvin);
				

			}
		});

		tela.setVisible(true);

	}

}
