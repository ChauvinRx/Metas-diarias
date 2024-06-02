package M_D;

import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private String email;
	private double peso;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
