package treinandoOOP;

import javax.swing.JOptionPane;

public class Quadrado extends Forma {

	@Override
	public void calcularArea(Double valor) {

		// Recebe um lado do quadrado como entrada.
		Double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um lado do quadrado"));

		// Armazena em uma variavel a entrada do usuário ao quadrado.
		valor = Math.pow(lado, 2);

		// verifica se o valor é negativo ou igual a zero
		tratarErro(valor);

		// Atribui em uma variavel o valor retornado pelo método de formatação de
		// números decimais.
		String areaQuadrado = formatarArea(valor);

		// Imprime no prompt o resultado final formatado
		JOptionPane.showMessageDialog(null, "Area do quadrado:  " + areaQuadrado);

	}

}
