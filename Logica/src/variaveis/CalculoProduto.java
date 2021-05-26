package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	/*
	 * Tipos Primitivos (TODOS aqueles que começas com letra minuscula)
	 * boolean = logico (true/false)
	 * char = um caracter entre apostrofo
	 * 
	 * byte = - 128 / + 127
	 * short = - 132 mil / + 32 mil
	 * int = - 2 trilhoes / + 2 trilhoes
	 * long = - quintrilhoes / + quintrilhoes
	 * 
	 * float = ate 5 casas decimais
	 * double = acima disso
	 */
	
	public static void main(String[] args) {
		
		
		String produto = JOptionPane.showInputDialog ("Nome do Produto");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog ("Qtde Produto"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog ("Valor Unitario"));
		double total = (qtde * valor);
				
		System.out.println("Nome do Produto.: " + produto);
		System.out.println("Qtde do Produto.: " + qtde);
		System.out.println("Valor...........: " + valor);	
		System.out.println("Valor Total.....: " + total);
		System.out.println("Imposto.........: " + (total * 0.17));
		
			
		
	}

}
