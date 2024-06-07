package M_D;

import java.util.ArrayList;

public class Usuario {
	
	String nome;
	String email;
	double peso;
	ArrayList<Tarefas> tarefas;
	
	
	public Usuario(String nome, String email, double peso) {
		this.nome = nome;
		this.email = email;
		this.peso = peso;
		this.tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(Tarefas tarefa) {
		tarefas.add(tarefa);
    }
	
	public void listarTarefas() {
        for (Tarefas tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

}
