/*teste */
import java.util.*;   
import java.util.Arrays;
import java.lang.*;
// create class to split string by blanck space   
public class Main {   
      
    // main() method start   
    public static void main(String[] args) {
          
        String str1, str2;   
          
        // create Scanner class object to take input from user   
        Scanner sc = new Scanner(System.in);   
          
        // take input from the user for str1 and str2   
        System.out.println("Digite código,quantidade e valor da peça 1 serparados por espaço: ");   
        str1 = sc.nextLine();   
          
        System.out.println("Digite código,quantidade e valor da peça 2 serparados por espaço: ");   
        str2 = sc.nextLine();   
          
        // use split(regex) and split(regex, limit) methods    
        String[] str1Array = str1.split(" ");   
          
        String[] str2Array = str2.split(" ");   
         
        // in this part I converted the data from the arrays in Integer and float types
        int cod1 = Integer.parseInt(str1Array[0]);
        int quantidade1=Integer.parseInt(str1Array[1]);
        float valor1=Float.parseFloat(str1Array[2]);
        float total1=(quantidade1*valor1);
        int cod2 = Integer.parseInt(str2Array[0]);
        int quantidade2=Integer.parseInt(str2Array[1]);
        float valor2=Float.parseFloat(str2Array[2]);
        float total2=(quantidade2*valor2);
        
        
        float custo =(total1+total2);
        System.out.printf("VALOR A PAGAR: R$ %.2f ",custo);
       
        }

  }
