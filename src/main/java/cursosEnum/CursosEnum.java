package cursosEnum;

public enum CursosEnum {
	
	ADMINISTRACAO(1), 
	CIENCIA_DA_COMPUTACAO(2), 
	DIREITO(3), 
	ENGENHARIA_ELETRICA(4), 
	ENGENHARIA_ESPACIAL(5), 
	ENGENHARIA_MECATRONICA(6), 
	MATEMATICA(7), 
	MEDICINA(8), 
	NUTRICAO(9), 
	ODONTOLOGIA(10), 
	PSICOLOGIA(11), 
	VETERINARIA(12);
    
    private final int curso;
    
    CursosEnum(int cursoOpcao){
        curso = cursoOpcao;
    }
    public int getCurso(){
        return curso;
    }
}
