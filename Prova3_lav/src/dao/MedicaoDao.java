package dao;

import model.Medicao;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicaoDao {

    private Medicao Medicao;

    public void inserir (Medicao medicao){
    String sql="insert into Medicao(valor), (unidade), (dataHora),(sensor), values(?),(?),(?),(?)";

    try (Connection conn = Conexao.getConnection();
         PreparedStatement statement = conn.prepareStatement(sql);
    ){
        statement.setInt(1,Medicao.getValor());
        statement.setString(2,Medicao.getUnidade());
        statement.setInt(3,Medicao.getDataHora());
        statement.setInt(4,Medicao.getSensor());
        statement.executeUpdate();

        System.out.println("Medicao cadastrada!");
    }catch (SQLException e){
        System.out.println("Erro: "+e.getMessage());
    }
}
    public Medicao buscarPorSensor(int sensor){
        String sql = "select*from Medicao where sensor = ?";

        try (Connection conn= Conexao.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setInt(1,sensor);

            ResultSet resultSet=statement.executeQuery();

            if(resultSet.next()){
                Medicao medicao = new Medicao();
                Medicao.setId_medicao(resultSet.getInt("id medicao"));
                Medicao.setValor(resultSet.getInt("Valor"));
                Medicao.setUnidade(resultSet.getString("Unidade"));
                Medicao.setDataHora(resultSet.getInt("Data e Hora"));
                Medicao.setSensor(resultSet.getInt("Sensor"));
                
                return Medicao;

            }
        }catch (SQLException e){
            System.out.println("Erro:"+e.getMessage());
        }
        return null;
    }
}
