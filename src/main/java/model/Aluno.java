package model;

import interfaces.ICadastrarAcervo;

public class Aluno implements ICadastrarAcervo{

	/**
	 * Declaração de variaveis
	 *
	 */
	private int id;
	private String nome;
	private Integer matricula;
	private String cpf;
	private String rg;
	private String naturalidade;
	private String nomeMae;
	private String endereco;
	private String telefone;
	private int ano;
	private String periodo;
	private String senha;
	private Curso curso;
	
	/**
	 * Construtor
	 *
	 */
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodos get e set
	 *
	 */
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Método responsável por cadastrar um Aluno
	 *
	 */
	public void cadastrar() {
		
	}
	
	/**
	 * Método responsável por excluir um aluno
	 *
	 */
	public void excluirAluno() {
		
	}
}
