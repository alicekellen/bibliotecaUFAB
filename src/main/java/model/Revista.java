package model;

import interfaces.ICadastrarAcervo;

public class Revista implements ICadastrarAcervo{
	
	/**
	 * Declaração de variaveis
	 *
	 */
	private int titulo;
	private int editora;
	private int datapublicacao;
	private int edicao;
	private int numpags;

	/**
	 * Construtor
	 *
	 */
	public Revista() {
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

	public int getEditora() {
		return editora;
	}

	public void setEditora(int editora) {
		this.editora = editora;
	}

	public int getDatapublicacao() {
		return datapublicacao;
	}

	public void setDatapublicacao(int datapublicacao) {
		this.datapublicacao = datapublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getNumpags() {
		return numpags;
	}

	public void setNumpags(int numpags) {
		this.numpags = numpags;
	}

	/**
	 * Método resonsável por cadastrar uma Revista
	 *
	 */
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}
}
