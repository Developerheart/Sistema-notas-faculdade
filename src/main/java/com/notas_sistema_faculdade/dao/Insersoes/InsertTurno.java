package com.notas_sistema_faculdade.dao.Insersoes;

import com.notas_sistema_faculdade.dao.ConnectionFactory;
import com.notas_sistema_faculdade.models.Turnos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTurno {

    private static Connection connection;

    public static void InsertTurno(Turnos turno) {

        try {
            connection = ConnectionFactory.criaConnection();
            String sqlToInsertTurno = "INSERT INTO sistemafaculdadenotas.turno (data_incio, data_termino, tipo_turno) VALUES (?, ? , ?)";
            PreparedStatement ps  = connection.prepareStatement(sqlToInsertTurno);
            ps.setDate(1,  new java.sql.Date(turno.getDataInicio().getTime()));
            ps.setDate(2, new  java.sql.Date(turno.getDataTermino().getTime()));
            ps.setString(3, turno.getTipoTurno());
            ps.execute();
            System.out.println("Log. ->> dados Inseridos com sucesso.!");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
     /*
       * Classe para testes!
      */
    public static void main(String[] args) {
        Turnos turno = new Turnos(new Date(2021-4-10), new Date(2021-8-10), "Tarde");
        InsertTurno(turno);
    }

}
