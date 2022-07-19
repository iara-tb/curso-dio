import java.util.Scanner;//importando biblioteca Scanner

public class Ex1Repeticao {
//Exercício Bootcamp DIO - While
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		String nome;
		int idade;
		//Treinando estrutura de repetição While->teste no início
		while(true) {
			System.out.println("Nome: ");
			nome=scan.next();//recebe nome
			if(nome.equals("0")) //interrope repetição se nome=0
			break;
			System.out.println("Idade: ");
			idade=scan.nextInt();//recebe valor inteiro correspondente a idade.
		}
		System.out.println("Sistema interrompeu repetição após o 0 ser inserido no campo nome.");
			
		}
	}

