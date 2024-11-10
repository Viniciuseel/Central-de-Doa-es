package com.doacoes.central.apresentacao;

import com.doacoes.central.negocio.entity.Doacao;
import com.doacoes.central.negocio.service.DoacaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doacoes")
public class DoacaoControler {

    private final DoacaoServiceImpl doacaoService;

    @Autowired
    public DoacaoControler(DoacaoServiceImpl doacaoServiceImpl) {
        this.doacaoService = doacaoServiceImpl;
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
