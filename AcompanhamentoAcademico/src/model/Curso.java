package model;

import java.util.HashMap;

public class Curso {

    private String codigo;
    private String nome;
    private GradeCurricular gradePadrao;
    private HashMap<String, Professor> professores = new HashMap<String, Professor>();


    /*
        CONSTRUTORES
    */
    public Curso(String id, String nome){

        this.setCodigo(id);
        this.setNome(nome);
    }

    /*
        GETTERS
    */
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public GradeCurricular getGradePadrao() {
        return gradePadrao;
    }

    public HashMap<String, Professor> getProfessores() {
        return professores;
    }



    /*
        SETTERS
    */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGradePadrao(GradeCurricular gradePadrao) {
        this.gradePadrao = gradePadrao;
    }

    public void setProfessores(HashMap<String, Professor> professores) {
        //this.professores.put(professores.getNome(), professores);
    }

}
