package dao;

import model.Pessoa;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement; //permite executar comando sql
import java.sql.ResultSet; // permite armazenar resultado de consultas
import java.sql.SQLException;

public class PessoaDao {

    public void inserir (Pessoa pessoa){
        String sql = "insert into pessoa(nome) values(?)";
      try (Connection conn = Conexao.getConnetion();
      PreparedStatement statement = conn.prepareStatement(sql);
      ){
          statement.setString(1,pessoa.getNome());
          statement.executeUpdate();
          System.out.println("Pessoa cadastrada com sucesso!");
    }catch (SQLException e) {
          System.out.println("Erro: "+e.getMessage());
      }
      }
    public Pessoa buscarPorNome(String nome){
        String sql = "select + from pessoa Where nome=";
        try (Connection conn = Conexao.getConnetion();
             PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setString(1,nome);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setId(resultSet.getInt("id"));
                pessoa.setNome(resultSet.getString("nome"));
            return pessoa;
            }
        }catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        }
        return null;
    }
}
