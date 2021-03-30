package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Status;

import java.io.Serializable;
import java.util.Objects;

public class Materia implements Serializable {


    private Materia materia;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;
    private Status status;

    public Materia(Materia materia, Double nota1, Double nota2, Double nota3, Double nota4, Status status) {
        this.materia = materia;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.status = status;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia1 = (Materia) o;
        return Objects.equals(materia, materia1.materia) && Objects.equals(nota1, materia1.nota1) && Objects.equals(nota2, materia1.nota2) && Objects.equals(nota3, materia1.nota3) && Objects.equals(nota4, materia1.nota4) && status == materia1.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(materia, nota1, nota2, nota3, nota4, status);
    }

    @Override
    public String toString() {
        return getMateria() + " - " + getStatus();
    }
}
