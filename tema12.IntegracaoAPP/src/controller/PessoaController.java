package controller;

import dao.PessoaDao;
import model.Pessoa;

public class PessoaController {
    private PessoaDao dao = new PessoaDao();
    public void cadastrarPessoa(String nome){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        dao.inserir(pessoa);
    }
    public Pessoa consultarPessoa(String nome){
        return dao.buscarPorNome(nome);
    }
}
