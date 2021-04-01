package com.notas_sistema_faculdade.dao.Insersoes;

import com.notas_sistema_faculdade.dao.ConnectionFactory;
import com.notas_sistema_faculdade.models.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCurso {

    public static void insertCurso(Curso curso){

        try {
            Connection connection = ConnectionFactory.criaConnection();
            String sql = "INSERT INTO sistemafaculdadenotas.cursos (nome_curso) VALUES (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, curso.getNomeCurso());
            ps.execute();
            System.out.println("Log. ->> dados Inseridos com sucesso.!" + sql);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Curso curso = new Curso("Sistemas de informação");
        insertCurso(curso);
    }
}
