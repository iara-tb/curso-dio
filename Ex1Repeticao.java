import java.util.Scanner;//importando biblioteca Scanner

public class Ex1Repeticao {
//Exerc�cio Bootcamp DIO - While
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		String nome;
		int idade;
		//Treinando estrutura de repeti��o While->teste no in�cio
		while(true) {
			System.out.println("Nome: ");
			nome=scan.next();//recebe nome
			if(nome.equals("0")) //interrope repeti��o se nome=0
			break;
			System.out.println("Idade: ");
			idade=scan.nextInt();//recebe valor inteiro correspondente a idade.
		}
		System.out.println("Sistema interrompeu repeti��o ap�s o 0 ser inserido no campo nome.");
			
		}
	}

