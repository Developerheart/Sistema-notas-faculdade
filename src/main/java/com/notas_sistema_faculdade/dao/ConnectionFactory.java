package com.notas_sistema_faculdade.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    /*
     * Criação da conexão com o banco SistemaFaculdadeNotas
     */
    private static final String UrlDb = "jdbc:mysql://localhost:3306/SistemaFaculdadeNotas?useTimezone=true&serverTimezone=Brazil/Acre";
    private static final String UserNameBd = "dev";
    private static final String SenhaBD = "";


    public static Connection criaConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(UrlDb, UserNameBd, SenhaBD);
        return conn;
    }

    public static void fecharConnection(Connection connection) throws SQLException {
        connection.close();
    }

    /*
     * metodo main para testar a conexão da classe.!
     */
    public static void main(String[] args) {
        try {
            criaConnection();
            System.out.println("Conexão com sucesso");

        } catch (Exception error) {
            System.out.println(error.getMessage());
            error.printStackTrace();

        }
    }
}
