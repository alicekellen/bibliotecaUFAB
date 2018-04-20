package model;

public class Livro {

	private static int isbn;
	private static String titulo;
	private static String autor; //poder ser +1
	private static String editora;
	private static String anopublicacao;
	private static String edicao;
	private static int numpags;
	private static String area;
	private static String tema;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getISBN() {
		return isbn;
	}
	public void setISBN(int ISBN) {
		Livro.isbn = ISBN;
	}
	public static String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		Livro.titulo = titulo;
	}
	public static String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		Livro.autor = autor;
	}
	public static String getEditora() {
		return editora;
	}

	public static void setEditora(String editora) {
		Livro.editora = editora;
	}

	public static String getAnopublicacao() {
		return anopublicacao;
	}

	public static void setAnopublicacao(String anopublicacao) {
		Livro.anopublicacao = anopublicacao;
	}

	public static String getEdicao() {
		return edicao;
	}

	public static void setEdicao(String edicao) {
		Livro.edicao = edicao;
	}

	public static int getNumpags() {
		return numpags;
	}

	public static void setNumpags(int numpags) {
		Livro.numpags = numpags;
	}

	public static String getArea() {
		return area;
	}

	public static void setArea(String area) {
		Livro.area = area;
	}

	public static String getTema() {
		return tema;
	}

	public static void setTema(String tema) {
		Livro.tema = tema;
	}
}
