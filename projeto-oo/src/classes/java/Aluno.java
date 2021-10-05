package classes.java;

import java.util.ArrayList;
import java.util.List;

import atributos.estaticos.StatusAluno;

public class Aluno {
	
	private String nome;
	//public String matricula;
	private int idade;
	/*String dataNascimento;
	String numeroCpf;
	String registroGeral;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;*/
	//private Disciplina disciplina = new Disciplina();
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno() {
		
	}
	public Aluno(String nomePadrao){
		nome = nomePadrao;
		
	}
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
		
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
		
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", disciplinas=" + disciplinas + "]";
	}
	public double CalculaMedia() {
		double somaNotas = 0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}
	
	public String CalculaMedia1() {
		double media = this.CalculaMedia();
		
		if(media >=50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;			
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
		
	public boolean CalculaMedia2() {
		double media = this.CalculaMedia();
		if(media >= 70) {
			return true;
		}else {
			return false;
			}
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
	
	

	
	
	
		

}