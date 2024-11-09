package com.doacoes.central.apresentacao;

import com.doacoes.central.negocio.entity.Doacao.Doacao;
import com.doacoes.central.negocio.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doacoes")
public class DoacaoControler {

    private final DoacaoService doacaoService;

    @Autowired
    public DoacaoControler(DoacaoService doacaoService) {
        this.doacaoService = doacaoService;
    }

    @PostMapping
    public Doacao criarDoacao(@RequestBody Doacao doacao) {
        return doacaoService.criarDoacao(doacao);
    }

    @GetMapping
    public List<Doacao> listarDoacoes() {
        return doacaoService.listarDoacoes();
    }

    @GetMapping("/{id}")
    public Optional<Doacao> buscarDoacaoPorId(@PathVariable Long id) {
        return doacaoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Doacao atualizarDoacao(@PathVariable Long id, @RequestBody Doacao doacaoAtualizada) {
        return doacaoService.atualizarDoacao(id, doacaoAtualizada);
    }

    @DeleteMapping("/{id}")
    public void excluirDoacao(@PathVariable Long id) {
        doacaoService.excluirDoacao(id);
    }
}
