package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// main() é o start point de uma aplicação Java
	// é a chave de ignição do carro
	public static void main(String[] args) {
		
		// Sintaxe: <tipo de dado> <nme da variavel> = dado;
		/*
		 * Alfanumerico: é um texto, parte de um texto ou um numero que nao será utilizado em expressoes matematicas
		 * 
		 * Numerico: representa um dado que pode ser utilizado em expressões matematicas
		 */
		
		String nome = JOptionPane.showInputDialog ("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite sua Idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua Altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog ("Digite seu Peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome....: " + nome);
		System.out.println("Idade...: " + idade);
		System.out.println("Altura..: " + altura);	
		System.out.println("IMC.....: " + imc);
		
		
	}
	
    // Em uma classe encontramos: métodos e atributos
	// Nossa classe é publica 
	/*
	 * JVM é o imterpretador do JAVA
	 * JRE é o ambiente de execução
	 * JDK é o ambiente para desenvolvimento Java
	 */
	
	
	
	
} // fechando o bloco de classe TipoDados
