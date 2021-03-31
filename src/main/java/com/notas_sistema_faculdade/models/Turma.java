package com.notas_sistema_faculdade.models;

import java.io.Serializable;
import java.util.List;

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
}
