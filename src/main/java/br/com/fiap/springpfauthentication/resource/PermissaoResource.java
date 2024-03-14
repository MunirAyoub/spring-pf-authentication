package br.com.fiap.springpfauthentication.resource;

import br.com.fiap.springpfauthentication.entity.Permissao;
import java.util.List;
import br.com.fiap.springpfauthentication.entity.Perfil;
import jakarta.transaction.Transactional;
import br.com.fiap.springpfauthentication.repository.PermissaoRepository;
import br.com.fiap.springpfauthentication.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/permissao")
public class PermissaoResource {

    @Autowired
    private PermissaoRepository repo;

    @GetMapping(value = "/{id}")
    public Permissao findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @GetMapping
    public List<Permissao> findAll() {
        return repo.findAll();
    }

    @Transactional
    @PostMapping
    public Permissao save(@RequestBody Permissao permissao) {
        return repo.save(permissao);
    }

}
