package br.com.fiap.springpfauthentication.repository;

import org.springframework.stereotype.Repository;
import br.com.fiap.springpfauthentication.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}