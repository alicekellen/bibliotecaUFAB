package model;

public class Jornal {
	
	private static int titulo;
	private static int data;
	private static int edicao;

	public Jornal() {
		// TODO Auto-generated constructor stub
	}

	public static int getTitulo() {
		return titulo;
	}

	public static void setTitulo(int titulo) {
		Jornal.titulo = titulo;
	}

	public static int getData() {
		return data;
	}

	public static void setData(int data) {
		Jornal.data = data;
	}

	public static int getEdicao() {
		return edicao;
	}

	public static void setEdicao(int edicao) {
		Jornal.edicao = edicao;
	}
}
