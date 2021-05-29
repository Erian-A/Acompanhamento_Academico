package DAO;

import control.ControlGeral;

public class Sistema{

    public Sistema() {
        
    }
    
    

    public void CadastrarProfessores(ControlGeral controladorGeral){
        
        
        controladorGeral.AdicionarProfessorInsituicao("Daniel", "danielmendes@ufv.br");
        controladorGeral.AdicionarProfessorInsituicao("Thais", "thais.braga@ufv.br");
        controladorGeral.AdicionarProfessorInsituicao("Fabricio", "fabricio.asilva@ufv.br");
        controladorGeral.AdicionarProfessorInsituicao("Glaucia", "glaucia@ufv.br");
        controladorGeral.AdicionarProfessorInsituicao("Nacif", "jnacif@ufv.br");
        controladorGeral.AdicionarProfessorInsituicao("Marcus", "marcus.mendes@ufv.br");

    }

    public void CadastrarDisciplinas(ControlGeral controladorGeral){

        controladorGeral.AdicionarDisciplinaInstituicao("Programacao", 6, "CCF 110");
        controladorGeral.AdicionarDisciplinaInstituicao("Calculo Integral e Diferencial 1", 6, "MAF 141");
        controladorGeral.AdicionarDisciplinaInstituicao("Matematica Discreta", 4, "CCF 130");
        controladorGeral.AdicionarDisciplinaInstituicao("Introdução a Ciencia da Computacao", 2, "CCF 191");

        controladorGeral.AdicionarDisciplinaInstituicao("Algoritmos e Estruturas de Dados I", 6, "CCF 211");
        controladorGeral.AdicionarDisciplinaInstituicao("Introdução aos Sistemas Lógicos e Digitais", 4, "CCF 251");
        controladorGeral.AdicionarDisciplinaInstituicao("Inglês 1", 4, "LEF 215");
        controladorGeral.AdicionarDisciplinaInstituicao("Geometria Analitica e Algebra Linear", 6, "MAF 135");
        controladorGeral.AdicionarDisciplinaInstituicao("Calculo Integral e Diferencial 2", 4, "MAF 143");


        controladorGeral.AdicionarDisciplinaInstituicao("Empreendedorimo e Inovacao I", 4, "ADF 117");
        controladorGeral.AdicionarDisciplinaInstituicao("Organizacao de Computadores 1", 4, "CCF 252");
        controladorGeral.AdicionarDisciplinaInstituicao("Fisica 1", 4, "FIF 201");
        controladorGeral.AdicionarDisciplinaInstituicao("Iniciacao a Estatistica", 4, "MAF 105");
        controladorGeral.AdicionarDisciplinaInstituicao("Calculo Integral e Diferencial 3", 4, "MAF 243");
        controladorGeral.AdicionarDisciplinaInstituicao("Algoritmos e Estruturas de Dados 2", 6, "CCF 212");

        controladorGeral.AdicionarDisciplinaInstituicao("Banco de Dados", 4, "CCF 221");
        controladorGeral.AdicionarDisciplinaInstituicao("Programacao Orientada a Objetos", 4, "CCF 313");
        controladorGeral.AdicionarDisciplinaInstituicao("Projeto e Analise de Algoritmos", 4, "CCF 330");
        controladorGeral.AdicionarDisciplinaInstituicao("Teoria e Modelo de Grafos", 4, "CCF 331");
        controladorGeral.AdicionarDisciplinaInstituicao("Fisica 3", 4, "FIF 203");
        controladorGeral.AdicionarDisciplinaInstituicao("Portugues Instrumental", 4, "LEF 100");
        controladorGeral.AdicionarDisciplinaInstituicao("Teoria Geral da Administracao", 2, "TGA 371");


        controladorGeral.AdicionarDisciplinaInstituicao("Gestão da Diversidade nas Organizações", 2, "ADF 334");
        controladorGeral.AdicionarDisciplinaInstituicao("Fundamentos da Teoria Da Computação", 4, "CCF 131");
        controladorGeral.AdicionarDisciplinaInstituicao("Engenharia de Software 1", 4, "CCF 220");
        controladorGeral.AdicionarDisciplinaInstituicao("Introdução à Ciência dos Dados", 4, "CCF 425");
        controladorGeral.AdicionarDisciplinaInstituicao("Sistemas Operacionais", 4, "CCF 451");
        controladorGeral.AdicionarDisciplinaInstituicao("Redes De Computadores", 4, "CCF 452");
        controladorGeral.AdicionarDisciplinaInstituicao("Laboratório de Física", 2, "FIF 225");
        controladorGeral.AdicionarDisciplinaInstituicao("Cálculo Numérico", 4, "MAF 271");

        controladorGeral.AdicionarDisciplinaInstituicao("Economia 1", 4, "ADF 104");
        controladorGeral.AdicionarDisciplinaInstituicao("Pesquisa Operacional 1", 4, "CCF 280");
        controladorGeral.AdicionarDisciplinaInstituicao("Engenharia de Software 2", 4, "CCF 322");
        controladorGeral.AdicionarDisciplinaInstituicao("Linguagem de Programação", 4, "CCF 340");
        controladorGeral.AdicionarDisciplinaInstituicao("Sistemas Embarcados", 4, "CCF 351");
   
        controladorGeral.AdicionarDisciplinaInstituicao("Atividades Complementares 2", 4, "CCF 291");
        controladorGeral.AdicionarDisciplinaInstituicao("Projeto de Sistemas para Web", 4, "CCF 321");
        controladorGeral.AdicionarDisciplinaInstituicao("Sistemas Distribuídos e Paralelos", 4, "CCF 355");
        controladorGeral.AdicionarDisciplinaInstituicao("Compiladores", 4, "CCF 441");
        controladorGeral.AdicionarDisciplinaInstituicao("Projeto Orientado Em Computação 1", 12, "CCF 496");
   
        controladorGeral.AdicionarDisciplinaInstituicao("Matemática Financeira", 4, "ADF 281");
        controladorGeral.AdicionarDisciplinaInstituicao("Computadores e Sociedade", 4, "CCF 495");
        controladorGeral.AdicionarDisciplinaInstituicao("Projeto Orientado Em Computação 2", 12, "CCF 497");   
    }
    
