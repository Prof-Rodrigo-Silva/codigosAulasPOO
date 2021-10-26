package classejava.executavel;

import java.util.Arrays;
import java.util.List;

public class Matriz {

	public static void main(String[] args) {
		
		/*int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 90;
		notas[1][0] = 50;
		notas[1][1] = 60;
		notas[1][2] = 95;
		
		//System.out.println(notas);
		
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				//System.out.println("Valor da matriz: "+notas[i][j]);
				System.out.println("["+notas[i][j]+"]");
			}
			System.out.println("\n");	
		}*/
		
		String texto = "Rodrigo, TADS, 80, 90, 78";
		
		String[] arrayString = texto.split(",");
		
		//System.out.println(arrayString);
		//System.out.println("Nome: "+arrayString[0]);
		
		//Converter array em uma lista
		List<String> list = Arrays.asList(arrayString);
		for(String array : list) {
			System.out.println(array);
		}
		
		//Converter de lista para array
		String[] converterArray = list.toArray(new String[6]);
		System.out.println(converterArray);

	}

}
