package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2: "));
		float media = (nota1 + nota2)/2;
		
		if (media>=6) {
		System.out.println("Parabens voc? foi aprovado!");
			} else if (media<4) {
		System.out.println("Infelizmente voc? foi reprovado!");
		} else {
			System.out.println("Voc? esta de recupera??o!");
			}	
		
		System.out.println("Sua media na disciplina: " + disciplina + " foi: " + media);

	}
	
}
