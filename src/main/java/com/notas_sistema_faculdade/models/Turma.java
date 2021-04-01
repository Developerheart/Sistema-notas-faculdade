package com.notas_sistema_faculdade.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Turma implements Serializable {


    private Long idTurma;
    private String codigoTurma;
    private List<Materia> materias = new ArrayList<>();
    private List<Turnos> turnos = new ArrayList<>() ;

    public Turma(String codigoTurma) {
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

    public List<Turnos> getTurnos() {
        return turnos;
    }


    public void setIdTurma(Long idTurma) {
        this.idTurma = idTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public void addMaterias(Materia materias) {
        this.materias.add(materias);
    }

    public void addTurnos(Turnos turnos) {
        this.turnos.add(turnos);
    }

    public Turma(){




    }


}
