package treinandoOOP;

import javax.swing.JOptionPane;

public class HexagonoRegular extends Forma {

	@Override
	public void calcularArea(Double valor) {

		Double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o lado do Hexagono"));

		valor = (Math.pow(lado, 2) * 3 + Math.sqrt(3)) / 2;

		tratarErro(valor);

		String areaHexagono = formatarArea(valor);

		JOptionPane.showMessageDialog(null, "Área do Hexagono:  " + areaHexagono);
	}

}
