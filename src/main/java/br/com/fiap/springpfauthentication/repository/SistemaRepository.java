package br.com.fiap.springpfauthentication.repository;
import org.springframework.stereotype.Repository;
import br.com.fiap.springpfauthentication.entity.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Long> {
}