package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Cursos;
import com.notas_sistema_faculdade.enums.Genero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Aluno implements Serializable {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private Date dataNascimento;
    private String cpf;
    private String matricula;
    private String rg;
    private Genero genero;
    private List<Notas> notas  = new ArrayList<>();

    /*
     * O construtor não leva matricula, curso pois são definidos por outro sistema.
     */

    public Aluno(String nome, String sobrenome, Integer idade, Date dataNascimento, String cpf, String rg, Genero genero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Notas> getNota() {
        return notas;
    }


    public void setNota(Notas nota) {
        this.notas.add(nota);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(sobrenome, aluno.sobrenome) && Objects.equals(idade, aluno.idade) && Objects.equals(dataNascimento, aluno.dataNascimento) && Objects.equals(cpf, aluno.cpf) && Objects.equals(matricula, aluno.matricula) && Objects.equals(rg, aluno.rg) && genero == aluno.genero && Objects.equals(notas, aluno.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, idade, dataNascimento, cpf, matricula, rg, genero, notas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", rg='" + rg + '\'' +
                ", genero=" + genero +
                ", notas=" + notas +
                '}';
    }
}
