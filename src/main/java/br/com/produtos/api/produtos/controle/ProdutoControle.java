package br.com.produtos.api.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produtos.api.produtos.modelo.ProdutoModelo;
import br.com.produtos.api.produtos.servico.ProdutoServico;

@RestController // responsavel por criar as rotas
public class ProdutoControle {

    @Autowired
    private ProdutoServico ps;

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar() {
        return ps.listar();
    }

    @GetMapping("/")
    public String rota() {
        return "API de produtos funcionando!";
    }
}
