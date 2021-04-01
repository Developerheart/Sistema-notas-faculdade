package com.notas_sistema_faculdade.dao.Insersoes;

import com.notas_sistema_faculdade.dao.ConnectionFactory;
import com.notas_sistema_faculdade.models.Turma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTurma {

    private static Connection connection;

    public static void insertTurma(Turma turma){
        try {
            connection = ConnectionFactory.criaConnection();
            String sql = "INSERT INTO sistemafaculdadenotas.turma (codigo_class) VALUES (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, turma.getCodigoTurma());
            ps.execute();
            System.out.println("Log. ->> dados Inseridos com sucesso.!");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Turma turma = new Turma("596955ASADADA96");
        insertTurma(turma);
    }

}
