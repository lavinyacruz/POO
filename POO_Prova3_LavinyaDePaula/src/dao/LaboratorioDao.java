package dao;

import model.Laboratorio;
import util.Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LaboratorioDao{
    public void inserir(Laboratorio laboratorio);
    String sql = "insert into labs(nome) values(?)";
    try (Connection conn = Conexao.getConnection();
    PreparedStatement statement= conn.prepareStatement(sql);
    ){
        statement.setString(1,Laboratorio.getNome());
        statement.executeUpdate();
        System.out.println("Laboratorio cadastrado com sucesso!");
    }catch (SQLException e){
        System.out.println("Erro"+e.getMessage());
    }
}

