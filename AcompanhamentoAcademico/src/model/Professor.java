package model;

import java.util.HashMap;

public class Professor extends Pessoa{
    HashMap<String, Disciplina> disciplinasLecionadas;

    public Professor (String nomeProf, String email){
        super(nomeProf, email);
        this.disciplinasLecionadas = new HashMap<>();
    }

    // GETTERS E SETTERS

    public HashMap<String, Disciplina> getDisciplinasLecionadas() {
        return disciplinasLecionadas;
    }


    public void setDisciplinasLecionadas(Disciplina disciplina) {
        this.disciplinasLecionadas.put(disciplina.getCodigo(), disciplina);
    }

    public void listarDisciplinas(){
        System.out.println("");
        System.out.println("Disciplinas: ");
        System.out.println("");
        for (var d: this.disciplinasLecionadas.keySet()){
            System.out.println(this.disciplinasLecionadas.get(d).getNome() + " - " + this.disciplinasLecionadas.get(d).getCodigo());
            
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\n\n");
    }
  
}
