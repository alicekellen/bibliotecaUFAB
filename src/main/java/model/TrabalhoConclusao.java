package model;

public class TrabalhoConclusao {
	
	private static int titulo;
	private static int autor; //es
	private static int oreintador; //es
	private static int tipo; //pode ser monografia, tese ou dissertacao
	private static int anodedefesa;
	private static int local;

	public TrabalhoConclusao() {
		// TODO Auto-generated constructor stub
	}

	public static int getTitulo() {
		return titulo;
	}

	public static void setTitulo(int titulo) {
		TrabalhoConclusao.titulo = titulo;
	}

	public static int getAutor() {
		return autor;
	}

	public static void setAutor(int autor) {
		TrabalhoConclusao.autor = autor;
	}

	public static int getOreintador() {
		return oreintador;
	}

	public static void setOreintador(int oreintador) {
		TrabalhoConclusao.oreintador = oreintador;
	}

	public static int getTipo() {
		return tipo;
	}

	public static void setTipo(int tipo) {
		TrabalhoConclusao.tipo = tipo;
	}

	public static int getAnodedefesa() {
		return anodedefesa;
	}

	public static void setAnodedefesa(int anodedefesa) {
		TrabalhoConclusao.anodedefesa = anodedefesa;
	}

	public static int getLocal() {
		return local;
	}

	public static void setLocal(int local) {
		TrabalhoConclusao.local = local;
	}
}
