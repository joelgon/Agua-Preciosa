/*
	Desenvolvedor: Joel Gonçalves;
	Disciplina: Implementação orientada a objetos;
*/

import java.io.*;
import java.util.Scanner;

public class AguaPreciosa{
	public static void main(String[] args) {
		Rural Rura;
		Urbano Urban;
		Scanner scanf = new Scanner(System.in);
		int op;
		
		do{
			System.out.println("Digite 1 Para Cliente Rural. \n Digite 2 Para Cliente Urbano.\n Digite 0 para sair.");
			op = scanf.nextInt();
			//Validar Entrada
			while(op < 0 && op > 2){
				System.out.println("Digite 1 Para Cliente Rural. \n Digite 2 Para Cliente Urbano.\n Digite 0 para sair.");
				op = scanf.nextInt();
			}

			switch(op){
				case 1:
					Rura = new Rural("Joel", "Av.Amazonas", 100, 100);
					Rura.CalcularValorLiquido();
					System.out.println("Valor: " + Rura.getValorLiquido());
				break;
				case 2:
					Urban = new Urbano("JoelME", "Av.Amazonas", 100, 100);
					Urban.CalcularValorLiquido();
					System.out.println("Valor: " + Urban.getValorLiquido());
				break;
			}
		}
		while(op != 0);
	} 
}