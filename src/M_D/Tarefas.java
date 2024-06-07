package M_D;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarefas {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	boolean exercicios;
	boolean skinCare;
	double litrosDeAgua;
	LocalDate dia;
	
	public Tarefas(boolean exercicios, boolean skinCare, double litrosDeAgua, LocalDate dia) {
		this.exercicios = exercicios;
		this.skinCare = skinCare;
		this.litrosDeAgua = litrosDeAgua;
		this.dia = dia;
	}


	@Override
	public String toString() {
		return "[Tarefas]: exercicios= " + exercicios +
				", skinCare= " + skinCare +
				", litrosDeAgua= " + litrosDeAgua + "L"
				+ ", dia= |" + dia.format(dtf) + "|";
	}
	
	

}
