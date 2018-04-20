package model;

public class MidiasEletronicas {

	private static int titulo;
	private static int tipo; //pode ser cd ou dvd
	private static int datadegravacao;
	
	public MidiasEletronicas() {
		// TODO Auto-generated constructor stub
	}

	public static int getTitulo() {
		return titulo;
	}

	public static void setTitulo(int titulo) {
		MidiasEletronicas.titulo = titulo;
	}

	public static int getTipo() {
		return tipo;
	}

	public static void setTipo(int tipo) {
		MidiasEletronicas.tipo = tipo;
	}

	public static int getDatadegravacao() {
		return datadegravacao;
	}

	public static void setDatadegravacao(int datadegravacao) {
		MidiasEletronicas.datadegravacao = datadegravacao;
	}
}
