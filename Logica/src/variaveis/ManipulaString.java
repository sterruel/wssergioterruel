package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		/*
		 * Identificadores (nomes dos elementos que criamos: Variaveis, classe, pacote, etc).
		 * 
		 * - Regras:
		 * 
		 * 1 - N?o come?aras com numero. Exemplo: 1berto
		 * 2 - N?o utilizaras palavras reservadas. Exemplo: int, dougle, class, void 
		 * 3 - N?o fara uso de caracter especiais. Exemplo: n@me
		 * 
		 * - Padroes:
		 * 
		 * 1 - CamelCase: da segunda palavra em diante (em uma conposi??o)
		 * deve come?ar com letra maiuscula.
		 * certo = dataNascimento
		 * errado = datanascimento
		 * certo = data_nascimento
		 * errado = data_Nascimento
		 * 
		 * 2 - UML: ? responsavel por padronizar elesmentos da Orienta??o ao Objeto
		 * - Toda classe deve iniciar com letra maiuscula
		 * - Toda variavel/pacote deve come?ar com letra minuscula
		 * - Todo metodo deve come?ar com letra minuscula e deve ser seguido de parenteses.
		 * 
		 * xpto => ? uma vari?vel
		 * Xpto => ? uma classe
		 * xpto() => ? uma fun?ao
		 * Xpto.xpto() => ? um m?todo
		 */
			
		String email = "sergio.Terruel.Junior@Gmail.com";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi??o do arroba? " + email.indexOf("@"));		
		System.out.println("Qtde Caracteres: " + email.length());	
		System.out.println("Do 2? at? o 5? caracter: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usuario: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@") + 1));
		//se n?o for ate a cordenada final precisa colocar email.length()
		System.out.println("Primeiro Catacter: " + email.charAt(0));
		
		//boas praticas para nomenclatura
		
		
		
		
	}

}
