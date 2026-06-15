package controller;

import dao.LaboratorioDao;
import model.Laboratorio;

public class LaboratorioController {
    private LaboratorioDao dao = new LaboratorioDao();
    private Laboratorio Laboratorio;

    public void CadastrarLaboratorio(String nome) {
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.setNome(nome);
        dao.inserir(Laboratorio);
    }
}
