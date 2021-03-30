package com.notas_sistema_faculdade.models;

import com.notas_sistema_faculdade.enums.Cursos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Curso implements Serializable {

    private Cursos curso;
    private List<Materia> materia = new ArrayList<>();
    private List<Aluno> aluno = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public Curso() {
    }

    public Curso(Cursos curso) {
        this.curso = curso;
    }

    public Cursos getCurso() {
        return curso;
    }

    public List<Materia> getMateria() {
        return materia;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public void addAluno(Aluno aluno) {
        this.aluno.add(aluno);
    }

    public void addProfessores(Professor professor) {
        this.professores.add(professor);
    }

    public void addMateria(Materia materia){
        this.materia.add(materia);
        System.out.println("Adicionado com sucesso!");
    }
}
