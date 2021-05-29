package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import model.*;


public class ControlGeral {

    private Instituicao instituicao;

    public ControlGeral(String nome){
        this.instituicao = new Instituicao(nome);
        Aluno aluno = new Aluno("Magali", "maga@ufv.br", "ML-0001");
        this.instituicao.setAlunosMatriculados(aluno);
    }
    
    
    public Instituicao getInstituicao(){

        return this.instituicao;
    }

    public void AdicionarDepartamentoInstituicao(String nome, String codigo, String email, String telefone){
        Departamento dep = new Departamento(nome, codigo, email, telefone);

        this.instituicao.setDepartamentos(dep.getCodigo(), dep);
    }

    public void AdicionarCursoInstituicao(String id, String nome){
        Curso curso = new Curso(id, nome);

        //System.out.println(curso.getNome());
        this.instituicao.setCursos(curso.getCodigo(), curso);
    }

    public void AdicionarDisciplinaInstituicao(String nome, int qntCreditos, String codigo){

        Disciplina disciplina = new Disciplina(nome, qntCreditos, codigo);

        this.instituicao.setDisciplina(disciplina.getCodigo(), disciplina);
    }

    public void AdicionarProfessorInsituicao(String nomeProf, String email){

        Professor professor = new Professor(nomeProf, email);

        this.instituicao.setProfessores(professor.getNome(), professor);
        
    }
    
    public void AdicionarAlunoInstituicao(String nome, String email, String matricula){
        
        Aluno aluno = new Aluno(nome, email, matricula);
        
        this.instituicao.setAlunosMatriculados(aluno);
    }

    public void AdicionarGradeCurso(String codigoCurso, int ano){

        GradeCurricular grade = new GradeCurricular(ano);

        //System.out.println(this.instituicao.getCursos().get(codigoCurso).getNome());
        this.instituicao.getCursos().get(codigoCurso).setGradePadrao(grade);
    }

    public void AdicionarSemetreGradeCurso(String codigoCurso, int numeroSemestre){

        Semestre semestre = new Semestre(numeroSemestre);

        this.instituicao.getCursos().get(codigoCurso).getGradePadrao().AdicionarSemestreGrade(semestre);
    }

    public void AdicionarDisciplinaSemetreGradeCurso(String codigoCurso, String codigoDiscp, int numSemetre){

        Disciplina disciplina = this.instituicao.getDisciplinas().get(codigoDiscp);

        Semestre semestre = this.instituicao.getCursos().get(codigoCurso).getGradePadrao().RetornarSemetre(numSemetre);

        if (semestre != null){
            semestre.AdicionarDisciplina(disciplina);
        }
        else {
            System.err.println("Nao ha um semestre cadastrado para este numero");
        }
    }

    public void VincularProfessorDisciplina(String nomeProf, String codigoDiscp){

        Professor professor = this.instituicao.getProfessores().get(nomeProf);

        Disciplina disciplina = this.instituicao.getDisciplinas().get(codigoDiscp);

        disciplina.setProfessor(professor.getNome());
        professor.setDisciplinasLecionadas(disciplina);
    }
    
    /* 
        Se for para definir como requisito, código = 1
        Como requisitada, código = 0
    */
    public void VincularDisciplinas(String codigoDisciplina, String codigoDiscpConectar, int codigo){
        
        Disciplina disciplinaPrincipal = this.instituicao.getDisciplinas().get(codigoDisciplina);
        Disciplina disciplinaAVincular = this.instituicao.getDisciplinas().get(codigoDiscpConectar);
        
        if (codigo == 1){
            disciplinaPrincipal.addRequisitosDaDisciplina(disciplinaAVincular);
        }
        else if (codigo == 0){
            disciplinaPrincipal.addRequisitadaDasDisciplinas(disciplinaAVincular);
        }
        
        
    }

    public Disciplina RetornarDisciplinaInstituicao(String codigoDiscp){
        
        Disciplina discp = this.instituicao.getDisciplinas().get(codigoDiscp);
        
        return discp;
    }
    
