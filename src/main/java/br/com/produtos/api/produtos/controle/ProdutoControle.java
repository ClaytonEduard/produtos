package br.com.produtos.api.produtos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // responsavel por criar as rotas
public class ProdutoControle {
    @GetMapping("/")
    public String rota() {
        return "API de produtos funcionando!";
    }
}
