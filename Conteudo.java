package dominio;

public abstract class Conteudo {
	
  protected static final double XP_PADRAO=10d;
  //é estatico porque poderei acessar esse XP_PADRAO fora da classe conteudo.
  
  private String titulo;
  private String descricao;
  
  public abstract double calcularXp();
  //o significado deste abstract é que não consigo instanciar o conteúdo.
  //Feito para criar as classes filhas evitando repetição de código - herança.

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}
  
  
}
