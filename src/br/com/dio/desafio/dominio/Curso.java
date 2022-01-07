package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public Curso() {
	
	}
	
	public Curso(  int cargaHoraria, String titulo, String descricao) {
		titulo = this.getTitulo();
		descricao=this.getDescricao();
		this.cargaHoraria=cargaHoraria;
	}
	

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return getTitulo() + ", descricao:" + getDescricao() + ", cargaHoraria:" + this.cargaHoraria;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO*cargaHoraria;
	}
	
	

}
