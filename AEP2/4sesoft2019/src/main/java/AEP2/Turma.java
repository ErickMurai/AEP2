package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Turma (String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new RuntimeException("Não pode ser nulo o nome da turma!");
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarAluno(Aluno aluno) {
		if(!this.alunos.contains(aluno)) {
			this.alunos.add(aluno);
			aluno.setTurma(this);
		}
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
}
