package br.com.sisreq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sisreq.data.entity.Posicao;

@Repository
public interface PosicaoRepository extends JpaRepository<Posicao, Long> {

}
