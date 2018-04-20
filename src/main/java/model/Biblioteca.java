package model;

import java.util.ArrayList;

public class Biblioteca {
	
	private static String nome;
	private static ArrayList<Aluno> alunos;
	private static ArrayList<Livro> livros;
	private static ArrayList<Ficha> fichas;
	private static ArrayList<Funcionario> funcionarios;

	public Biblioteca() {
		// TODO Auto-generated constructor stub
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Biblioteca.nome = nome;
	}

	public static ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public static void setAlunos(ArrayList<Aluno> alunos) {
		Biblioteca.alunos = alunos;
	}

	public static ArrayList<Livro> getLivros() {
		return livros;
	}

	public static void setLivros(ArrayList<Livro> livros) {
		Biblioteca.livros = livros;
	}

	public static ArrayList<Ficha> getFichas() {
		return fichas;
	}

	public static void setFichas(ArrayList<Ficha> fichas) {
		Biblioteca.fichas = fichas;
	}

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public static void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		Biblioteca.funcionarios = funcionarios;
	}

	/**
	 * Método responsável por adicionar um novo livro ao banco de dados da biblioteca
	 * @param livro do tipo Livro
	 * @return true quando o livro é adicionado com sucesso e false se o livro for um objeto nulo
	 * */
	public Boolean addLivro(Livro livro) {
		if(livro == null) {
			return false;
		}
		// TODO adiciona o livro ao banco de dados
		return true;
	}
	
	/**
	 * Método responsável por adicionar um novo aluno ao banco de dados da biblioteca
	 * @param aluno do tipo Aluno
	 * @return true quando o aluno for adicionado com sucesso e false se o aluno for um objeto nulo
	 * */
	public Boolean addAluno(Aluno aluno) {
		if(aluno == null) {
			return false;
		}
		// TODO adiciona o aluno ao banco de dados
		return true;
	}
	
	/**
	 * Método responsável por adicionar uma nova ficha ao banco de dados da biblioteca
	 * @param ficha do tipo Ficha
	 * @return true quando a ficha é adicionada com sucesso e false se a ficha for um objeto nulo
	 * */
	public Boolean addFicha(Ficha ficha) {
		if(ficha == null) {
			return false;
		}
		// TODO adiciona a ficha ao banco de dados
		return true;
	}
	
	/**
	 * Método responsável por adicionar um novo funcionario ao banco de dados da biblioteca
	 * @param funcionario do tipo Funcionario
	 * @return quando o funcionario é adicionado com sucesso e false se o funcionario for um objeto nulo
	 * */
	public Boolean addFuncionario(Funcionario funcionario) {
		if(funcionario == null) {
			return false;
		}
		// TODO adiciona o funcionario ao banco de dados
		return true;
	}
}
