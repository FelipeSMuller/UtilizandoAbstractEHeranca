package treinandoOOP;

import javax.swing.JOptionPane;

public class Losango extends Forma {

	@Override
	public void calcularArea(Double valor) {

		Double diagonalMaior, diagonalMenor;

		// Recebe como entrada dois valores , diagonal maior e menor
		diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da diagonal maior"));

		diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da diagonal menor"));

		// Atribui em uma variavel o resultado do calculo
		valor = (diagonalMaior * diagonalMenor) / 2;

		tratarErro(valor);

		String areaLosango = formatarArea(valor);

		// Imprime no prompt o valor do resultado final
		JOptionPane.showMessageDialog(null, "Área do Losango:  " + areaLosango);

	}

}
