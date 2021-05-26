/*
 * ===============Exercicio 2================================
 *      short diarias = Short.parseShort(JOptionPane.showInputDialog("Diárias"));
 *		float valorDiaria = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
 *		float taxa=0;
 *		if (diarias>10) {
 *	 		taxa = valorDiaria * (float) 0.05;
 *		}else if (diarias<5) {
 *			taxa = valorDiaria * (float) 0.1;
 *		}else {
 *			taxa = valorDiaria * (float) 0.08;
 *		}
 *		float total = (valorDiaria+taxa)*diarias;
 *		System.out.printf("Total: %.2f", total);
 *		//System.out.printf("Diarias: %d \n Valor: %f \n Taxa: %f \n Total: %f", diarias, valorDiaria, taxa, total);
 *=======================================================================================
 */
package decisao;

import javax.swing.JOptionPane;


public class Exercicio2 {
	
public static void main(String[] args) {
		
		float diaria = Float.parseFloat(JOptionPane.showInputDialog("Digite a qtde de diarias "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog ("Valor da diaria"));
		
		if (diaria>10) {
			double taxa = (valor * 0.05 + (valor * diaria));
			System.out.println("Total: = R$" + taxa);
		} else if (diaria>=5 && diaria<=10) {
			double taxa = (valor * 0.08 + (valor * diaria));
			System.out.println("Total: =  R$" + taxa);
		} else if (diaria<5) {
			double taxa = (valor * 0.10 + (valor * diaria));
			System.out.println("Total: =  R$" + taxa);
		}
	
	}

}