    public void VincularDisciplinasDaInstituicao(ControlGeral controladorGeral){
        
        controladorGeral.VincularDisciplinas("CCF 110", "CCF 211", 0);
        controladorGeral.VincularDisciplinas("CCF 110", "CCF 212", 0);
        
        controladorGeral.VincularDisciplinas("CCF 130", "CCF 251", 0);
        controladorGeral.VincularDisciplinas("CCF 130", "CCF 131", 0);
        
        controladorGeral.VincularDisciplinas("CCF 211", "CCF 110", 1);
        
        controladorGeral.VincularDisciplinas("CCF 211", "CCF 212", 0);
        controladorGeral.VincularDisciplinas("CCF 211", "CCF 313", 0);
        controladorGeral.VincularDisciplinas("CCF 211", "CCF 131", 0);
        controladorGeral.VincularDisciplinas("CCF 211", "CCF 451", 0);
        controladorGeral.VincularDisciplinas("CCF 211", "CCF 452", 0);
        controladorGeral.VincularDisciplinas("CCF 211", "CCF 351", 0);
        
        
        controladorGeral.VincularDisciplinas("CCF 251", "CCF 130", 1);
        
        controladorGeral.VincularDisciplinas("CCF 251", "CCF 252", 0);
        
        /*
        controladorGeral.VincularDisciplinas("CCF 251", "CCF 211", 0);
        controladorGeral.VincularDisciplinas("CCF 251", "CCF 211", 0);
        controladorGeral.VincularDisciplinas("CCF 251", "CCF 211", 0);
        */
    }

    public void CadastrarCurso(ControlGeral controladorGeral){

        controladorGeral.AdicionarCursoInstituicao("CDC", "Bacharelado em Ciencia da Computacao");
    }

    public void CadastrarDepartamento(ControlGeral controladorGeral){

        controladorGeral.AdicionarDepartamentoInstituicao("Instituto de Ciencias Exatas e Tecnologicas", 
        "IFF", "cienciadacomputacao.caf@ufv.br", "(31) 3602-1000");
    }

    public void CadastrarGrade(ControlGeral controladorGeral){

        controladorGeral.AdicionarGradeCurso("CDC", 2020);
    }

