package controller;

import dao.SensorDao;
import model.Sensor;

public class SensorController {
    private SensorDao dao = new SensorDao();
    public void cadastrarSensor(int codigo){
        Sensor sensor= new Sensor();
        Sensor.getCodigo(codigo);
        dao.inserir(sensor);
    }
    public Sensor ConsultarSensor(int Codigo){
        return dao.buscarPorCodigo(Codigo);
    }
}
