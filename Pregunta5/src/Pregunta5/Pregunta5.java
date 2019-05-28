package Pregunta5;
import java.util.Scanner;
public class Pregunta5 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
        String word;
        String word1=""; 
        System.out.println("Ingrese un palabra: "); 
        word = teclado.nextLine(); 
        word=word.replaceAll(" ","");
        for (int i = word.length() - 1; i >= 0; i--) { 
            word1=word1+word.charAt(i); 
        } 
        if (word1.compareToIgnoreCase(word)==0) { 
            System.out.println("Es palindromo"); 
        }else{    
            System.out.println("No es palindromo");
        } 
	}

}
