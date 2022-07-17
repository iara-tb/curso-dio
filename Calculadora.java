
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//para receber dados do usuário.

		double a,b;
		System.out.println("Bem vindo a Calculadora, por favor,insira dois números reais!");
		System.out.println("Digite o primeiro valor:");
		a=scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b=scan.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
		
	}
	/*Optei por usar double em vez de int porque assim o usuário poderia efetuar 
	 * operações com números reais 
	 */
public static double soma(double a,double b) {
	return a+b;
	}
public static double subtracao(double a,double b) {
	return a-b;
	}
public static double multiplicacao(double a,double b) {
	return a*b;
	}
public static double divisao(double a,double b) {
	return a/b;
	}

}

