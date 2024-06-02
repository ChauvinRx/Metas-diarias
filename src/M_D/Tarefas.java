package M_D;

import java.time.LocalDate;

public class Tarefas {
	
	private boolean exercicios;
	private boolean skinCare;
	private double litrosDeAgua;
	private LocalDate dia;
	
	public Tarefas(boolean exercicios, boolean skinCare, double litrosDeAgua, LocalDate dia) {
		this.exercicios = exercicios;
		this.skinCare = skinCare;
		this.litrosDeAgua = litrosDeAgua;
		this.dia = dia;
	}

	public boolean isExercicios() {
		return exercicios;
	}

	public void setExercicios(boolean exercicios) {
		this.exercicios = exercicios;
	}

	public boolean isSkinCare() {
		return skinCare;
	}

	public void setSkinCare(boolean skinCare) {
		this.skinCare = skinCare;
	}

	public double getLitrosDeAgua() {
		return litrosDeAgua;
	}

	public void setLitrosDeAgua(double litrosDeAgua) {
		this.litrosDeAgua = litrosDeAgua;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	

}
