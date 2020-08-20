package br.com.sisreq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sisreq.data.entity.Permissao;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
