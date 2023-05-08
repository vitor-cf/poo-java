package poo.excecao;

import java.util.List;
import java.util.ArrayList;
public class BaseDeDados {
	
	
	public List<Professor> professores() {
		List<Professor> professores = new ArrayList<Professor>();
		Professor professor;
		
		professor = new Professor();
		professor.setId(1);
		professor.setNome("Fernando");
		professores.add(professor);
		
		professor = new Professor();
		professor.setId(2);
		professor.setNome("Neiva");
		professores.add(professor);
		
		professor = new Professor();
		professor.setId(3);
		professor.setNome("Osvaldo");
		professores.add(professor);
		
		return professores;
	}
	
	public List<Aluno> alunos() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno;
		
		aluno = new Aluno();
		aluno.setId(1);
		aluno.setNome("Vitor");
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setId(2);
		aluno.setNome("Rauivis");
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setId(3);
		aluno.setNome("Arthivis");
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setId(4);
		aluno.setNome("Bira");
		alunos.add(aluno);
		
		return alunos;
	}
}
