package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Cursos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PrimitiveIterator;

public class Curso implements Serializable {


    private Long idCurso;
    private String nomeCurso;
    private List<Turma> turmas = new ArrayList<>();
    public Curso() {
    }

    public Curso(Long idCurso, String nomeCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void addTurmas(Turma turma) {
        this.turmas.add(turma);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(idCurso, curso.idCurso) && Objects.equals(nomeCurso, curso.nomeCurso) && Objects.equals(turmas, curso.turmas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso, nomeCurso, turmas);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", turmas=" + turmas +
                '}';
    }

}
