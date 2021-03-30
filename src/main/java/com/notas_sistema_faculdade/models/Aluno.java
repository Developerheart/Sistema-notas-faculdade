package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Cursos;
import com.notas_sistema_faculdade.enums.Genero;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private String dataNascimento;
    private String cpf;
    private String matricula;
    private String rg;
    private Genero genero;
    private Cursos cursos;

    /*
     * O construtor não leva matricula, curso pois são definidos por outro sistema.
     */

    public Aluno(String nome, String sobrenome, Integer idade, String dataNascimento, String cpf, String rg, Genero genero) {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome) && sobrenome.equals(aluno.sobrenome) && idade.equals(aluno.idade) && dataNascimento.equals(aluno.dataNascimento) && cpf.equals(aluno.cpf) && matricula.equals(aluno.matricula) && rg.equals(aluno.rg) && genero == aluno.genero && cursos == aluno.cursos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, idade, dataNascimento, cpf, matricula, rg, genero, cursos);
    }

    @Override
    public String toString() {
        return getNome() + " - " + getMatricula();
    }
}
