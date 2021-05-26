package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// main() � o start point de uma aplica��o Java
	// � a chave de igni��o do carro
	public static void main(String[] args) {
		
		// Sintaxe: <tipo de dado> <nme da variavel> = dado;
		/*
		 * Alfanumerico: � um texto, parte de um texto ou um numero que nao ser� utilizado em expressoes matematicas
		 * 
		 * Numerico: representa um dado que pode ser utilizado em express�es matematicas
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
	
    // Em uma classe encontramos: m�todos e atributos
	// Nossa classe � publica 
	/*
	 * JVM � o imterpretador do JAVA
	 * JRE � o ambiente de execu��o
	 * JDK � o ambiente para desenvolvimento Java
	 */
	
	
	
	
} // fechando o bloco de classe TipoDados
