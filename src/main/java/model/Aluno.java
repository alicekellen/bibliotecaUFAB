package model;

import cursosEnum.CursosEnum;
import cursosEnum.TipoCursoEnum;

public class Aluno {

	private static int id;
	private static String nome;
	private static Integer matricula;
	private static TipoCursoEnum tipoCurso;
	private static CursosEnum curso;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getId() {
		return id;
	}
	
	public void setId(int id) {
		Aluno.id = id;
	}
	
	public static String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		Aluno.nome = nome;
	}
	
	public static Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		Aluno.matricula = matricula;
	}
	
	public static TipoCursoEnum getTipoCurso() {
		return tipoCurso;
	}
	
	public void setTipoCurso(TipoCursoEnum tipoCurso) {
		Aluno.tipoCurso = tipoCurso;
	}
	
	public static CursosEnum getCurso() {
		return curso;
	}
	
	public void setCurso(CursosEnum curso) {
		Aluno.curso = curso;
	}
	
	
}
