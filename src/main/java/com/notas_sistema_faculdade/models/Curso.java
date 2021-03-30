package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Cursos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Curso implements Serializable {

    private Cursos curso;
    private List<Materia> materia = new ArrayList<>();
    private Aluno aluno;

    public Curso() {
    }

    public Curso(Cursos curso, Aluno aluno) {
        this.curso = curso;
        this.aluno = aluno;
    }

    public Cursos getCurso() {
        return curso;
    }

    public List<Materia> getMateria() {
        return materia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void addMateria(Materia materia){
        this.materia.add(materia);
        System.out.println("Adicionado com sucesso!");
    }
}
