package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		String colaborador = JOptionPane.showInputDialog("Colaborador").toUpperCase();
		float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio Bruto"));
		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Faltas"));
		if (faltas==0) {
			salarioBruto = salarioBruto * (float) 1.02;
		}
		float inss=0;
		if (salarioBruto<=1100) {
			inss = salarioBruto * (float) 0.07;
		}else if (salarioBruto>1100 && salarioBruto<=2203.48) {
			inss = salarioBruto * (float) 0.09;
		}else if (salarioBruto>2203.48 && salarioBruto<=3305.22) {
			inss = salarioBruto * (float) 0.12;
		}else {
			inss = salarioBruto * (float) 0.14;
		}
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Sal�rio Liquido: " + (salarioBruto - inss - salarioBruto*0.08));
		
		 /* Exercicio 3:
		 * Receba o valor do sal�rio bruto, o nome de um colaborador e 
		 * a qtde de faltas.
		 * Se n�o houver faltas o salario bruto receber� um aumento de 2%.
		 * Calcule o valor do INSS sobre o sal�rio bruto.
		 * Exiba no final o sal�rio bruto, e o sal�rio liquido (retirando
		 * o INSS e 8% do FGTS)
		*/
				
	}
		
		
	}

