package br.com.claudia.forum.repository;

import br.com.claudia.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
    List<Topico> findByCursoNome(String nomeCurso);

    List<Topico> findByTitulo(String nomeCurso);
}
