package program;

import java.util.Scanner;


public class NivelHeroi {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		String nomeHeroi;
		int xp;
		
		boolean sair = false;		
		String nivel;
		
		while (!sair) {
			System.out.println("Digite o nome do herói (ou sair para terminar):");
			nomeHeroi = entradaDados.nextLine();
			
			if (nomeHeroi.equalsIgnoreCase("sair")) {
				entradaDados.close();
				System.out.println("Programa terminado");
				break;
			}
			
			System.out.println("Informe a quantidade de xp do herói:");
			xp = entradaDados.nextInt();
			entradaDados.nextLine();
			
			if (xp < 1000) {
				nivel = "Ferro";
			} else if (xp > 1001 && xp <= 2000) {
				nivel = "Bronze";
			} else if (xp > 2001 && xp <= 5000) {
				nivel = "Prata";
			} else if (xp > 5001 && xp <= 7000) {
				nivel = "Ouro";
			} else if (xp > 7001 && xp <= 8000) {
				nivel = "Platina";
			} else if (xp > 8001 && xp <= 9000) {
				nivel = "Ascendente";
			} else if (xp > 9001 && xp <= 10000) {
				nivel = "Imortal";
			} else {
				nivel = "Radiante";
			}
			
			System.out.printf("O herói de nome %s está no nível %s\n", nomeHeroi, nivel);
			
			
		}
	}
}
