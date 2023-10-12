package treinandoOOP;

import javax.swing.JOptionPane;

public class Retangulo extends Forma {

	@Override
	public void calcularArea(Double valor) {

		// Recebe dois valores como entrada para cálcular a área de um retângulo
		Double base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base"));

		Double largura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura"));

		// Atribui em uma variavel o cálculo
		valor = largura * base;

		// Verifica se o valor é negativo ou igual a zero
		tratarErro(valor);

		// Atribui em uma variavel a formatação da área
		String areaRetangulo = formatarArea(valor);

		// Imprime no prompt a área do retangulo formatada
		JOptionPane.showMessageDialog(null, "Área do Retângulo:  " + areaRetangulo);

	}

}
