package cursosEnum;

public enum TipoCursoEnum {

	GRADUACAO(1), 
	POS_GRADUACAO(2);
    
    private final int tipoCurso;
    
    TipoCursoEnum(int tipoCursoOpcao){
        tipoCurso = tipoCursoOpcao;
    }
    public int getTipoCurso(){
        return tipoCurso;
    }
}
