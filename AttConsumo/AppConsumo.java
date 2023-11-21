package AttConsumo;

import java.util.InputMismatchException;

import java.util.Scanner;

public class AppConsumo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valorConsumo;
		do {
			try {
				System.out.print("Valor do Consumo: ");
				valorConsumo = Double.parseDouble(input.nextLine());	
			}
			
			catch(NumberFormatException erro){
				System.out.println("Valor do consumo deve ser numérico!");
				continue;
			}
			break;
		}while(true);
		
		char tipoCliente;
		do {
			System.out.print("Tipo do Cliente[A/F/P]: ");
			tipoCliente= input.nextLine().charAt(0);	
			tipoCliente = Character.toUpperCase(tipoCliente);
			if(tipoCliente != 'A' && tipoCliente != 'F' && tipoCliente != 'P') {
				System.out.println("Tipo inválido!");
				continue;
			}
			break;
		}while(true);
		
		char tipoConsumo; 
		
		do {
			System.out.print("Tipo do Consumo[C/P]: ");
			tipoConsumo= input.nextLine().charAt(0);	
			tipoConsumo = Character.toUpperCase(tipoConsumo);
			if(tipoConsumo != 'C' && tipoConsumo != 'P') {
				System.out.println("Tipo inválido!");
				continue;
			}
			break;
		}while(true);
		
		if(tipoConsumo == 'C') {
			Consumo consumo = new Consumo(valorConsumo);
			System.out.println(consumo);
		}
		if(tipoConsumo == 'P') {
			Consumo consumo = new Consumo(valorConsumo, tipoCliente);
			System.out.println(consumo);
		}
		
		input.close();
	}

}
