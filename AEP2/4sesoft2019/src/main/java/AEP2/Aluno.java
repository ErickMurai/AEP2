package AEP2;

public class Aluno {
	private final String idDoAluno;
	private final String nomeDoAluno;
	private final double notaDoAluno;
	private Turma turma;
	
	public Aluno(String idDoAluno, String nomeDoAluno, double notaDoAluno) {
		this.idDoAluno = idDoAluno;
		this.nomeDoAluno = nomeDoAluno;
		this.notaDoAluno = notaDoAluno;
	}
	
	public String getIdDoAluno() {
		return idDoAluno;
	}
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	
	public double notaDoAluno() {
		return notaDoAluno;
	}
	
	public Turma getTurma() {
		return this.turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
		this.turma.adicionarAluno(this);
	}
	
	
}
