package com.notas_sistema_faculdade.models;

import java.io.Serializable;
import java.util.Objects;

public class Notas implements Serializable {

    private Integer idNotas;
    private Double nota1 = 0.0;
    private Double nota2 = 0.0;
    private Double nota3 = 0.0;
    private Double nota4 = 0.0;

    public Notas(){

    }

    public Notas(Integer idNotas, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.idNotas = idNotas;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public Integer getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(Integer idNotas) {
        this.idNotas = idNotas;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notas notas = (Notas) o;
        return Objects.equals(idNotas, notas.idNotas) && Objects.equals(nota1, notas.nota1) && Objects.equals(nota2, notas.nota2) && Objects.equals(nota3, notas.nota3) && Objects.equals(nota4, notas.nota4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNotas, nota1, nota2, nota3, nota4);
    }

    @Override
    public String toString() {
        return "Notas{" +
                "idNotas=" + idNotas +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }

    public Double mediaNotas(){
        return getNota1()+getNota2()+getNota3()+getNota4() / 4;
    }

}
