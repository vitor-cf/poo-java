package poo.excecao;

import java.util.Iterator;

public class Executor {
	public static void main(String[] args) {
		BaseDeDados db = new BaseDeDados();
		System.out.println("Lista de professores:");
		for (int i = 0; i < db.professores().size(); i++) {
			System.out.println(db.professores().get(i).getNome());
		}
		System.out.println("Lista de alunos:");
		for (int i = 0; i < db.alunos().size(); i++) {
			System.out.println(db.alunos().get(i).getNome());
		}
	}
}
