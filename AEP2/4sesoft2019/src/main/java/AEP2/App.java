package AEP2;

public class App {
	
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("A1", "Paulo", 5.00d);
		Aluno a2 = new Aluno("A2", "Verena", 9.00d);
		Aluno a3 = new Aluno("A3", "Gabriel", 4.00d);
		Aluno a4 = new Aluno("A4", "Samy", 5.00d);
		
		Turma t1 = new Turma("esoft1");
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		
		imprimirAlunoDaTurmaNoConsole(t1);
	}
	
	private static void imprimirAlunoDaTurmaNoConsole(Turma turma) {
		System.out.println("Alunos da turma: " + turma.getNome());
		for(Aluno aluno : turma.getAlunos()) {
			System.out.println(aluno.getNomeDoAluno());
		}
	}
}
