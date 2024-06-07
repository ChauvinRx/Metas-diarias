package M_D;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Meu_espaco {
	
	static ArrayList<Usuario> usuarios = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		
		while (true) {
		System.out.println("##### Metas diárias ##### \n" 
				+ "digite um número \n (1)registrar \n (2)login \n (3)sair");
		int x = sc.nextInt();
		sc.nextLine();
		if(x == 1) {
			registrar();
		}else if(x == 2) {
			login();
		}else if(x == 3) {
			break;
		}else {
			System.out.println("Opção não disponível");
		}
		
		
		}	
	}
	
	public static void login() {
		System.out.print("Email: ");
		String email = sc.nextLine();
		Usuario usuario = pesquisarLogin(email);
		
		if (usuario != null) {
            System.out.println("Olá, " + usuario.nome + "!");
            gerenciarTarefas(usuario);
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }
	
	public static void registrar() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Peso: ");
		double peso = sc.nextDouble();
		sc.nextLine(); // Consumir newline
		
		Usuario usuario = new Usuario(nome, email, peso);
		usuarios.add(usuario);
		System.out.println("Registro realizado");
		gerenciarTarefas(usuario);
	}
	
	public static Usuario pesquisarLogin(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.email.equals(email)) {
                return usuario;
            }
        }
        return null;
    }
	
	public static void gerenciarTarefas(Usuario usuario) {
		while (true) {
		System.out.println("(1) Adicionar Tarefa");
        System.out.println("(2) Listar Tarefas");
        System.out.println("(3) Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // Consumir newline

        if (opcao == 1) {
        	adicionarTarefa(usuario);
        } else if (opcao == 2) {
        	usuario.listarTarefas();
        } else if (opcao == 3) {
            break;
        } else {
            System.out.println("Opção inválida!");
        }
	}
}
	

	public static void adicionarTarefa(Usuario usuario) {
        System.out.print("Realizou atividades físicas hoje? (sim/não): ");
        char atividade = sc.next().charAt(0);
        char atividadeLetraMaiuscula = Character.toUpperCase(atividade);//converter 1° letra pra maiúscula
        boolean exercicios = (atividadeLetraMaiuscula == 'S');
        
        System.out.print("Realizou skin care? (sim/não): ");
        char skin = sc.next().charAt(0);
        char skinLetraMaiuscula = Character.toUpperCase(skin);//converter 1° letra pra maiúscula
        boolean skinCare = (skinLetraMaiuscula == 'S');
        
        System.out.print("Quantos litros de água bebeu?: ");
        double litrosDeAgua = sc.nextDouble();
        sc.nextLine(); // Consumir newline
        
        LocalDate dia = LocalDate.now();
        dia.format(dtf);

        Tarefas tarefa = new Tarefas(exercicios, skinCare, litrosDeAgua, dia);
        usuario.adicionarTarefa(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }
	

}
