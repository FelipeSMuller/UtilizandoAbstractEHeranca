package treinandoOOP;

import javax.swing.JOptionPane;

public class UtilizandoAbstract {

	public static void main(String[] args) {

		int opcao = 0;

		do {

			// Tratamento de exceções
			try {

				// Entrada do usuário
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"CALCULO DE FIGURAS GEOMÉTRICAS" + "\n1-Calcular circulo " + "\n2-Calcular retângulo"
								+ " \n3-Calcular triângulo " + "\n4-Calcular quadrado " + "\n5-Calcular losango"
								+ " \n6-Calcular hexagono"));

				// Estrutura try e catch
			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Dados não numericos foram inseridos ou o programa foi finalizado incorretamente!", null,
						JOptionPane.WARNING_MESSAGE);

				break;

			}

			switch (opcao) {

			case 1:

				// Instanciando um novo objeto

				Circulo circulo1 = new Circulo();

				// Chamandoo método de calculo de área, onde o programa permitirá que o usuário
				// insira um valor para calcular a área do círculo.
				circulo1.calcularArea(0.0);

				break;

			case 2:

				// Instanciando um novo objeto
				Retangulo retangulo1 = new Retangulo();

				// Chamandoo método de calculo de área, onde o programa permitirá que o usuário
				// insira dois valores para calcular a área do retangulo
				retangulo1.calcularArea(0.0);

				break;

			case 3:

				// Instanciando um novo objeto

				Triangulo triangulo1 = new Triangulo();

				// Chamandoo método de calculo de área, onde o programa permitirá que o usuário
				// insira dois valores para calcular a área do triangulo
				triangulo1.calcularArea(0.0);

				break;

			case 4:

				// Instanciando um novo objeto.
				Quadrado quadrado1 = new Quadrado();

				// Chamando um método onde o usuario pode inserir um valor para cálcular a área
				// do quadrado;

				quadrado1.calcularArea(0.0);

				break;

			case 5:

				// Instanciando um novo objeto.

				Losango losango1 = new Losango();

				// Chamando um método onde o usuario pode inserir um valor para cálcular a área
				// do Losango;

				losango1.calcularArea(0.0);

				break;

			case 6:

				// Instanciando um novo objeto.

				HexagonoRegular hexagono1 = new HexagonoRegular();

				// Chamando um método onde o usuario pode inserir um valor para cálcular a área
				// do Hexagono

				hexagono1.calcularArea(0.0);

				break;

			default:

				JOptionPane.showMessageDialog(null, args);

				break;
			}

		} while (opcao > 0);
	}

}
