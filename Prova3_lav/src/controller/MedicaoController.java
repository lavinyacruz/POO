package controller;

import dao.MedicaoDao;
import model.Medicao;

public class MedicaoController {
    private MedicaoDao dao = new MedicaoDao();
    public void cadastrarMedicao(int valor){
        Medicao medicao = new Medicao();
        Medicao.setValor(valor);
        dao.inserir(medicao);
    }
    public Medicao ConsultarMedicao(int Sensor){
        return dao.buscarPorSensor(Sensor);
    }
}
