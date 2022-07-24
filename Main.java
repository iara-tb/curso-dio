import java.time.LocalDateTime;

import dominio.Curso;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// Desafio Code Girls- DIO /F1RST Santander
	
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(50);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setDate(LocalDateTime.now());
		
		
		//Só temos acesso aos atributos de Curso e Mentoria com getters and setters.
		
		Curso curso2 = new Curso();
		curso1.setTitulo("Curso js");
		curso1.setDescricao("descrição curso js");
		curso1.setCargaHoraria(8);
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		

	}

}
