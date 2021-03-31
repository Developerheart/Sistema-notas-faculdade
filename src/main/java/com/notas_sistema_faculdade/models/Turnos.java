package com.notas_sistema_faculdade.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Turnos implements Serializable {

    private Long idTurno;
    private Date dataInicio;
    private Date dataTermino;
    private String tipoTurno;

    public Turnos(Long idTurno, Date dataInicio, Date dataTermino, String tipoTurno) {
        this.idTurno = idTurno;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.tipoTurno = tipoTurno;
    }

    public Long getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Long idTurno) {
        this.idTurno = idTurno;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turnos turnos = (Turnos) o;
        return Objects.equals(idTurno, turnos.idTurno) && Objects.equals(dataInicio, turnos.dataInicio) && Objects.equals(dataTermino, turnos.dataTermino) && Objects.equals(tipoTurno, turnos.tipoTurno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTurno, dataInicio, dataTermino, tipoTurno);
    }

    @Override
    public String toString() {
        return "Turnos{" +
                "idTurno=" + idTurno +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", tipoTurno='" + tipoTurno + '\'' +
                '}';
    }
}
