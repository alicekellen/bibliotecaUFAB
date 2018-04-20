package BibliotecaUFAB.BibliotecaUFAB;

import java.util.ArrayList;
import java.util.Date;

import cursosEnum.CursosEnum;
import cursosEnum.FuncionarioEnum;
import cursosEnum.TipoCursoEnum;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import model.Aluno;
import model.Biblioteca;
import model.Ficha;
import model.Funcionario;
import model.Livro;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    

	public void testeBiblioteca(){
		Aluno aluno = new Aluno();
		aluno.setTipoCurso(TipoCursoEnum.GRADUACAO);
		aluno.setCurso(CursosEnum.CIENCIA_DA_COMPUTACAO);
		aluno.setMatricula(122086660);
		aluno.setNome("Alice Kellen");
		
		Livro livro = new Livro();
		livro.setAutor("Fulano");
		livro.setTitulo("A vida de Jurema");
		
		Ficha ficha = new Ficha();
		ficha.setAluno(aluno);
		ficha.setLivro(livro);
		ficha.setDataReserva(new Date());
		ficha.setDataDevolucao(new Date());
		ficha.setValorTotal(15.65);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Juricleideane");
		funcionario.setTipo(FuncionarioEnum.OPERADOR);
		
		Biblioteca biblioteca = new Biblioteca();
		
		assertTrue(biblioteca.addAluno(aluno));
		assertTrue(biblioteca.addFicha(ficha));
		assertTrue(biblioteca.addFuncionario(funcionario));
		assertTrue(biblioteca.addLivro(livro));
	}
}
