package br.com.fiap.springpfauthentication.repository;

import org.springframework.stereotype.Repository;
import br.com.fiap.springpfauthentication.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}