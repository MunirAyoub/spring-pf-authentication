package br.com.fiap.springpfauthentication.resource;
import jakarta.transaction.Transactional;
import br.com.fiap.springpfauthentication.entity.Permissao;
import java.util.List;
import br.com.fiap.springpfauthentication.repository.PermissaoRepository;
import br.com.fiap.springpfauthentication.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.springpfauthentication.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository repo;
    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
    @GetMapping
    public List<Usuario> findAll() {
        return repo.findAll();
    }
    @Transactional
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return repo.save(usuario);
    }
}