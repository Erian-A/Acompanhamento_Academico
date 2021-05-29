package model;

import java.util.Comparator;
import java.util.HashMap;



public class Semestre implements Comparable<Semestre> {

    private HashMap<String, Disciplina> disciplinasSemestre;
    private int numeroSemestre;


    public Semestre(int numeroSemestre){
        this.numeroSemestre = numeroSemestre;
        this.disciplinasSemestre = new HashMap<String, Disciplina>();
    }

    public HashMap<String, Disciplina> getDisciplinasSemestre() {
        return disciplinasSemestre;
    }

    public void setDisciplinasSemestre(HashMap<String, Disciplina> semestre) {
        this.disciplinasSemestre = semestre;
    }


    public int ObterCreditosSemestre(){

        int totalcreditos = 0;

        for (String codigoDisc : this.disciplinasSemestre.keySet()){
            totalcreditos += this.disciplinasSemestre.get(codigoDisc).getQntCreditos();
        }
        return totalcreditos;
    }

    public int getnumeroSemetre(){
        return this.numeroSemestre;
    }

    public void AdicionarDisciplina(Disciplina disciplina){

        this.disciplinasSemestre.put(disciplina.getCodigo(), disciplina);
    }
    
    public int compareTo(Semestre s1){
        if(this.getnumeroSemetre() < s1.getnumeroSemetre()){
            return -1;
        } else if(this.getnumeroSemetre() == s1.getnumeroSemetre()){
            return 0;
        } else {
            return 1;
        }
    }

}
