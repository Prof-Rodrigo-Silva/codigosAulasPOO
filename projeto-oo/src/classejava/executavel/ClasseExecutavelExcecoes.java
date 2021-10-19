package classejava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import atributos.estaticos.StatusAluno;
import classes.java.Aluno;
import classes.java.Disciplina;
import classes.java.Secretario;
import classesauxiliares.FuncaoAutenticacao;
import interfaces.PermitirAcesso;

public class ClasseExecutavelExcecoes {

	public static void main(String[] args) {
		
		
		try {
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		PermitirAcesso permitirAcesso = new Secretario(login,senha);
		
		if(new FuncaoAutenticacao(new Secretario(login,senha)).autenticarAcesso()) {
			
			//List<Aluno> alunos = new ArrayList<Aluno>();
			List<Aluno> alunos = null;
		
			List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			List<Aluno> alunosReprovados = new ArrayList<Aluno>();
			
			//É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			for( int qtd = 1; qtd <= 2; qtd++) {
			
				String nome = JOptionPane.showInputDialog("Qual o nome? ");
				String idade = JOptionPane.showInputDialog("Qual idade? ");
				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setIdade(Integer.parseInt(idade));
				
				for(int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome  da Disciplina "+pos+" ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
					
					Disciplina disciplina = new Disciplina();
					
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.parseDouble(notaDisciplina));
					
					aluno.getDisciplinas().add(disciplina);
				}
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
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		}catch (NullPointerException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ocorreu um erro..."+e.getClass());
			
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ocorreu um erro..."+e.getClass());
			
		}
		
		catch (Exception e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null, "Ocorreu um erro...");
			System.out.println("Mensagem: "+e.getMessage());
			//e.getStackTrace(); retorna um Arry
			
			/*for(int i = 0; i < e.getStackTrace().length;i++) {
				System.out.println("Classe de erro : "+e.getStackTrace()[i].getClassName());
				System.out.println("Método de erro : "+e.getStackTrace()[i].getMethodName());
				System.out.println("Linha de erro : "+e.getStackTrace()[i].getLineNumber());	
			}*/
			
			for(int i = 0; i < e.getStackTrace().length;i++) {
				saida.append("\n Classe de erro : "+e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro : "+e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro : "+e.getStackTrace()[i].getLineNumber());	
			}
			JOptionPane.showMessageDialog(null, "Ocorreu um erro..."+saida.toString());	
		}

	}

}
