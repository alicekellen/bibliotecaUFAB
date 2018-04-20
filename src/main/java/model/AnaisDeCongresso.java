package model;

public class AnaisDeCongresso {
	
	private static int tipo; //pode ser artigo, pôster ou resumo 
	private static int titulo;
	private static int autor; //pode ser +1
	private static int nomedocongresso;
	private static int anodepublicacao;
	private static int local;

	public AnaisDeCongresso() {
		// TODO Auto-generated constructor stub
	}

	public static int getTipo() {
		return tipo;
	}

	public static void setTipo(int tipo) {
		AnaisDeCongresso.tipo = tipo;
	}

	public static int getTitulo() {
		return titulo;
	}

	public static void setTitulo(int titulo) {
		AnaisDeCongresso.titulo = titulo;
	}

	public static int getAutor() {
		return autor;
	}

	public static void setAutor(int autor) {
		AnaisDeCongresso.autor = autor;
	}

	public static int getNomedocongresso() {
		return nomedocongresso;
	}

	public static void setNomedocongresso(int nomedocongresso) {
		AnaisDeCongresso.nomedocongresso = nomedocongresso;
	}

	public static int getAnodepublicacao() {
		return anodepublicacao;
	}

	public static void setAnodepublicacao(int anodepublicacao) {
		AnaisDeCongresso.anodepublicacao = anodepublicacao;
	}

	public static int getLocal() {
		return local;
	}

	public static void setLocal(int local) {
		AnaisDeCongresso.local = local;
	}
}
