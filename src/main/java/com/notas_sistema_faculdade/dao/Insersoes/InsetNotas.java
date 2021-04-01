package com.notas_sistema_faculdade.dao.Insersoes;

import com.notas_sistema_faculdade.dao.ConnectionFactory;
import com.notas_sistema_faculdade.models.Notas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsetNotas {

    private static Connection connection;

    public static void InsetNota(Notas notas){

        try {
            connection = ConnectionFactory.criaConnection();
            String sqlToInsertNoTa = "INSERT INTO sistemafaculdadenotas.notas (Av1, av2, av3, av4) VALUES (?, ? ,? , ?)";
            PreparedStatement ps = connection.prepareStatement(sqlToInsertNoTa);
            ps.setDouble(1, notas.getNota1());
            ps.setDouble(2, notas.getNota2());
            ps.setDouble(3, notas.getNota3());
            ps.setDouble(4, notas.getNota4());
            ps.execute();
            System.out.println("Log. -> Dados inseridos com sucesso");


        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                ConnectionFactory.fecharConnection(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        }

    public static void main(String[] args) {
        Notas nota = new Notas(6, 5.0,6.0,10.0,9.0);
        InsetNota(nota);
    }
    }

