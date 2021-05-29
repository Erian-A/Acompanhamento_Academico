package model;

public class Aluno extends Pessoa {
    private String matricula;
    //private Historico historico;
    private Semestre semestreAtual;
    private GradeCurricular grade;

    public Aluno(String nome, String email, String matricula){
        super(nome, email);
        this.matricula = matricula;
        this.grade = new GradeCurricular(2020);
        this.semestreAtual = null;
        //this.historico = new Historico();
    }

    // GETTERS E SETTERS 
    public String getMatricula() {
        return matricula;
    }

    public GradeCurricular getGrade() {
        return grade;
    }

    public void addDisciplinaGrade(Disciplina discp, int semestre) {
        this.grade.RetornarSemetre(semestre).AdicionarDisciplina(discp);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /*
    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Semestre semestreCursado) {
        this.historico.setHistorico(semestreCursado);
    }
    */
    public Semestre getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(Semestre semestreAtual) {
        this.semestreAtual = semestreAtual;
    }
}
