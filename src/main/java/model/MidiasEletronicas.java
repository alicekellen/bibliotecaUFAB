package model;

import interfaces.ICadastrarAcervo;

public class MidiasEletronicas implements ICadastrarAcervo{

	/**
	 * Declaração de variaveis
	 *
	 */
	private int titulo;
	private int tipo; //pode ser cd ou dvd
	private int datadegravacao;
	
	/**
	 * Construtor
	 *
	 */
	public MidiasEletronicas() {
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getDatadegravacao() {
		return datadegravacao;
	}

	public void setDatadegravacao(int datadegravacao) {
		this.datadegravacao = datadegravacao;
	}

	/**
	 * Método responsável por cadastrar Midias Digitais
	 *
	 */
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}
}
