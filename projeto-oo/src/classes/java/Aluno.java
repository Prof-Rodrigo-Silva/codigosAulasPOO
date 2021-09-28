package classes.java;

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
	private Disciplina disciplina = new Disciplina();
	
	public Aluno() {
		
	}
	public Aluno(String nomePadrao){
		nome = nomePadrao;
		
	}
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
		
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
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
		return "Aluno [nome=" + nome + ", idade=" + idade + ", disciplina=" + disciplina + "]";
	}
	
	public double CalculaMedia() {
		
		return (disciplina.getNota1()+disciplina.getNota2()+disciplina.getNota3()+disciplina.getNota4())/4;
	}
	
	public String CalculaMedia1() {
		double media = this.CalculaMedia();
		if(media >= 70) {
			return "Aprovado";
		}else {
			return "Reprovado";
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
