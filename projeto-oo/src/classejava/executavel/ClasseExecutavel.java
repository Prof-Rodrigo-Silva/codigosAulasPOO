package classejava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import atributos.estaticos.StatusAluno;
import classes.java.Aluno;
import classes.java.Disciplina;
import classes.java.Secretario;
import classesauxiliares.FuncaoAutenticacao;
import interfaces.PermitirAcesso;

public class ClasseExecutavel {
	
	public static void main(String[] args) {
		//O objeto ainda não existe na memoria
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		// 1° Modo - setando atributos da classe!!
		/*Secretario secretario = new Secretario();
		
		secretario.setLogin(login);
		secretario.setSenha(senha);
		
		if(secretario.autenticar()) {
			
			JOptionPane.showMessageDialog(null, "ACESSOU!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		
		//2° Metodo - Passagem de Parametros
		PermitirAcesso secretario = new Secretario();
		
		if(secretario.autenticar(login, senha)) {
			
			JOptionPane.showMessageDialog(null, "ACESSOU!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		
		//3° Metodo - Construtores
		PermitirAcesso secretario = new Secretario(login,senha);
		
		if(secretario.autenticar()) {
			
			JOptionPane.showMessageDialog(null, "ACESSOU!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		
		FuncaoAutenticacao autentificacao = new FuncaoAutenticacao();
		PermitirAcesso permitirAcesso = new Secretario(login,senha);
		
		if(autentificacao.autenticarAcesso(permitirAcesso)) {
			
			JOptionPane.showMessageDialog(null, "ACESSOU!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}*/
		
		//FuncaoAutenticacao autentificacao = new FuncaoAutenticacao();
		PermitirAcesso permitirAcesso = new Secretario(login,senha);
		
		if(new FuncaoAutenticacao(new Secretario(login,senha)).autenticarAcesso()) {
			
			JOptionPane.showMessageDialog(null, "ACESSOU!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		/*
		Aluno aluno1;
		aluno1.
		
		Aluno aluno2 = new Aluno("Maria");
		System.out.println(aluno2.nome);
		Aluno aluno3 = new Aluno("Pedro");
		Aluno aluno4 = new Aluno("Laura",18);
		System.out.println("O nome é "+aluno4.nome+" e a idade é "+aluno4.idade);
		Aluno aluno5 = new Aluno();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setIdade(37);
		aluno.setNota1(90);
		aluno.setNota2(80);
		aluno.setNota3(70);
		aluno.setNota4(60);
		
		System.out.println("Nome = "+aluno.getNome());
		System.out.println("Idade = "+aluno.getIdade());
		System.out.println("Nota1 = "+aluno.getNota1());
		System.out.println("Nota2 = "+aluno.getNota2());
		System.out.println("Nota3 = "+aluno.getNota3());
		System.out.println("Nota4 = "+aluno.getNota4());
		
		System.out.println(aluno.toString());*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		//É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for( int qtd = 1; qtd <= 2; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome? ");
		String idade = JOptionPane.showInputDialog("Qual idade? ");
		/*String disciplina1 = JOptionPane.showInputDialog("informe a disciplina1: ");
		String nota1 = JOptionPane.showInputDialog("informe a nota1: ");
		String disciplina2 = JOptionPane.showInputDialog("informe a disciplina2: ");
		String nota2 = JOptionPane.showInputDialog("informe a nota2: ");
		String disciplina3 = JOptionPane.showInputDialog("informe a disciplina3: ");
		String nota3 = JOptionPane.showInputDialog("informe a nota3: ");
		String disciplina4 = JOptionPane.showInputDialog("informe a disciplina4: ");
		String nota4 = JOptionPane.showInputDialog("informe a nota4: ");*/
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(Integer.parseInt(idade));
		
		for(int pos = 1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome  da Disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			//disciplina.setNota(Double.parseDouble(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
		}
		/*int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
			//aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover)); //intValue;
			aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover)-1);
			
		}
		if (escolha == 0) {
			
			int continuarRemover = 0;
			
			int posicao = 1;
			
			while(continuarRemover == 0){
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
				aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover)- posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				
			}
		}
		
		aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno.getDisciplina().setNota4 (Double.parseDouble(nota4));
		aluno.getDisciplina().setDisciplina1(disciplina1);
		aluno.getDisciplina().setDisciplina2(disciplina2);
		aluno.getDisciplina().setDisciplina3(disciplina3);
		aluno.getDisciplina().setDisciplina4(disciplina4);*/
			alunos.add(aluno);
		
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		
		for(Aluno aluno : alunos) {
			
			if(aluno.CalculaMedia1().equalsIgnoreCase(StatusAluno.APROVADO)) {
				//alunosAprovados.add(aluno);
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.CalculaMedia1().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				//alunosRecuperacao.add(aluno);
			}else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
				//alunosReprovados.add(aluno);
			}
		}
		System.out.println("------------------Lista Aprovados----------------");
		for(Aluno aluno: maps.get(StatusAluno.APROVADO)){
					System.out.println("Aluno: "+aluno.getNome());
					System.out.println("Média do Aluno: "+aluno.CalculaMedia());
					System.out.println("Resultado: "+aluno.CalculaMedia1());
					System.out.println("-------------------------------------------------------");
			
		}
		System.out.println("------------------Lista Recuperacao----------------");
		for(Aluno aluno: maps.get(StatusAluno.RECUPERACAO)){
					System.out.println("Aluno: "+aluno.getNome());
					System.out.println("Média do Aluno: "+aluno.CalculaMedia());
					System.out.println("Resultado: "+aluno.CalculaMedia1());
					System.out.println("-------------------------------------------------------");
			
		}
		System.out.println("------------------Lista Reprovados----------------");
		for(Aluno aluno: maps.get(StatusAluno.REPROVADO)){
					System.out.println("Aluno: "+aluno.getNome());
					System.out.println("Média do Aluno: "+aluno.CalculaMedia());
					System.out.println("Resultado: "+aluno.CalculaMedia1());
					System.out.println("-------------------------------------------------------");
		}
		/*for(int pos = 0; pos < alunos.size();pos++) {
			Aluno aluno = alunos.get(pos);
			if(aluno.getNome().equalsIgnoreCase("Rodrigo")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Hibernate");
				disciplina.setNota(87);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos,trocar);
				aluno = alunos.get(pos);
				
			}
			System.out.println("Aluno: "+aluno.getNome());
			System.out.println("Média do Aluno: "+aluno.CalculaMedia());
			System.out.println("Resultado: "+aluno.CalculaMedia1());
			System.out.println("-----------------------------------------------");
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Disciplina: "+disciplina.getDisciplina()+" | Nota: "+disciplina.getNota());
				System.out.println("-----------------------------------------------");
			}
			for(int posd = 0; posd < aluno.getDisciplinas().size();posd++) {
				Disciplina disciplina = aluno.getDisciplinas().get(posd);
				System.out.println("Disciplina: "+disciplina.getDisciplina()+" | Nota: "+disciplina.getDisciplina());
				System.out.println("-----------------------------------------------");
				
			}
		}
		for(int pos = 0; pos < alunos.size();pos++) {
			Aluno aluno = alunos.get(pos);
			System.out.println("Aluno: "+aluno.getNome());
			System.out.println("Média do Aluno: "+aluno.CalculaMedia());
			System.out.println("Resultado: "+aluno.CalculaMedia1());
			System.out.println("-----------------------------------------------");
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Disciplina: "+disciplina.getDisciplina()+" | Nota: "+disciplina.getDisciplina());
				System.out.println("-----------------------------------------------");
			}
			for(int posd = 0; posd < aluno.getDisciplinas().size();posd++) {
				Disciplina disciplina = aluno.getDisciplinas().get(posd);
				System.out.println("Disciplina: "+disciplina.getDisciplina()+" | Nota: "+disciplina.getDisciplina());
				System.out.println("-----------------------------------------------");
				
			}	
		}
		
		Remover aluno da lista
		for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase("Rodrigo")) {
				alunos.remove(aluno);
				break;
			}else {
				System.out.println(aluno);
				System.out.println(aluno.CalculaMedia());
				System.out.println(aluno.CalculaMedia1());
				System.out.println("-----------------------------------------------");
				break;	
			}
		}
		
		//Procurando um aluno na lista
		   for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase("Rodrigo")) {
				System.out.println(aluno);
				System.out.println(aluno.CalculaMedia());
				System.out.println(aluno.CalculaMedia1());
				System.out.println("-----------------------------------------------");
				break;
			}
		}
		
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.toString());
			System.out.println(aluno.CalculaMedia());
			System.out.println(aluno.CalculaMedia1());
			System.out.println("-----------------------------------------------");
		}
		
		//System.out.println(aluno.toString());
		//System.out.println(aluno.CalculaMedia());
		//System.out.println(aluno.CalculaMedia1());
		//System.out.println(aluno.CalculaMedia2() ? "Aprovado" : "Reprovado");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("José");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("José");
		
		System.out.println(aluno1.equals(aluno2));
		
		System.out.println(aluno1.hashCode());
		System.out.println(aluno2.hashCode());*/
		
	}

}