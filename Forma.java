package treinandoOOP;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//A classe abstrata serve apenas como um "molde" para outras classes, e não pode ser instanciada com o operador "new".
public abstract class Forma {

	// A método abstrato apenas define oque as outras classes devem implementar.
	public abstract void calcularArea(Double valor);

	// Método para formatação de números decimais
	public String formatarArea(Double valor) {

		// Instanciando um novo objeto
		DecimalFormat df = new DecimalFormat("##.## m²");

		// Recebe como parametro um valor fornecido.
		String decimalFormatado = df.format(valor);

		// Retorna o valor formatado
		return decimalFormatado;

	}

	// Método para tratamento de erro com números decimais
	public void tratarErro(Double valor) {

		// Se o número inserido for menor ou igual a zero gera um erro
		if (valor <= 0) {

			// Imprime no promtp caso seja um número negativo ou igual a zero e fornece um
			// ícone de erro para tornar o programa mais amigável e intuitivo.
			JOptionPane.showMessageDialog(null,
					"Não é possível efetuar um cálculo com valores negativos ou igual a zero!!", null,
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