    public Semestre RetornarSemestreGrade(int numSemestre, String codigoCurso){

        Semestre semestre = this.instituicao.getCursos().get(codigoCurso).getGradePadrao().RetornarSemetre(numSemestre);

        return semestre;

    }
    
    public Professor RetornarProfessor(String nomeProfessor){
        
        HashMap<String, Professor> professores = this.instituicao.getProfessores();
        
        for (String nome : professores.keySet()){
            if (nome.contains(nomeProfessor)){
                return professores.get(nome);
            }
        }
        return null;
    }
    
    public boolean VerificarAlunoMatriculado(String nomeAluno){
        HashMap<String, Aluno> alunos = this.instituicao.getAlunosMatriculados();
        
        for (String nome : alunos.keySet()){
            if (nome.contains(nomeAluno)){
                return true;
            }
        }
        return false;
        
    }
    
    public Aluno RetornarAlunoMatriculado(String nomeAluno){
        HashMap<String, Aluno> alunos = this.instituicao.getAlunosMatriculados();
        
        for (String nome : alunos.keySet()){
            if (nome.contains(nomeAluno)){
                return alunos.get(nome);
            }
        }
        return null;
        
    }
    
    public boolean VerificarRequisitos(GradeCurricular grade, Disciplina discp){
        
        int numRequisitos = discp.getRequisitosDaDisciplina().size();
        int contador = 0;
        
        for (String codigoDiscRequisito : discp.getRequisitosDaDisciplina().keySet()){
            for (Semestre semestre : grade.getSemestres()){
            
                if (semestre.getDisciplinasSemestre().containsKey(codigoDiscRequisito)){
                    contador++;
                }
            }
            
            if (contador == 0){
                return false;
            }
        }
        
        if (contador == numRequisitos){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void DefinirSemestreAtual(int numSemestre, String nomeAluno){
        
        Semestre semestre = this.instituicao.getAlunosMatriculados().get(nomeAluno).getGrade().RetornarSemetre(numSemestre);
        this.instituicao.getAlunosMatriculados().get(nomeAluno).setSemestreAtual(semestre);
    }
    
    public int porcentagemCreditosCursados(String codigoCurso, String nomeAluno){
        Aluno aluno = this.instituicao.getAlunosMatriculados().get(nomeAluno);
        Semestre semestre = aluno.getSemestreAtual();
        ArrayList<Semestre>  semestres = aluno.getGrade().getSemestres();
        Collections.sort(semestres);
        double porcentagem;
        int creditos = 0;

        for(Semestre s: semestres){
            if(s.getnumeroSemetre() == semestre.getnumeroSemetre()){
                break;
            }
            creditos += s.ObterCreditosSemestre();
        }

        System.out.println("Total creditos: " + this.instituicao.getCursos().get(codigoCurso).getGradePadrao().ObterTotalCreditosGrade());

        porcentagem = (double) creditos/this.instituicao.getCursos().get(codigoCurso).getGradePadrao().ObterTotalCreditosGrade();
        porcentagem *= 100;

        System.out.println("Porcentagem: " + (int) porcentagem + "%");

        return (int) porcentagem;
    }

    public int creditosCursados(String codigoCurso, String nomeAluno){
        Aluno aluno = this.instituicao.getAlunosMatriculados().get(nomeAluno);
        Semestre semestre = aluno.getSemestreAtual();
        ArrayList<Semestre> semestres = aluno.getGrade().getSemestres();
        Collections.sort(semestres);
        int creditos = 0;

        for(Semestre s: semestres){
            if(s.getnumeroSemetre() == semestre.getnumeroSemetre()){
                break;
            }
            creditos += s.ObterCreditosSemestre();
        }

        return creditos;
    }


    public void ExibirDepartamentoControle(){
        this.instituicao.getDepartamentos().get("IFF").ExibirDepartamento();
    }
}
