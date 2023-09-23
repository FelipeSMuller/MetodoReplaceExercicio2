package MetodosDeString;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Exercício 02: Substituir Letras em uma Palavra Escreva um programa que peça
		 * ao usuário que insira uma palavra e, em seguida, substitua todas as
		 * ocorrências de uma letra específica (por exemplo, "a") por outra letra (por
		 * exemplo, "x") na palavra. Exiba a palavra resultante.
		 */

		String fraseQualquer;

		do {

			fraseQualquer = JOptionPane.showInputDialog(null,
					"Digite uma frase, o programa irá remover os espaços e substituir algumas letras");

			if (fraseQualquer == null) {

				JOptionPane.showMessageDialog(null, "ERRO! \nO Campo não pode estar vazio");

				break;

			} else {

				JOptionPane.showMessageDialog(null, "Frase antes da modificação = " + fraseQualquer);

				fraseQualquer = fraseQualquer.replace(" ", "").replace("a", "x");

				JOptionPane.showMessageDialog(null, "Frase após a modificação = " + fraseQualquer);

			}

		} while (fraseQualquer != null);

	}

}
