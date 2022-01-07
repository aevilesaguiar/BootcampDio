package br.com.dio.desafio.dominio;

public abstract class Conteudo{
	
	protected static final double XP_PADRAO= 10d; //final quer dizer que é uma constante , ou seja não pode ser modificado no futuro
												//static quer dizer que posso acessar o XP_PADRAO fora da classe conteúdo

	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static double getXpPadrao() {
		return XP_PADRAO;
	}
	
	
	

}
