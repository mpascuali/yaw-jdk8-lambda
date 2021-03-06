import static java.lang.System.out; 

import java.util.*;

/**
 * Exemplo de uso de Method References.
 *
 */
public class TesteMethodReference {

	public static void main(String args[]){
		List<Aluno> alunos = buildAlunos();
		Collections.sort(alunos, Aluno::compareByNome);
		out.println("---------------\nAlunos da turma:");
		for (Aluno a: alunos) {
			out.println("\t" + a);
		}

		TesteMethodReference mr = new TesteMethodReference();
		Collections.sort(alunos, mr::otherCompareByNome);
		out.println("---------------\nAlunos da turma (reversa):");
		for (Aluno a: alunos) {
			out.println("\t" + a);
		}
	}


	static List<Aluno> buildAlunos() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Claudia", 7));
		alunos.add(new Aluno("Paula", 9));
		alunos.add(new Aluno("Ricardo", 6));
		alunos.add(new Aluno("Flavia", 4));
		alunos.add(new Aluno("Mario", 8));
		alunos.add(new Aluno("Ana", 5));
		return alunos;
	}

	int otherCompareByNome(Aluno a1, Aluno a2) {
		return a2.getNome().compareTo(a1.getNome());
	}

}

//fazer o sort utilizando method reference static
//fazer o sort utilizando otherCompareByNome
