import java.util.*;

public class Aluno implements CriterioAprovacao {

	private String nome;

	private Integer nota;

	public Aluno(String nome, Integer nota){
		this.nome = nome;
		this.nota = nota;
	}

	public void setNome(String nm){
		nome = nm;
	}

	public String getNome() {
		return this.nome;
	}

	public Integer getNota() {
		return this.nota;
	}

	//metodo utilizado para referencia Aluno::compareByNome
	public static int compareByNome(Aluno a1, Aluno a2) {
		return a1.nome.compareTo(a2.nome);
	}

	/*public boolean isAprovado() {
		return this.nota > 5;
	}*/

	public String toString() {
		return this.nome + " - Nota: "+this.nota;
	}
}

