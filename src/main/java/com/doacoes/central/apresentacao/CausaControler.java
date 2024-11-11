package com.doacoes.central.apresentacao;

import com.doacoes.central.negocio.entity.Causa;
import com.doacoes.central.negocio.enums.TipoCausa;
import com.doacoes.central.negocio.service.CausaService;
import com.doacoes.central.negocio.service.CausaServiceImpl;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/causas")
public class CausaControler {

    @Autowired private CausaService causaService;

    @PostMapping
    public Causa criarCausa(@RequestBody Causa causa) {
        return causaService.criarCausa(causa);
    }

    @GetMapping()
    public List<Causa> listarCausas() {
        return causaService.listarCausas();
    }

    @GetMapping("/{id}")
    public Optional<Causa> buscarCausaPorId(@PathVariable Long id ) {
        return causaService.buscarPorId(id);
    }

    @PutMapping("/{id}/{tipo}")
    public Causa atualizarCausa(@PathVariable Long id, @PathVariable TipoCausa tipo, @RequestBody Causa causaAtualizada) {
        return causaService.atualizarCausa(id, tipo, causaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void excluirCausa(@PathVariable Long id) {
        causaService.excluirCausa(id);
    }
}
