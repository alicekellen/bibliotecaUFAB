package model;

import interfaces.ICadastrarAcervo;

public class Jornal implements ICadastrarAcervo{
	
	/**
	 * Declaração de variaveis
	 *
	 */
	private int titulo;
	private int data;
	private int edicao;

	/**
	 * Construtor
	 *
	 */
	public Jornal() {
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

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	/**
	 * Método responsável por cadastrar um Jornal
	 *
	 */
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}
}
