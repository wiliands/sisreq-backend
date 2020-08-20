package br.com.sisreq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sisreq.converters.DozerConverter;
import br.com.sisreq.data.entity.Usuario;
import br.com.sisreq.data.vo.v1.UsuarioVO;
import br.com.sisreq.exceptions.ExcecaoNegocio;
import br.com.sisreq.repository.UsuarioRepository;
import br.com.sisreq.services.modelo.ModeloService;

@Service
public class UsuarioService implements ModeloService<Long, UsuarioVO>{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	UsuarioRepository repository;

	@Override
	public UsuarioVO findById(Long id) throws ExcecaoNegocio {
		var entity = repository.findById(id)
				 .orElseThrow(() -> new ExcecaoNegocio(String.format("Nenhum usuário encontrado para o ID #%s", id)));
		return DozerConverter.parseObject(entity, UsuarioVO.class);
	}

	@Override
	public List<UsuarioVO> findAll() throws ExcecaoNegocio {
		var entitys = repository.findAll();
		return DozerConverter.parseListObjects(entitys, UsuarioVO.class);
	}

	@Override
	public UsuarioVO create(UsuarioVO vo) throws ExcecaoNegocio {
		var entity = DozerConverter.parseObject(vo, Usuario.class);
		entity = repository.save(entity);
		return DozerConverter.parseObject(entity, UsuarioVO.class);
	}

	@Override
	public UsuarioVO update(UsuarioVO vo) throws ExcecaoNegocio {
		var usuarioVO = findById(vo.getKey());
		
		var entity = DozerConverter.parseObject(usuarioVO, Usuario.class);
		entity.setAdministrador(usuarioVO.isAdministrador());
		entity.setDtExpiracao(usuarioVO.getDtExpiracao());
		entity.setNome(usuarioVO.getNome());
		entity.setNomeCompleto(usuarioVO.getNomeCompleto());
		entity = repository.save(entity);
		
		return DozerConverter.parseObject(entity, UsuarioVO.class);
	}

	@Override
	public void delete(Long id) throws ExcecaoNegocio {
		var usuarioVO = findById(id);
		var entity = DozerConverter.parseObject(usuarioVO, Usuario.class);
		entity.setAtivo(false);
		entity = repository.save(entity);
	}

}
