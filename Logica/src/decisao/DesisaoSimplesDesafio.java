package decisao;

import javax.swing.JOptionPane;

public class DesisaoSimplesDesafio {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome: ").toUpperCase();
		Short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade: "));
		
		System.out.println("Seu nome �: " + nome);
		System.out.println("Sua idade �: " + idade);
		
		if (idade>=18 && idade<70) {
		System.out.println("Seu voto � obrigatorio: ");
			}
		
		if (idade<16) {
		System.out.println("Voc� n�o pode votar : ");
		}	
		
		if (idade==16 || idade==17 || idade>=70) {
						
			System.out.println("Seu voto � facultativo. ");
			}	
		
				
		
		
	}

}
