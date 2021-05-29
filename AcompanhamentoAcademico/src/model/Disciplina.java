package model;

import java.util.HashMap;

public class Disciplina {
    private String nome;
    private String professor;
    private int qntCreditos;
    private String codigo;
    private int cargaHoraria;
    private HashMap<String, Disciplina> requisitosDaDisciplina;
    private HashMap<String, Disciplina> requisitadaDasDisciplinas;
    

    /*
        CONSTRUTORES
    */
    public Disciplina(String nome, int qntCreditos, String codigo) {
        this.nome = nome;
        this.qntCreditos = qntCreditos;
        this.codigo = codigo;
        this.cargaHoraria = qntCreditos * 15;
        this.requisitosDaDisciplina = new HashMap<>();
        this.requisitadaDasDisciplinas = new HashMap<>();
    }

    public HashMap<String, Disciplina> getRequisitosDaDisciplina() {
        return requisitosDaDisciplina;
    }

    public void addRequisitosDaDisciplina(Disciplina discp) {
        this.requisitosDaDisciplina.put(discp.getCodigo(), discp);
    }

    public HashMap<String, Disciplina> getRequisitadaDasDisciplinas() {
        return requisitadaDasDisciplinas;
    }

    public void addRequisitadaDasDisciplinas(Disciplina discp) {
        this.requisitadaDasDisciplinas.put(discp.getCodigo(), discp);
    }

    

    /*
        SETTERS
    */
    public void setProfessor( String professor) {
        this.professor = professor;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQntCreditos(int qntCreditos){
        this.qntCreditos = qntCreditos;
    }

    /*
        GETTERS
    */
    public String getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }

    public int getQntCreditos(){
        return qntCreditos;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public int getcargaHoraria(){
        return this.cargaHoraria;
    }

}
