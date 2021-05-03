package br.com.sisreq.tests;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.sisreq.data.vo.v1.UsuarioVO;
import br.com.sisreq.services.UsuarioService;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioTest {
	
	@InjectMocks
	private UsuarioService usuarioService;
	
	@Test
	public void testSalvarComSucesso( ) {
		UsuarioVO usuario = new UsuarioVO();
		usuario.setAtivo(true);
		usuario.setAdministrador(false);
		usuario.setDtExpiracao(LocalDateTime.now());
		usuario.setLogin("teste");
		usuario.setNome("teste");
		usuario.setNomeCompleto("teste");
		usuario.setSenha("1234");
		usuario.setConfirmaSenha("1234");
		
		usuarioService.create(usuario);
		//verify(usuarioRepository, times(1)).save(entity)
	}
	
}
