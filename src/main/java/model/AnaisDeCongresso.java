package model;

import interfaces.ICadastrarAcervo;

public class AnaisDeCongresso implements ICadastrarAcervo{
	
	/**
	 * Declração das variáveis
	 *
	 */
	private int tipo; //pode ser artigo, pôster ou resumo 
	private int titulo;
	private int autor; //pode ser +1
	private int nomedocongresso;
	private int anodepublicacao;
	private int local;

	/**
	 * Construtor
	 *
	 */
	public AnaisDeCongresso() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Métodos get e set
	 *
	 */
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

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

	public int getNomedocongresso() {
		return nomedocongresso;
	}

	public void setNomedocongresso(int nomedocongresso) {
		this.nomedocongresso = nomedocongresso;
	}

	public int getAnodepublicacao() {
		return anodepublicacao;
	}

	public void setAnodepublicacao(int anodepublicacao) {
		this.anodepublicacao = anodepublicacao;
	}

	public int getLocal() {
		return local;
	}

	public void setLocal(int local) {
		this.local = local;
	}

	/**
	 * Método responsável por cadastrar Anis de Congresso
	 *
	 */
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}
}
