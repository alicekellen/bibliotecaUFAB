package model;

import java.util.Date;

public class Ficha {

	private static int id;
	private static Aluno aluno;
	private static Date dataReserva;
	private static Date dataDevolucao;
	private static Double valorTotal;
	private static Livro livro;
	
	public Ficha() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		Ficha.id = id;
	}
	
	public static Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		Ficha.aluno = aluno;
	}
	public static Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		Ficha.dataReserva = dataReserva;
	}
	public static Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		Ficha.dataDevolucao = dataDevolucao;
	}
	public static Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		Ficha.valorTotal = valorTotal;
	}
	public static Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		Ficha.livro = livro;
	}
}
