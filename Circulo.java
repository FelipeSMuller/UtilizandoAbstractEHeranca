package treinandoOOP;

import javax.swing.JOptionPane;

public class Circulo extends Forma {

	@Override
	public void calcularArea(Double valor) {

		// Recebe a entrada de um valor do usuário
		Double insereValor = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor para cálcular a área do círculo"));

		// Efetua o cálculo de área
		valor = 3.14 * Math.pow(insereValor, 2);

		// Verifica se o valor é menor ou igual a zero com o método sem retorno.
		tratarErro(valor);

		// Atribui em uma nova variavel a String formatada com DecimalFormat
		String areaCirculo = formatarArea(valor);

		// Imprime no prompt o resultado das operações
		JOptionPane.showMessageDialog(null, "Área do círculo:  " + areaCirculo);

	}

}
