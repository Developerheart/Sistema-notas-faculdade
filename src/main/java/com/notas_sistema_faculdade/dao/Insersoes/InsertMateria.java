package com.notas_sistema_faculdade.dao.Insersoes;

import com.notas_sistema_faculdade.dao.ConnectionFactory;
import com.notas_sistema_faculdade.models.Materia;
import com.notas_sistema_faculdade.models.Professor;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMateria {

    private static Connection connection;

    public static void insertMateria(Materia materia) {
        try {
            connection = ConnectionFactory.criaConnection();
            String sqlToInsertMateria = "INSERT INTO sistemafaculdadenotas.materia (nome, Status) VALUES (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sqlToInsertMateria);
            ps.setString(1,materia.getNomeMateria());
            ps.setString(2, materia.getStatus());
            //ps.setInt(3 , materia.getProfessor().getIdProfessor());
            ps.execute();
            System.out.println("Log. -> Adicionado com sucesso");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

            Professor professor = new Professor();
            Materia materia = new Materia("POO", professor, "Pendente");
            insertMateria(materia);

    }
}