    public void CadastrarSemestre(ControlGeral controladorGeral){

        controladorGeral.AdicionarSemetreGradeCurso("CDC", 1);
        controladorGeral.AdicionarSemetreGradeCurso("CDC", 2);
        controladorGeral.AdicionarSemetreGradeCurso("CDC", 3);
        controladorGeral.AdicionarSemetreGradeCurso("CDC", 4);
        controladorGeral.AdicionarSemetreGradeCurso("CDC", 5);
        controladorGeral.AdicionarSemetreGradeCurso("CDC", 6);
        controladorGeral.AdicionarSemetreGradeCurso("CDC", 7);
        controladorGeral.AdicionarSemetreGradeCurso("CDC", 8);
        

    }

    public void CadastrarDisciplinaSemestre(ControlGeral controladorGeral){

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 110", 1);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 130", 1);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 191", 1);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 141", 1);

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 211", 2);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 251", 2);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "LEF 215", 2);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 135", 2);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 143", 2);

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 212", 3);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 252", 3);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "FIF 201", 3);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "ADF 117", 3);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 105", 3);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 243", 3);

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 221", 4);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 313", 4);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 330", 4);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 331", 4);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "FIF 203", 4);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "TGA 371", 4);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "LEF 100", 4);

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "ADF 334", 5);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 131", 5);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 220", 5);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 425", 5);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 451", 5);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 452", 5);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "FIF 225", 5);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 271", 5);

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "ADF 104", 6);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 280", 6);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 322", 6);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 340", 6);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 351", 6);

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 291", 7);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 321", 7);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 355", 7);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 441", 7);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 496", 7);
   

        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "ADF 281", 8);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 495", 8);
        controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 497", 8);
    }


    public void Conectar(ControlGeral controladorGeral){

        controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 221");
        controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 330");
        controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 110");
        controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 251");
        controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 252");
        controladorGeral.VincularProfessorDisciplina("Thais", "CCF 211");
        controladorGeral.VincularProfessorDisciplina("Glaucia", "CCF 212");


        controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 110");
        controladorGeral.VincularProfessorDisciplina("Fabricio", "CCF 130");
        controladorGeral.VincularProfessorDisciplina("Thais", "CCF 191");

        controladorGeral.VincularProfessorDisciplina("Thais", "CCF 211");
        controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 251");
        
        
        

        controladorGeral.VincularProfessorDisciplina("Glaucia", "CCF 212");
        controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 252");
  
  
  
  

        controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 221");
        controladorGeral.VincularProfessorDisciplina("Fabricio", "CCF 313");
        controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 330");
        controladorGeral.VincularProfessorDisciplina("Marcus", "CCF 331");
        //s.controladorGeral.VincularProfessorDisciplina("CDC", "FIF 203");
        //s.controladorGeral.VincularProfessorDisciplina("CDC", "TGA 371");
        //s.controladorGeral.VincularProfessorDisciplina("CDC", "LEF 100");

        //s.controladorGeral.VincularProfessorDisciplina("CDC", "ADF 334");
        controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 131");
        controladorGeral.VincularProfessorDisciplina("Glaucia", "CCF 220");
        controladorGeral.VincularProfessorDisciplina("Fabricio", "CCF 425");
        controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 451");
        controladorGeral.VincularProfessorDisciplina("Thais", "CCF 452");
        //s.controladorGeral.VincularProfessorDisciplina("CDC", "FIF 225");
        //s.controladorGeral.VincularProfessorDisciplina("CDC", "MAF 271");

        //s.controladorGeral.VincularProfessorDisciplina("CDC", "ADF 104");
        controladorGeral.VincularProfessorDisciplina("Marcus", "CCF 280");
        controladorGeral.VincularProfessorDisciplina("Glaucia", "CCF 322");
        controladorGeral.VincularProfessorDisciplina("Thais", "CCF 340");
        controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 351");

        //s.controladorGeral.VincularProfessorDisciplina("CDC", "CCF 291");
        //s.controladorGeral.VincularProfessorDisciplina("CDC", "CCF 321");
        controladorGeral.VincularProfessorDisciplina("Thais", "CCF 355");
        controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 441");
        //this.controladorGeral.VincularProfessorDisciplina("CDC", "CCF 496");
        
    }

}