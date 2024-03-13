package br.com.fiap.springpfauthentication.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.springpfauthentication.entity.Sistema;

@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Long> {
}