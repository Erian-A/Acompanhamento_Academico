package model;

import java.util.HashMap;

public class Instituicao {
    private String nome;
    private HashMap<String, Disciplina> disciplinas;
    private HashMap<String, Professor> professores;
    private HashMap<String, Curso> cursos;
    private HashMap<String, Departamento> departamentos;
    private HashMap<String, Aluno> alunosMatriculados;

    public Instituicao(String nome){
        this.nome = nome;
        this.disciplinas = new HashMap<String, Disciplina>();
        this.professores = new HashMap<String, Professor>();
        this.cursos = new HashMap<String, Curso>();
        this.departamentos = new HashMap<String, Departamento>();
        this.alunosMatriculados = new HashMap<>();
    }

    public HashMap<String, Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(Aluno aluno) {
        this.alunosMatriculados.put(aluno.getNome(), aluno);
    }


    /* Getters */
    public String getNome(){
        return this.nome;
    }

    public HashMap<String, Disciplina> getDisciplinas(){
        return this.disciplinas;
    }

    public HashMap<String, Professor> getProfessores(){
        return this.professores;
    }

    public HashMap<String, Curso> getCursos(){
        return this.cursos;
    }

    public HashMap<String, Departamento> getDepartamentos(){
        return this.departamentos;
    }



    /* Setters */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDisciplina(String nomeDisciplina, Disciplina disciplina){
        this.disciplinas.put(nomeDisciplina, disciplina);
    }

    public void setProfessores(String nomeProfessor, Professor professores){
        this.professores.put(nomeProfessor, professores);
    }

    public void  setCursos(String codigoCurso, Curso cursos){
        this.cursos.put(codigoCurso, cursos);
    }

    public void setDepartamentos(String codigo, Departamento departamentos){
        this.departamentos.put(codigo, departamentos);
    }

}
