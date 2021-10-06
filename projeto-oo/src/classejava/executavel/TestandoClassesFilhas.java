package classejava.executavel;

import classes.java.Aluno;
import classes.java.Diretor;
import classes.java.Pessoa;
import classes.java.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("João");
		aluno.setNomeEscola("Dinarte Ribeiro");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		
		diretor.setNome("Jossana");
		diretor.setRegistroEducacao("123456");
		diretor.setIdade(33);
		
		Secretario secretario = new Secretario();
		
		secretario.setNome("Aline");
		secretario.setNivelCargo("Médio");
		secretario.setIdade(18);
		
		/*System.out.println(aluno.getNome());
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.getNome());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.getNome());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println(aluno.salario());
		System.out.println(diretor.salario());
		System.out.println(secretario.salario());*/
		//Pessoa pessoa = new Pessoa();
		
		//Polimorfismo
		//Pessoa pessoa = new Aluno();
		//pessoa = secretario;
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	
	}
	public static void teste(Pessoa pessoa) {
		System.out.println("Nome: "+pessoa.getNome()+" e o salário é de R$: "+pessoa.salario());
		
	}

}
