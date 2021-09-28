package classejava.executavel;

import javax.swing.JOptionPane;

import classes.java.Aluno;

public class ClasseExecutavel {
	
	public static void main(String[] args) {
		//O objeto ainda não existe na memoria
		/*Aluno aluno1;
		aluno1.
		
		Aluno aluno2 = new Aluno("Maria");
		System.out.println(aluno2.nome);
		Aluno aluno3 = new Aluno("Pedro");
		Aluno aluno4 = new Aluno("Laura",18);
		System.out.println("O nome é "+aluno4.nome+" e a idade é "+aluno4.idade);
		Aluno aluno5 = new Aluno();*/
		
		/*Aluno aluno = new Aluno();
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
		
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome: ");
		String idade = JOptionPane.showInputDialog("Qual idade: ");
		String disciplina1 = JOptionPane.showInputDialog("informe a disciplina1: ");
		String nota1 = JOptionPane.showInputDialog("informe a nota1: ");
		String disciplina2 = JOptionPane.showInputDialog("informe a disciplina2: ");
		String nota2 = JOptionPane.showInputDialog("informe a nota2: ");
		String disciplina3 = JOptionPane.showInputDialog("informe a disciplina3: ");
		String nota3 = JOptionPane.showInputDialog("informe a nota3: ");
		String disciplina4 = JOptionPane.showInputDialog("informe a disciplina4: ");
		String nota4 = JOptionPane.showInputDialog("informe a nota4: ");
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		
		aluno.setIdade(Integer.parseInt(idade));
		aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno.getDisciplina().setNota4 (Double.parseDouble(nota4));
		aluno.getDisciplina().setDisciplina1(disciplina1);
		aluno.getDisciplina().setDisciplina2(disciplina2);
		aluno.getDisciplina().setDisciplina3(disciplina3);
		aluno.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println(aluno.toString());
		//System.out.println(aluno.CalculaMedia());
		//System.out.println(aluno.CalculaMedia1());
		System.out.println(aluno.CalculaMedia2() ? "Aprovado" : "Reprovado");
		
		/*Aluno aluno1 = new Aluno();
		aluno1.setNome("José");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("José");
		
		System.out.println(aluno1.equals(aluno2));
		
		System.out.println(aluno1.hashCode());
		System.out.println(aluno2.hashCode());*/
		
	}

}
