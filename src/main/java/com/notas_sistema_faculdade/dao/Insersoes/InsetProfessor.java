package com.notas_sistema_faculdade.dao.Insersoes;

import com.notas_sistema_faculdade.dao.ConnectionFactory;
import com.notas_sistema_faculdade.enums.Genero;
import com.notas_sistema_faculdade.models.Professor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsetProfessor {


    private  static  Connection connection;

    public static void InsertProfessor(Professor professor){
        try {
            connection = ConnectionFactory.criaConnection();
            String sqlToInsertProfessor = "INSERT INTO sistemafaculdadenotas.professor (nome, sobrenome, idade, data_nascimento, genero, area, cpfProfessor) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sqlToInsertProfessor);
            ps.setString(1, professor.getName());
            ps.setString(2, professor.getSobrenome());
            ps.setInt(3, professor.getIdade());
            ps.setDate(4,  new java.sql.Date(professor.getDataNascimento().getTime()));
            ps.setString(5, String.valueOf(professor.getGenero()));
            ps.setString(6, professor.getArea());
            ps.setString(7, professor.getCpf());
            ps.execute();
            System.out.println("Log. -> Adicionado com sucesso");


        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }


    }

    public static void main(String[] args) throws ParseException {


        try {
            Professor professor = new Professor("Leo", "Souza", "1845117", 19, new Date(2000-10-10), Genero.MASCULINO, "asdsadsa");
            InsertProfessor(professor);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
