package treinandoOOP;

import javax.swing.JOptionPane;

public class Triangulo extends Forma {

	@Override
	public void calcularArea(Double valor) {

		Double base, altura;

		// Recebe a base e a altura de um triangulo como entrada do usuário
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da base"));

		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da altura"));

		// Armazena em uma variavel o resultado do cálculo
		valor = base * altura / 2;

		// Verifica se o resultado final é menor ou igual a zero
		tratarErro(valor);

		// Atribui em uma nova variavel o valor da área formatada
		String areaFormatada = formatarArea(valor);

		// Imprime no prompt o resultado final
		JOptionPane.showMessageDialog(null, "Área do triângulo:  " + areaFormatada);

	}

}
