package classejava.executavel;

import javax.swing.JOptionPane;

import classes.java.Aluno;
import classes.java.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		//double notas[]= new double[4];
		//double[] notas = new double[4];
		/*notas[0] = 9.8;
		notas[1] = 8;
		notas[2] = 7.33;
		notas[3] = 6.78;
	
		
		//System.out.println(notas);
		System.out.println("Notas 1: "+notas[0]);
		System.out.println("Notas 2: "+notas[1]);
		System.out.println("Notas 3: "+notas[2]);
		System.out.println("Notas 4: "+notas[3]);

		System.out.println("----------------------------------");
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Nota "+(i+1)+" é: "+notas[i]);
		}
		System.out.println("----------------------------------");
		
		String tamanho = JOptionPane.showInputDialog("Quantas posições o array deve ter? ");
		double[] notas = new double[Integer.parseInt(tamanho)];
		
		for(int i = 0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição= "+i);
			notas[i] = Double.parseDouble(valor);
		}
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota "+(i+1)+" é: "+notas[i]);
		}
		int[] ints = new int[3];
		float[] floats = new float[1001];
		
		String[] valores = {"Rodrigo","39","profrodrigorosadasilva@gmail.com","55.387,00"};
		for(int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}*/
		
		double[] notasJAVA = {8.8,9.7,7.6,6.8};
		double[] notasPHP = {7.1,9.7,7.6,8};
	
		Aluno aluno = new Aluno();
		
		aluno.setNome("Rodrigo");
		aluno.setNomeEscola("Dinarte Ribeiro");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("JAVA");
		disciplina.setNota(notasJAVA);
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("PHP");
		disciplina1.setNota(notasPHP);
		aluno.getDisciplinas().add(disciplina1);
		
		/*System.out.println("Nome do aluno = "+aluno.getNome());
		System.out.println("Escola = "+aluno.getNomeEscola());
		System.out.println("----------------DISCIPLINAS DO ALUNO----------------------");
		for(Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina = "+disc.getDisciplina());
			System.out.println("--NOTAS DA DISCIPLINA--");
			
			double notaMax = 0, notaMin = 0;
			for(int i = 0; i<disc.getNota().length;i++) {
				System.out.println("Nota "+i+" = "+disc.getNota()[i]);
				
				if(i == 0) {
					notaMax = disc.getNota()[i];
				}else {
					if(disc.getNota()[i] > notaMax) {
						notaMax = disc.getNota()[i];
					}
				}
				if(i == 0) {
					notaMin = disc.getNota()[i];
				}else {
					if(disc.getNota()[i] < notaMin) {
						notaMin = disc.getNota()[i];
					}
				}
			}
			System.out.println("A maior nota de "+disc.getDisciplina()+" é de: "+notaMax);
			System.out.println("A menor nota de "+disc.getDisciplina()+" é de: "+notaMin);
		}*/
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length;pos++) {
			
			System.out.println("Nome do aluno: "+arrayAlunos[pos].getNome());
			
			for(Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
				
				System.out.println("Nome da disciplina: "+disc.getDisciplina());
				
				for(int posnota = 0; posnota < disc.getNota().length;posnota++) {
					
					System.out.println("A nota n° "+(posnota+1) + " é = "+disc.getNota()[posnota]);
				}
			
			}
		}
	}

}
