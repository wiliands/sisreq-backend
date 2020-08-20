package br.com.sisreq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sisreq.data.entity.Prioridade;

@Repository
public interface PrioridadeRepository extends JpaRepository<Prioridade, Long> {

}
