package dao;

import model.Sensor;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SensorDao {
    private Sensor Sensor;

    public void inserir (Sensor sensor){
        String sql="insert into Sensor(codigo), (tipo), (loc), values(?),(?),(?)";

        try (Connection conn = Conexao.getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setInt(1,Sensor.getCodigo(model.Sensor.codigo));
            statement.setString(2,Sensor.getTipo());
            statement.setString(3,Sensor.getLoc());
            statement.executeUpdate();

            System.out.println("Sensor cadastrado!");
        }catch (SQLException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    public Sensor buscarPorCodigo(int codigo){
        String sql = "select*from Sensor where codigo = ?";

        try (Connection conn= Conexao.getConnection();
        PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setInt(1,codigo);

            ResultSet resultSet=statement.executeQuery();

            if(resultSet.next()){
                Sensor sensor= new Sensor();
                Sensor.setId(resultSet.getInt("id"));
                Sensor.setCodigo(resultSet.getInt("Codigo"));
                return Sensor;
            }
        }catch (SQLException e){
            System.out.println("Erro:"+e.getMessage());
        }
        return null;
    }
}
