package com.doacoes.central.apresentacao;

import com.doacoes.central.negocio.entity.Causa.Causa;
import com.doacoes.central.negocio.service.CausaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/causas")
public class CausaControler {

    private final CausaService causaService;

    @Autowired
    public CausaControler(CausaService causaService) {
        this.causaService = causaService;
    }

    @PostMapping
    public Causa criarCausa(@RequestBody Causa causa) {
        return causaService.criarCausa(causa);
    }

    @GetMapping
    public List<Causa> listarCausas() {
        return causaService.listarCausas();
    }

    @GetMapping("/{id}")
    public Optional<Causa> buscarCausaPorId(@PathVariable Long id) {
        return causaService.buscarCausaPorId(id);
    }

    @PutMapping("/{id}")
    public Causa atualizarCausa(@PathVariable Long id, @RequestBody Causa causaAtualizada) {
        return causaService.atualizarCausa(id, causaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void excluirCausa(@PathVariable Long id) {
        causaService.excluirCausa(id);
    }
}
