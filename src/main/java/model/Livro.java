package model;

public class Livro {

	private static int id;
	private static String titulo;
	private static String autor;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		Livro.id = id;
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
}
