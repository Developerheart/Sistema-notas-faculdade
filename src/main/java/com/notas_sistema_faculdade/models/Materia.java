package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Status;

import java.io.Serializable;
import java.util.Objects;

public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idMateria;
    private String nomeMateria;
    private Professor professor;
    private String status;

    public Materia(String nomeMateria, Professor professor, String status) {
        this.nomeMateria = nomeMateria;
        this.professor = professor;
        this.status = status;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(nomeMateria, materia.nomeMateria) && Objects.equals(professor, materia.professor) && Objects.equals(status, materia.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeMateria, professor, status);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nomeMateria='" + nomeMateria + '\'' +
                ", professor=" + professor +
                ", status='" + status + '\'' +
                '}';
    }
}
