package br.com.produtos.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.produtos.api.produtos.modelo.ProdutoModelo;
import br.com.produtos.api.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
    @Autowired
    private ProdutoRepositorio pr;

    // metodo para listar todos os produtos
    public Iterable<ProdutoModelo> listar() {
        return pr.findAll();
    }
}
