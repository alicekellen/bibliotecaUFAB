package model;

import cursosEnum.FuncionarioEnum;

public class Funcionario {

	private static int id;
	private static String nome;
	private static FuncionarioEnum tipo;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getId() {
		return id;
	}

	public void setId(int id) {
		Funcionario.id = id;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Funcionario.nome = nome;
	}

	public static FuncionarioEnum getTipo() {
		return tipo;
	}

	public void setTipo(FuncionarioEnum tipo) {
		Funcionario.tipo = tipo;
	}
}
