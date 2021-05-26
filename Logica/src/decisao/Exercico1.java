/*===============Exercicio1=================================
 *		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor1"));
 *		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor2"));
 *		char operador = JOptionPane.showInputDialog("Digite um operador").charAt(0);
 *		
 *		if (operador=='*') {
 *			System.out.println("Resultado: " + (valor1*valor2));
 *		}else if (operador=='/') {
 *			if (valor2!=0) {
 *				System.out.println("Resultado: " + (valor1/valor2));
 *			}else {
 *				System.out.println("Divisão não pode ser realizada!");
 *			}
 *		}else if (operador=='+') {
 *			System.out.println("Resultado: " + (valor1+valor2));
 *		}else if (operador=='-') {
 *			System.out.println("Resultado: " + (valor1-valor2));
 *		}else {
 *			System.out.println("Operador inválido");
 *		}
 *===========================================================
  */
package decisao;

import javax.swing.JOptionPane;

public class Exercico1 {

	public static void main(String[] args) {
		
		float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite primeiro valor: "));
		float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite segundo valor: "));
		String operador = JOptionPane.showInputDialog("Digite o Operador: ").toUpperCase();
		
		if (operador.equals("+")) {
			double total = (valor1 + valor2);
			System.out.println("Total: = " + total);
		} else if (operador.equals("-")) {
			double total = (valor1 - valor2);
			System.out.println("Total: = " + total);
		} else 	if (operador.equals("*")) {
			double total = (valor1 * valor2);
			System.out.println("Total: = " + total);
		} else if (operador.equals("/")) {
			double total = (valor1 / valor2);
			System.out.println("Total: = " + total);
		} else {
			System.out.println("Operador inválido");
		}
	}

}