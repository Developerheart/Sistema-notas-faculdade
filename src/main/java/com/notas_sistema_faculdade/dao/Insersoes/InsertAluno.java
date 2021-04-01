package com.notas_sistema_faculdade.dao.Insersoes;

import com.notas_sistema_faculdade.dao.ConnectionFactory;
import com.notas_sistema_faculdade.enums.Genero;
import com.notas_sistema_faculdade.models.Aluno;
import com.notas_sistema_faculdade.models.Notas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertAluno {

    private static Connection connection;

    public static  void insertAluno(Aluno aluno){

        try {
            connection = ConnectionFactory.criaConnection();
            String sql = "INSERT INTO sistemafaculdadenotas.alunos (nome, sobrenome, cpf_aluno, genero, matricula, status, rg_aluno) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getSobrenome());
            ps.setString(3 ,aluno.getCpf());
            ps.setString(4, String.valueOf(aluno.getGenero()));
            ps.setString(5, aluno.getMatricula());
            ps.setString(6, aluno.getStatus());
            ps.setString(7, aluno.getRg());
            ps.execute();
            System.out.println("Log. ->> Dados inseridos com sucesso");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("vini", "souza", 18, new Date(2007-3-7),"032458565", "128541", Genero.MASCULINO, new Notas(), "Cursando");
        insertAluno(aluno);

    }
}
