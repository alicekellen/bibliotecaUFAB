package model;

import interfaces.ICadastrarAcervo;

public class TrabalhoConclusao implements ICadastrarAcervo{
	
	/**
	 * Declaração de variaveis
	 *
	 */
	private int titulo;
	private int autor; //es
	private int oreintador; //es
	private int tipo; //pode ser monografia, tese ou dissertacao
	private int anodedefesa;
	private int local;

	/**
	 * Construtor
	 *
	 */
	public TrabalhoConclusao() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Métodos get e set
	 *
	 */
	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public int getAutor() {
		return autor;
	}

	public void setAutor(int autor) {
		this.autor = autor;
	}

	public int getOreintador() {
		return oreintador;
	}

	public void setOreintador(int oreintador) {
		this.oreintador = oreintador;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getAnodedefesa() {
		return anodedefesa;
	}

	public void setAnodedefesa(int anodedefesa) {
		this.anodedefesa = anodedefesa;
	}

	public int getLocal() {
		return local;
	}

	public void setLocal(int local) {
		this.local = local;
	}

	/**
	 * Método responsável por cadastrar um Local
	 *
	 */
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}
}
