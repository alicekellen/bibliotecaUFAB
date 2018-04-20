package cursosEnum;

public enum FuncionarioEnum {

	ADMINISTRADOR(1),  
	OPERADOR(2);
    
    private final int tipo;
    
    FuncionarioEnum(int tipoFuncionario){
        tipo = tipoFuncionario;
    }
    public int getTipoFuncionario(){
        return tipo;
    }
}
