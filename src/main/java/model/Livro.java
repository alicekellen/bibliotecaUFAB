package model;

import interfaces.ICadastrarAcervo;

public class Livro implements ICadastrarAcervo{

	/**
	 * Declaração de variaveis
	 *
	 */
	private int isbn;
	private String titulo;
	private String autor; //poder ser +1
	private String editora;
	private String anopublicacao;
	private String edicao;
	private int numpags;
	private String area;
	private String tema;
	
	/**
	 * Construtor
	 *
	 */
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Métodos get e set
	 *
	 */
	public int getISBN() {
		return isbn;
	}
	public void setISBN(int ISBN) {
		this.isbn = ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAnopublicacao() {
		return anopublicacao;
	}

	public void setAnopublicacao(String anopublicacao) {
		this.anopublicacao = anopublicacao;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getNumpags() {
		return numpags;
	}

	public void setNumpags(int numpags) {
		this.numpags = numpags;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	/**
	 * Método que realiza o cadastro de um Livro
	 *
	 */
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}
}
