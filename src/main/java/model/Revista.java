package model;

public class Revista {
	
	private static int titulo;
	private static int editora;
	private static int datapublicacao;
	private static int edicao;
	private static int numpags;

	public Revista() {
		// TODO Auto-generated constructor stub
	}

	public static int getTitulo() {
		return titulo;
	}

	public static void setTitulo(int titulo) {
		Revista.titulo = titulo;
	}

	public static int getEditora() {
		return editora;
	}

	public static void setEditora(int editora) {
		Revista.editora = editora;
	}

	public static int getDatapublicacao() {
		return datapublicacao;
	}

	public static void setDatapublicacao(int datapublicacao) {
		Revista.datapublicacao = datapublicacao;
	}

	public static int getEdicao() {
		return edicao;
	}

	public static void setEdicao(int edicao) {
		Revista.edicao = edicao;
	}

	public static int getNumpags() {
		return numpags;
	}

	public static void setNumpags(int numpags) {
		Revista.numpags = numpags;
	}
}
