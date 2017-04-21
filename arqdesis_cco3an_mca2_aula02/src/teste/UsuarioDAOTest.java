package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dao.UsuarioDAO;
import modelo.Usuario;

public class UsuarioDAOTest {
	
	UsuarioDAO dao;
	Usuario referencia;


	@Before
	public void setUp() throws Exception {
		
		dao= new UsuarioDAO();
		referencia= new Usuario("1111", "Jaime", "1234", "111.222.333-99", "08:00:00", "18:00:00", true, 1, "11.111.111/1111-11");
	}

	@After
	public void tearDown() throws Exception {
		
		dao.excluir(referencia.getId());
	}

	@Test
	public void testCadastrar() {
		
		assertEquals("teste cadastrar", dao.cadastrar(referencia), true);
	}

	@Test
	public void testConsultar() {
		
		Usuario recuperado= new Usuario();
		recuperado= dao.consultar(referencia.getId());
		assertEquals("teste consultar", recuperado, referencia);
	}

	@Test
	public void testConsultarTodos() {
		
		for(Usuario usuarios: dao.consultarTodos()){
			assertEquals("teste consultar todos", usuarios, referencia);
		}
	}

	@Test
	public void testAlterar() {
		
		referencia.setNome("João");
		assertTrue("teste alterar", dao.alterar(referencia));
	}
	
	@Test
	public void testExcluir() {
		
		assertTrue("teste excluir", dao.excluir(referencia.getId()));
	}

}
