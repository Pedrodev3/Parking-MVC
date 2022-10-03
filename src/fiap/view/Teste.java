package fiap.view;

import javax.swing.JOptionPane;

import fiap.controller.*;

public class Teste {
	public static void main(String[] args) {
		CarroController carro = new CarroController();
		
		/*
		 * Você pode inserir
		 * Alterar
		 * Excluir 
		 * E listar cada objeto
		 * 
		 * Utilizando os métodos da Classe CarroController e puxando o que foi feito no Model
		 * */
		
		// Testando inserir dados
		JOptionPane.showMessageDialog(null, carro.insereCarro("weq342", "Azul-Marinho", "Opala"));
		
		//Testando alterar dados (alterações/atualizações nos dados)
		JOptionPane.showMessageDialog(null, carro.alteraCarro("ABC1234", "Rosa", "Opala"));
		
		// Testando exclusão
		JOptionPane.showMessageDialog(null, carro.excluiCarro("ABC1234"));
		
		// Testando listar
		JOptionPane.showMessageDialog(null, carro.listaCarro("ABC1234"));
		
	}
}
