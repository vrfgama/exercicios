package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Usuario;
import service.UsuarioService;

public class UsuarioServiceTest {

	Usuario referencia;
	UsuarioService service;
	
	@Before
	public void setUp() throws Exception {
		
		service= new UsuarioService();
		referencia= new Usuario("2222", "Jeremias", "4321", "444.555.666-88", "08:00:00", "18:00:00", false, 0, "11.111.111/1111-11");
	}

	@After
	public void tearDown() throws Exception{
		
		service.excluir(referencia.getId());
	}

	@Test
	public void testCadastrar() {
		
		assertTrue("teste cadastrar", service.cadastrar(referencia));
	}

	@Test
	public void testAlterar() {
		
		referencia.setNome("João");
		assertTrue("teste alterar", service.alterar(referencia));
	}

	@Test
	public void testConsultar() {
		
		assertEquals("teste consultar", service.consultar(referencia.getId()), referencia);
	}

	@Test
	public void testConsultarTodos() {
		
		for(Usuario usuarios: service.consultarTodos()){
			assertEquals("teste consultar todos", usuarios, referencia);
		}
	}

	@Test
	public void testExcluir() {
		
		assertTrue("teste excluir", service.excluir(referencia.getId()));
	}	
}
