package model;

import java.util.Date;

public class Ficha {

	/**
	 * Declaração de variaveis
	 *
	 */
	private int id;
	private Aluno aluno;
	private Date dataReserva;
	private Date dataDevolucao;
	private Double valorTotal;
	private Livro livro;
	
	/**
	 * Construtor
	 *
	 */
	public Ficha() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Métodos get e set
	 *
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	/**
	 * Método responsável por cadastrar uma ficha
	 *
	 */
	public void cadastrarFicha() {
		
	}
}
