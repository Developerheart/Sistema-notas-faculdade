package com.notas_sistema_faculdade.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Turma implements Serializable {


    private Long idTurma;
    private String codigoTurma;
    private List<Materia> materias;
    private List<Aluno> alunos;
    private List<Turnos> turnos;

    public Turma(){

    }

    public Turma(Long idTurma, String codigoTurma) {
        this.idTurma = idTurma;
        this.codigoTurma = codigoTurma;
    }

    public Long getIdTurma() {
        return idTurma;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Turnos> getTurnos() {
        return turnos;
    }

    public void setIdTurma(Long idTurma) {
        this.idTurma = idTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public void addMaterias(Materia materia) {
        this.materias.add(materia);
    }

    public void addAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void addTurnos(Turnos turno) {
        this.turnos.add(turno);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(idTurma, turma.idTurma) && Objects.equals(codigoTurma, turma.codigoTurma) && Objects.equals(materias, turma.materias) && Objects.equals(alunos, turma.alunos) && Objects.equals(turnos, turma.turnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTurma, codigoTurma, materias, alunos, turnos);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "idTurma=" + idTurma +
                ", codigoTurma='" + codigoTurma + '\'' +
                ", materias=" + materias +
                ", alunos=" + alunos +
                ", turnos=" + turnos +
                '}';
    }
}
