package model;

import java.util.ArrayList;

public class GradeCurricular {
    private int ano;
    private ArrayList<Semestre> grade;

    
    /*
        CONSTRUTORES
    */
    public GradeCurricular(int ano) {
        this.ano = ano;
        this.grade = new ArrayList<Semestre>();
    }


    public void AdicionarSemestreGrade(Semestre semestre){

        this.grade.add(semestre);
    }

    public Semestre RetornarSemetre(int numSemetre){

        for (Semestre semestre : this.grade){
            if (semestre.getnumeroSemetre() == numSemetre){
                return semestre;
            }
        }
        return null;
    }

    public int ObterTotalCreditosGrade(){
        int creditos = 0;

        for (Semestre semestre : this.grade){
            creditos += semestre.ObterCreditosSemestre();
        }

        return creditos;
    }

    /*
        SETTERS
    */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /*
        GETTERS
    */
    public int getAno() {
        return ano;
    }

    public ArrayList<Semestre> getSemestres(){
        return grade;
    }

}
