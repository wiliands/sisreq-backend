package br.com.sisreq.controllers;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sisreq.controllers.modelo.ModeloCrudController;
import br.com.sisreq.data.vo.v1.UsuarioVO;
import br.com.sisreq.exceptions.ExcecaoNegocio;
import br.com.sisreq.services.UsuarioService;
import br.com.sisreq.util.CustomMediaType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = {"Usuário Endpoint"})
@RestController
@RequestMapping("/sisreq-api/usuario/v1")
public class UsuarioController implements ModeloCrudController<Long, UsuarioVO> {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	UsuarioService service;
	
	@Override
	@ApiOperation(value = "Pesquisa usuario pelo ID")
	@GetMapping(value = "/{id}",
				produces = {CustomMediaType.APPLICATION_JSON_VALUE,
							CustomMediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<UsuarioVO> findById(@PathVariable("id") Long id) {
		try {
			UsuarioVO usuario = service.findById(id);
			usuario.add(buildLink(usuario.getKey()));
			return new ResponseEntity<UsuarioVO>(usuario, HttpStatus.OK); 
		} catch (ExcecaoNegocio e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return ResponseEntity.badRequest().build();
	}

	@Override
	@ApiOperation(value = "Pesquisa todos usuarios")
	@GetMapping(produces = {CustomMediaType.APPLICATION_JSON_VALUE, CustomMediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> findAll(@RequestParam(value = "page", defaultValue = "0") int page,
				@RequestParam(value = "limit", defaultValue = "15") int limit,
				@RequestParam(value = "direction", defaultValue = "asc") String direction) {
		try {
			List<UsuarioVO> usuarios = service.findAll();
			usuarios.stream().forEach(u -> u.add(buildLink(u.getKey())));
			return new ResponseEntity<>(usuarios, HttpStatus.OK); 
		} catch (ExcecaoNegocio e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return ResponseEntity.badRequest().build();
	}

	@Override
	@ApiOperation(value = "Cria um novo usuario")
	@PostMapping(produces = {CustomMediaType.APPLICATION_JSON_VALUE, CustomMediaType.APPLICATION_XML_VALUE},
				 consumes = {CustomMediaType.APPLICATION_JSON_VALUE, CustomMediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<UsuarioVO> create(@RequestBody UsuarioVO vo) {
		try {
			UsuarioVO usuario = service.create(vo);
			usuario.add(buildLink(vo.getKey()));
			return new ResponseEntity<UsuarioVO>(usuario, HttpStatus.OK); 
		} catch (ExcecaoNegocio e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return ResponseEntity.badRequest().build();
	}

	@Override
	@ApiOperation(value = "Atualiza usuario existente")
	@PutMapping(produces = {CustomMediaType.APPLICATION_JSON_VALUE, CustomMediaType.APPLICATION_XML_VALUE},
				consumes = {CustomMediaType.APPLICATION_JSON_VALUE, CustomMediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<UsuarioVO> update(@RequestBody UsuarioVO vo) {
		try {
			UsuarioVO usuario = service.update(vo);
			usuario.add(buildLink(vo.getKey()));
			return new ResponseEntity<UsuarioVO>(usuario, HttpStatus.OK); 
		} catch (ExcecaoNegocio e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return ResponseEntity.badRequest().build();
	}

	@Override
	@ApiOperation(value = "Exclui um usuario existente")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return ResponseEntity.ok().build(); 
		} catch (ExcecaoNegocio e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return ResponseEntity.badRequest().build();
	}

	@Override
	public Link buildLink(Long id) {
		return linkTo(methodOn(UsuarioController.class).findById(id)).withSelfRel();
	}
	
}
