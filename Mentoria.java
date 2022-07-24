package dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{
	//a classe Mentoria é filha da classe conteudo

private LocalDateTime date;//Devemos usar LocalDate ou LocalDateTime  - para trabalharmos com data.
//Encapsulando atributos

@Override
public double calcularXp() {
	return XP_PADRAO +20d;
	
}
public Mentoria() {
	
}


public void setDate(LocalDateTime date) {
	this.date = date;
}


@Override
public String toString() {
	return "Mentoria [titulo=" + getTitulo() +", descricao=" + getDescricao() + ",date="+ date;
}
}
