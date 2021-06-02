package br.com.lojaregina.modelo;

public class Endereco {
	private String logradoro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
			
	@Override
	public String toString() {
		return "Endereco [logradoro=" + logradoro + ", numero=" + numero + ", complemento=" + complemento + ", bairro="
				+ bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + "]";
	}
	public Endereco() {
		super();
	}
	public Endereco(String logradoro, String numero, String complemento, String bairro, String cidade, String uf,
			String cep) {
		super();
		this.logradoro = logradoro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	public String getLogradoro() {
		return logradoro;
	}
	public void setLogradoro(String logradoro) {
		this.logradoro = logradoro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	
}
