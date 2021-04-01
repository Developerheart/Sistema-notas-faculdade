package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Genero;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Objects;

public class Professor implements Serializable {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    private Integer idProfessor;
    private String name;
    private String sobrenome;
    private String cpf;
    private Integer idade;
    private Date dataNascimento;
    private Genero genero;
    private String area;

    public Professor(){

    }

    public Professor(String name, String sobrenome, String cpf, Integer idade, Date dataNascimento, Genero genero, String area) throws ParseException {
        this.name = name;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.area = area;


    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getName()      {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String formatDate(Date data){
        return sdf.format(data);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(name, professor.name) && Objects.equals(sobrenome, professor.sobrenome) && Objects.equals(cpf, professor.cpf) && Objects.equals(idade, professor.idade) && Objects.equals(dataNascimento, professor.dataNascimento) && genero == professor.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sobrenome, cpf, idade, dataNascimento, genero);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
