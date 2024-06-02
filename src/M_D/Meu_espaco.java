package M_D;

import java.util.ArrayList;
import java.util.Scanner;

public class Meu_espaco {

	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("##### Metas diárias ##### \n" 
				+ "digite um número \n (1)registrar \n (2)login");
		int x = sc.nextInt();
		sc.nextLine();
		
		
	sc.close();
	}
	
	public void registrar() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Peso: ");
		double peso = sc.nextDouble();
		Usuario user = new Usuario(nome, email, peso);
		usuarios.add(user);
		System.out.println("Registro realizado");
	}
	

}
