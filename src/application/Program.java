package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		Champion champion1 = new Champion(name, life, attack, armor);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nameSecondary = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeSecondary = sc.nextInt();
		System.out.print("Ataque: ");
		int attackSecondary = sc.nextInt();
		System.out.print("Armadura: ");
		int armorSecondary = sc.nextInt();

		Champion champion2 = new Champion(nameSecondary, lifeSecondary, attackSecondary, armorSecondary);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int shifts = sc.nextInt();
		
		for (int i = 0; i < shifts; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			System.out.println();
			System.out.printf("Resultado do turno %d: %n ", i+1);
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			
			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				break;
			}
			
		}
		
		System.out.println();
		System.out.print("FIM DO COMBATE");
		
		
		sc.close();
	}

}
